package com.bytehonor.sdk.define.bytehonor.constant;

/**
 * 
 * @author lijianqiang
 *
 */
public enum OauthTerminalEnum {

    BROWSER("browser", "浏览器"),

    BYTEHONOR_SERVER_VPN("bytehonor.server.vpn", "bytehonor.server.vpn的SERVER端"),

    BYTEHONOR_SERVER_PROXY("bytehonor.server.proxy", "bytehonor.server.proxy的SERVER端"),

    BYTEHONOR_WEB_WWW("bytehonor.web.www", "bytehonor.web.www的WEB端"),

    BYTEHONOR_WEB_ADMIN("bytehonor.web.admin", "bytehonor.web.admin的WEB端"),

    BYTEHONOR_WEB_VUE("bytehonor.web.vue", "bytehonor.web.vue的WEB端"),

    BYTEHONOR_WEB_MOBILE("bytehonor.web.m", "bytehonor.web.m的WEB端"),

    TODAYMAIN_WEB_WWW("todaymain.web.www", "todaymain.web.www的WEB端"),

    TODAYMAIN_WEB_MOBILE("todaymain.web.m", "todaymain.web.m的WEB端"),

    WEIXIN_MA_NEWS("weixin-ma-wx6606ed97cb1b17e1", "微信小程序.全网重点"),

    ;

    private String key;

    private String name;

    private OauthTerminalEnum(String key, String name) {
        this.key = key;
        this.name = name;
    }

    public static OauthTerminalEnum keyOf(String key) {
        if (key == null) {
            return BROWSER;
        }
        key = key.toLowerCase();
        for (OauthTerminalEnum item : OauthTerminalEnum.values()) {
            if (item.getKey().equals(key)) {
                return item;
            }
        }
        return BROWSER;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
