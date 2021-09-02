package com.bytehonor.sdk.define.bytehonor.util;

public class UserGuidUtils {

    public static String guidWeixin(String appid, String openid) {
        return MD5Utils.md5(new StringBuilder().append(appid).append(":").append(openid).toString());
    }

    public static String guidWeibo(Long uid) {
        return MD5Utils.md5(new StringBuilder().append("weibo").append(":").append(uid).toString());
    }
}
