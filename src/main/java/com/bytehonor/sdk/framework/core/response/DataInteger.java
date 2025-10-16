package com.bytehonor.sdk.framework.core.response;

import java.io.Serializable;

/**
 * @author lijianqiang
 *
 */
public class DataInteger implements Serializable {

    private static final long serialVersionUID = -3592186356812066966L;

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
