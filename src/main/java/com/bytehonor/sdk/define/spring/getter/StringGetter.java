package com.bytehonor.sdk.define.spring.getter;

import com.bytehonor.sdk.define.spring.util.StringObject;

/**
 * @author lijianqiang
 *
 */
public class StringGetter {

    public static String optional(String src, String def) {
        return src != null ? src : def;
    }

    public static String getOrNull(String src) {
        return StringObject.isEmpty(src) ? null : src;
    }

}
