package com.bytehonor.sdk.define.spring.response;

/**
 * @author lijianqiang
 *
 */
public class DataBoolean {

    private Boolean result;

    public static DataBoolean of(Boolean result) {
        return new DataBoolean(result);
    }

    public DataBoolean(Boolean result) {
        this.result = result;
    }

    public DataBoolean() {
        this(false);
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

}
