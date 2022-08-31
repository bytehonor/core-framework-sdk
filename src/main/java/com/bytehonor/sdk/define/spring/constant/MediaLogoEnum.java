package com.bytehonor.sdk.define.spring.constant;

/**
 * 媒体机构LOGO
 * 
 * @author lijianqiang
 *
 */
public enum MediaLogoEnum {

    BYTE_HONOR("字节荣耀", "https://mdn.bytehonor.com/res/media/bytehonor_logo.jpg"),

    SINA_WEIBO("新浪微博", "https://mdn.bytehonor.com/res/media/weibo_logo.jpg"),

    PEOPLE_NEWS_WEB("人民网网站", "https://mdn.bytehonor.com/res/media/people_logo.jpeg"),

    QDAILY_NEWS_WEB("好奇心日报网站", "https://mdn.bytehonor.com/res/media/qdail_logo.jpeg"),

    SOHU_NEWS_WEB("搜狐新闻网站", "https://mdn.bytehonor.com/res/media/sohu_logo.jpeg"),

    IFENG_NEWS_WEB("凤凰新闻网站", "https://mdn.bytehonor.com/res/media/ifeng_logo.jpg"),

    THEPAPER_NEWS_WEB("澎湃新闻网站", "https://mdn.bytehonor.com/res/media/thepaper_logo.jpeg"),

    SINA_FINANCE_WEB("新浪财经网站", "https://mdn.bytehonor.com/res/media/weibo_logo.jpg"),

    HUOXING_FINANCE_WEB("火星财经网站", "https://mdn.bytehonor.com/res/media/huoxing_logo.png"),

    TWITTER("Twitter", "https://mdn.bytehonor.com/res/media/twitter_logo.jpg");

    ;

    private String name;

    private String url;

    private MediaLogoEnum(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public static MediaLogoEnum nameOf(String name) {
        for (MediaLogoEnum sc : MediaLogoEnum.values()) {
            if (sc.name.equals(name)) {
                return sc;
            }
        }
        return BYTE_HONOR;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
