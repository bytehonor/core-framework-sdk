package com.bytehonor.sdk.define.bytehonor.result;

/**
 * @author lijianqiang
 *
 */
public class LongData {

    private Long result;
    
    public static LongData of(Long result) {
        return new LongData(result);
    }

    public LongData(Long result) {
        this.result = result;
    }

    public LongData() {
        this(null);
    }

    public Long getResult() {
        return result;
    }

    public void setResult(Long result) {
        this.result = result;
    }

}
