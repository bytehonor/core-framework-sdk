package com.bytehonor.sdk.define.spring.constant;

/**
 * 
 * @author lijianqiang
 *
 */
public enum WeiboAppEnum {

    BYTE_PARSE("1910259602", "字节解析"),

//    CHUNQIU_ZHANGUO("2580540229", "春秋战国的人"),

//    WE_FUZER("841203748", "我们都是福大人"),
    
    AI_EXPLORE("4098081443", "人工智能探索"),

    ;

    private String key;

    private String name;

    private WeiboAppEnum(String key, String name) {
        this.key = key;
        this.name = name;
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
