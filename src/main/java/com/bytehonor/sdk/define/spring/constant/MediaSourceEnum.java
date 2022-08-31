package com.bytehonor.sdk.define.spring.constant;

/**
 * 媒体机构
 * 
 * @author lijianqiang
 *
 */
public enum MediaSourceEnum {

    UNDEFINED("undefined", "未知媒体"),

    BYTE_HONOR("byte_honor", "字节荣耀"),

    SINA_WEIBO("sina_weibo", "新浪微博"),

    PEOPLE_NEWS_WEB("people_news_web", "人民网网站"),

    QDAILY_NEWS_WEB("qdaily_news_web", "好奇心日报网站"),

    SOHU_NEWS_WEB("sohu_news_web", "搜狐新闻网站"),

    IFENG_NEWS_WEB("ifeng_news_web", "凤凰新闻网站"),

    THEPAPER_NEWS_WEB("thepaper_news_web", "澎湃新闻网站"),
    
    SINA_FINANCE_WEB("sina_finance_web", "新浪财经网站"),
    
    HUOXING_FINANCE_WEB("huoxing_finance_web", "火星财经网站"),
    
    JINSE_FINANCE_WEB("jinse_finance_web", "金色财经网站"),

    TWITTER("twitter", "Twitter"),
    ;

    private String key;

    private String name;

    private MediaSourceEnum(String key, String name) {
        this.key = key;
        this.name = name;
    }

    public static MediaSourceEnum keyOf(String key) {
        for (MediaSourceEnum sc : MediaSourceEnum.values()) {
            if (sc.key.equals(key)) {
                return sc;
            }
        }
        return BYTE_HONOR;
    }

    public static MediaSourceEnum nameOf(String name) {
        for (MediaSourceEnum sc : MediaSourceEnum.values()) {
            if (sc.name.equals(name)) {
                return sc;
            }
        }
        return BYTE_HONOR;
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
