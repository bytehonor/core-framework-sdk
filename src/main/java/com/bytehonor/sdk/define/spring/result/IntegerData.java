package com.bytehonor.sdk.define.spring.result;

/**
 * @author lijianqiang
 *
 */
public class IntegerData {

    private Integer result;
    
    public static IntegerData of(Integer result) {
        return new IntegerData(result);
    }

    public IntegerData(Integer result) {
        this.result = result;
    }

    public IntegerData() {
        this(null);
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

}
