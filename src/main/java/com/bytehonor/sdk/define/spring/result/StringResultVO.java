package com.bytehonor.sdk.define.spring.result;

import com.bytehonor.sdk.define.spring.code.StandardCode;

/**
 * @author lijianqiang
 *
 */
public class StringResultVO {

    private String result;

    public static StringResultVO ok() {
        return new StringResultVO();
    }

    public static StringResultVO of(String result) {
        return new StringResultVO(result);
    }

    public StringResultVO(String result) {
        this.result = result;
    }

    public StringResultVO() {
        this(StandardCode.SUCCESS);
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
