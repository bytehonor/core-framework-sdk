package com.bytehonor.sdk.define.spring.query;

import java.util.Collection;

import com.bytehonor.sdk.define.spring.constant.JavaValueTypes;
import com.bytehonor.sdk.define.spring.constant.SqlOperator;

public class MatchColumn {

    private String key;

    private Object value;

    /**
     * java type
     */
    private String type;

    private SqlOperator operator;

    /**
     * 
     * <pre>
     * 等于
     * </pre>
     * 
     * @param key
     * @param value
     * @return
     */
    public static MatchColumn eq(String key, String value) {
        return new MatchColumn(key, value, JavaValueTypes.STRING, SqlOperator.EQ);
    }

    /**
     * 
     * <pre>
     * 等于
     * </pre>
     * 
     * @param key
     * @param value
     * @return
     */
    public static MatchColumn eq(String key, Long value) {
        return new MatchColumn(key, value, JavaValueTypes.LONG, SqlOperator.EQ);
    }

    /**
     * 
     * <pre>
     * 等于
     * </pre>
     * 
     * @param key
     * @param value
     * @return
     */
    public static MatchColumn eq(String key, Integer value) {
        return new MatchColumn(key, value, JavaValueTypes.INTEGER, SqlOperator.EQ);
    }

    /**
     * 
     * <pre>
     * 等于
     * </pre>
     * 
     * @param key
     * @param value
     * @return
     */
    public static MatchColumn eq(String key, Boolean value) {
        return new MatchColumn(key, value, JavaValueTypes.BOOLEAN, SqlOperator.EQ);
    }

    /**
     * 
     * <pre>
     * 不等于
     * </pre>
     * 
     * @param key
     * @param value
     * @return
     */
    public static MatchColumn neq(String key, String value) {
        return new MatchColumn(key, value, JavaValueTypes.STRING, SqlOperator.NEQ);
    }

    /**
     * 
     * <pre>
     * 不等于
     * </pre>
     * 
     * @param key
     * @param value
     * @return
     */
    public static MatchColumn neq(String key, Long value) {
        return new MatchColumn(key, value, JavaValueTypes.LONG, SqlOperator.NEQ);
    }

    /**
     * 
     * <pre>
     * 不等于
     * </pre>
     * 
     * @param key
     * @param value
     * @return
     */
    public static MatchColumn neq(String key, Integer value) {
        return new MatchColumn(key, value, JavaValueTypes.INTEGER, SqlOperator.NEQ);
    }

    /**
     * 
     * <pre>
     * 不等于
     * </pre>
     * 
     * @param key
     * @param value
     * @return
     */
    public static MatchColumn neq(String key, Boolean value) {
        return new MatchColumn(key, value, JavaValueTypes.BOOLEAN, SqlOperator.NEQ);
    }

    /**
     * <pre>
     * 大于
     * </pre>
     * 
     * @param key
     * @param value
     * @return
     */
    public static MatchColumn gt(String key, Long value) {
        return new MatchColumn(key, value, JavaValueTypes.LONG, SqlOperator.GT);
    }

    /**
     * <pre>
     * 大于
     * </pre>
     * 
     * @param key
     * @param value
     * @return
     */
    public static MatchColumn gt(String key, Integer value) {
        return new MatchColumn(key, value, JavaValueTypes.INTEGER, SqlOperator.GT);
    }

    /**
     * <pre>
     * 大于等于
     * </pre>
     * 
     * @param key
     * @param value
     * @return
     */
    public static MatchColumn egt(String key, Long value) {
        return new MatchColumn(key, value, JavaValueTypes.LONG, SqlOperator.EGT);
    }

    /**
     * <pre>
     * 大于等于
     * </pre>
     * 
     * @param key
     * @param value
     * @return
     */
    public static MatchColumn egt(String key, Integer value) {
        return new MatchColumn(key, value, JavaValueTypes.INTEGER, SqlOperator.EGT);
    }

    /**
     * <pre>
     * 小于
     * </pre>
     * 
     * @param key
     * @param value
     * @return
     */
    public static MatchColumn lt(String key, Long value) {
        return new MatchColumn(key, value, JavaValueTypes.LONG, SqlOperator.LT);
    }

    /**
     * <pre>
     * 小于
     * </pre>
     * 
     * @param key
     * @param value
     * @return
     */
    public static MatchColumn lt(String key, Integer value) {
        return new MatchColumn(key, value, JavaValueTypes.INTEGER, SqlOperator.LT);
    }

    /**
     * <pre>
     * 小于等于
     * </pre>
     * 
     * @param key
     * @param value
     * @return
     */
    public static MatchColumn elt(String key, Long value) {
        return new MatchColumn(key, value, JavaValueTypes.LONG, SqlOperator.ELT);
    }

    /**
     * <pre>
     * 小于等于
     * </pre>
     * 
     * @param key
     * @param value
     * @return
     */
    public static MatchColumn elt(String key, Integer value) {
        return new MatchColumn(key, value, JavaValueTypes.INTEGER, SqlOperator.ELT);
    }

    public static MatchColumn like(String key, String value) {
        return new MatchColumn(key, value, JavaValueTypes.STRING, SqlOperator.LIKE);
    }

    public static MatchColumn likeLeft(String key, String value) {
        return new MatchColumn(key, value, JavaValueTypes.STRING, SqlOperator.LIKE_LEFT);
    }

    public static MatchColumn likeRight(String key, String value) {
        return new MatchColumn(key, value, JavaValueTypes.STRING, SqlOperator.LIKE_RIGHT);
    }

    public static MatchColumn strings(String key, Collection<String> value) {
        return new MatchColumn(key, value, JavaValueTypes.STRING, SqlOperator.IN);
    }

    public static MatchColumn longs(String key, Collection<Long> value) {
        return new MatchColumn(key, value, JavaValueTypes.LONG, SqlOperator.IN);
    }

    public static MatchColumn integers(String key, Collection<Integer> value) {
        return new MatchColumn(key, value, JavaValueTypes.INTEGER, SqlOperator.IN);
    }

    private MatchColumn(String key, Object value, String type, SqlOperator operator) {
        this.key = key;
        this.value = value;
        this.type = type;
        this.operator = operator;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public SqlOperator getOperator() {
        return operator;
    }

    public void setOperator(SqlOperator operator) {
        this.operator = operator;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
