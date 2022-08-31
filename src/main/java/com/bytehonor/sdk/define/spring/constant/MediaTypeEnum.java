package com.bytehonor.sdk.define.spring.constant;

public enum MediaTypeEnum {

    HTML("html", "网页html"),

    IMAGE("image", "图片"),
    
    IMG("img", "图片"),
    
    DOC("doc", "文档"),
    
    VIDEO_COVER("video/img", "视频封面"),

    VIDEO_XXHD("video/xxhd", "视频1080p"),

    VIDEO_XHD("video/xhd", "视频xhd"),

    VIDEO_HD("video/hd", "视频hd"),

    VIDEO_LD("video/ld", "视频ld"),

    ;

    private String key;

    private String name;

    private MediaTypeEnum(String key, String name) {
        this.key = key;
        this.name = name;
    }

    public static MediaTypeEnum keyOf(String key) {
        if (key == null || key.isEmpty()) {
            return null;
        }
        for (MediaTypeEnum e : MediaTypeEnum.values()) {
            if (e.getKey().equals(key)) {
                return e;
            }
        }
        return null;
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
