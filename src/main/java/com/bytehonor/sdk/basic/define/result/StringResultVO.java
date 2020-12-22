package com.bytehonor.sdk.basic.define.result;

/**
 * @author lijianqiang
 *
 */
public class StringResultVO {

    private String result;

    public StringResultVO(String result) {
        this.result = result;
    }

    public StringResultVO() {
        this("OK");
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
