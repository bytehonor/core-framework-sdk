package com.bytehonor.sdk.define.spring.result;

/**
 * @author lijianqiang
 *
 */
public class BooleanData {

    private Boolean result;

    public static BooleanData of(Boolean result) {
        return new BooleanData(result);
    }

    public BooleanData(Boolean result) {
        this.result = result;
    }

    public BooleanData() {
        this(false);
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

}
