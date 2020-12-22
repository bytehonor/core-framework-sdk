package com.bytehonor.sdk.basic.define.result;

/**
 * @author lijianqiang
 *
 */
public class LongResultVO {

    private Long result;

    public LongResultVO(Long result) {
        this.result = result;
    }

    public LongResultVO() {
        this(null);
    }

    public Long getResult() {
        return result;
    }

    public void setResult(Long result) {
        this.result = result;
    }

}
