package com.bytehonor.sdk.define.spring.response;

/**
 * @author lijianqiang
 *
 */
public class DataLong {

    private Long result;

    public static DataLong of(Long result) {
        return new DataLong(result);
    }

    public DataLong(Long result) {
        this.result = result;
    }

    public DataLong() {
        this(null);
    }

    public Long getResult() {
        return result;
    }

    public void setResult(Long result) {
        this.result = result;
    }

}
