package com.bytehonor.sdk.define.spring.response;

/**
 * @author lijianqiang
 *
 */
public class DataInteger {

    private Integer result;
    
    public static DataInteger of(Integer result) {
        return new DataInteger(result);
    }

    public DataInteger(Integer result) {
        this.result = result;
    }

    public DataInteger() {
        this(null);
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

}
