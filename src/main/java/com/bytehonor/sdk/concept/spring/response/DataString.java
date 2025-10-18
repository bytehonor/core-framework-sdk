package com.bytehonor.sdk.concept.spring.response;

import java.io.Serializable;

import com.bytehonor.sdk.concept.spring.code.StandardCode;

/**
 * @author lijianqiang
 *
 */
public class DataString implements Serializable {

    private static final long serialVersionUID = -2026720210560037542L;

    private String result;

    public static DataString ok() {
        return new DataString();
    }

    public static DataString of(String result) {
        return new DataString(result);
    }

    public DataString(String result) {
        this.result = result;
    }

    public DataString() {
        this(StandardCode.SUCCESS);
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
