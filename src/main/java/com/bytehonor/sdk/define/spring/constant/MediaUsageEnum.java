package com.bytehonor.sdk.define.spring.constant;

public enum MediaUsageEnum {

    NEWS("news", "新闻"),

    BEAUTY("beauty", "美女"),

    HUMOR("humor", "搞笑"),

    MUSIC("music", "音乐"),

    MOVIE("movie", "电影"),

    STAR("star", "明星"),

    ANIMATION("animation", "动漫"),

    AVATAR("avatar", "头像"),
    
    TWITTER("twitter", "TWITTER"),

    PAY("pay", "支付"),
    
    FINANCE("finance", "金融"),
    
    REPORT("report", "报告"),

    ;

    private String key;

    private String name;

    private MediaUsageEnum(String key, String name) {
        this.key = key;
        this.name = name;
    }

    public static MediaUsageEnum keyOf(String key) {
        if (key == null || key.isEmpty()) {
            return NEWS;
        }
        for (MediaUsageEnum e : MediaUsageEnum.values()) {
            if (e.getKey().equals(key)) {
                return e;
            }
        }
        return NEWS;
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
