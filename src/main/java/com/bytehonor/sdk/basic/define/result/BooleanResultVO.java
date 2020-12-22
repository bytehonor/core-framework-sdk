package com.bytehonor.sdk.basic.define.result;

/**
 * @author lijianqiang
 *
 */
public class BooleanResultVO {

    private Boolean result;

    public BooleanResultVO(Boolean result) {
        this.result = result;
    }

    public BooleanResultVO() {
        this(false);
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

}
