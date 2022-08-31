package com.bytehonor.sdk.define.spring.constant;

/**
 * 
 * @author lijianqiang
 *
 */
public enum WeiboUserEnum {

    TODAY_MAIN(6926438705L, "全网重点"),

    OURAN_DEQIANG(2137040273L, "偶然的强"),

    ZIJIE_JIEXI(6562255755L, "字节解析"),

    BYTEHONOR(7245889149L, "字节荣耀"),

    QUANWANG_YANKONG(7435169584L, "全网颜控"),
    ;

    private Long key;

    private String name;

    private WeiboUserEnum(Long key, String name) {
        this.key = key;
        this.name = name;
    }

    public static WeiboUserEnum keyOf(Long key) {
        if (key == null) {
            return null;
        }
        for (WeiboUserEnum sc : WeiboUserEnum.values()) {
            if (key.equals(sc.getKey())) {
                return sc;
            }
        }
        return null;
    }

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
