package com.bytehonor.sdk.define.bytehonor.constant;

/**
 * 
 * @author lijianqiang
 *
 */
public enum OauthRoleEnum {

    UNKNOWN("unkonwn", "未定义"),

    USER("user", "外部用户"),

    ADMIN("admin", "管理员"),

    DEVELOP("develop", "开发"),
    
    SERVER("server", "SERVER"),

    ;

    private String key;

    private String name;

    private OauthRoleEnum(String key, String name) {
        this.key = key;
        this.name = name;
    }

    public static OauthRoleEnum keyOf(String key) {
        if (key == null) {
            return UNKNOWN;
        }
        key = key.toLowerCase();
        for (OauthRoleEnum item : OauthRoleEnum.values()) {
            if (item.getKey().equals(key)) {
                return item;
            }
        }
        return UNKNOWN;
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
