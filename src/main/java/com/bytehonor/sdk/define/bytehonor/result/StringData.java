package com.bytehonor.sdk.define.bytehonor.result;

import com.bytehonor.sdk.define.bytehonor.code.StandardCode;

/**
 * @author lijianqiang
 *
 */
public class StringData {

    private String result;

    public static StringData ok() {
        return new StringData();
    }

    public static StringData of(String result) {
        return new StringData(result);
    }

    public StringData(String result) {
        this.result = result;
    }

    public StringData() {
        this(StandardCode.SUCCESS);
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
