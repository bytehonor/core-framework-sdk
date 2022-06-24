package com.bytehonor.sdk.define.spring.query;

import java.util.Collection;
import java.util.Objects;

import com.bytehonor.sdk.define.spring.constant.HttpConstants;
import com.bytehonor.sdk.define.spring.constant.QueryLogic;

/**
 * 
 * @author lijianqiang
 *
 */
public final class QueryCondition {

    private static int LIMIT_DEF = HttpConstants.LIMIT_DEF;

    private final QueryLogic logic;

    private QueryPage page;

    private QueryOrder order;

    private final MatchColumnGroup group;

    private QueryCondition(QueryLogic logic) {
        this.logic = logic;
        this.page = QueryPage.create();
        this.order = null;
        this.group = MatchColumnGroup.create();
    }

    public static QueryCondition create() {
        return and();
    }

    public static QueryCondition create(int offset, int limit) {
        return and(offset, limit);
    }

    public static QueryCondition and() {
        return and(0, LIMIT_DEF);
    }

    public static QueryCondition and(int offset, int limit) {
        return create(QueryLogic.AND, QueryPage.of(offset, limit));
    }

    public static QueryCondition or() {
        return or(0, LIMIT_DEF);
    }

    public static QueryCondition or(int offset, int limit) {
        return create(QueryLogic.OR, QueryPage.of(offset, limit));
    }

    public static QueryCondition create(QueryLogic logic, QueryPage page) {
        Objects.requireNonNull(logic, "logic");
        Objects.requireNonNull(page, "page");

        QueryCondition codition = new QueryCondition(logic);
        codition.setPage(page);
        return codition;
    }

    private QueryCondition add(MatchColumn column) {
        group.add(column);
        return this;
    }

    /**
     * 等于
     * 
     * @param key
     * @param value
     * @return
     */
    public QueryCondition eq(String key, String value) {
        return this.add(MatchColumn.eq(key, value));
    }

    /**
     * 等于
     * 
     * @param key
     * @param value
     * @return
     */
    public QueryCondition eq(String key, Long value) {
        return this.add(MatchColumn.eq(key, value));
    }

    /**
     * 等于
     * 
     * @param key
     * @param value
     * @return
     */
    public QueryCondition eq(String key, Integer value) {
        return this.add(MatchColumn.eq(key, value));
    }

    /**
     * 等于
     * 
     * @param key
     * @param value
     * @return
     */
    public QueryCondition eq(String key, Boolean value) {
        return this.add(MatchColumn.eq(key, value));
    }

    /**
     * 不等于
     * 
     * @param key
     * @param value
     * @return
     */
    public QueryCondition neq(String key, String value) {
        return this.add(MatchColumn.neq(key, value));
    }

    /**
     * 不等于
     * 
     * @param key
     * @param value
     * @return
     */
    public QueryCondition neq(String key, Long value) {
        return this.add(MatchColumn.neq(key, value));
    }

    /**
     * 不等于
     * 
     * @param key
     * @param value
     * @return
     */
    public QueryCondition neq(String key, Integer value) {
        return this.add(MatchColumn.neq(key, value));
    }

    /**
     * 不等于
     * 
     * @param key
     * @param value
     * @return
     */
    public QueryCondition neq(String key, Boolean value) {
        return this.add(MatchColumn.neq(key, value));
    }

    /**
     * 大于
     * 
     * @param key
     * @param value
     * @return
     */
    public QueryCondition gt(String key, Long value) {
        return this.add(MatchColumn.gt(key, value));
    }

    /**
     * 大于
     * 
     * @param key
     * @param value
     * @return
     */
    public QueryCondition gt(String key, Integer value) {
        return this.add(MatchColumn.gt(key, value));
    }

    /**
     * 大于等于
     * 
     * @param key
     * @param value
     * @return
     */
    public QueryCondition egt(String key, Long value) {
        return this.add(MatchColumn.egt(key, value));
    }

    /**
     * 大于等于
     * 
     * @param key
     * @param value
     * @return
     */
    public QueryCondition egt(String key, Integer value) {
        return this.add(MatchColumn.egt(key, value));
    }

    /**
     * 小于
     * 
     * @param key
     * @param value
     * @return
     */
    public QueryCondition lt(String key, Long value) {
        return this.add(MatchColumn.lt(key, value));
    }

    /**
     * 小于
     * 
     * @param key
     * @param value
     * @return
     */
    public QueryCondition lt(String key, Integer value) {
        return this.add(MatchColumn.lt(key, value));
    }

    /**
     * 小于等于
     * 
     * @param key
     * @param value
     * @return
     */
    public QueryCondition elt(String key, Long value) {
        return this.add(MatchColumn.elt(key, value));
    }

    /**
     * 小于等于
     * 
     * @param key
     * @param value
     * @return
     */
    public QueryCondition elt(String key, Integer value) {
        return this.add(MatchColumn.elt(key, value));
    }

    public QueryCondition like(String key, String value) {
        return this.add(MatchColumn.like(key, value));
    }

    public QueryCondition likeLeft(String key, String value) {
        return this.add(MatchColumn.likeLeft(key, value));
    }

    public QueryCondition likeRight(String key, String value) {
        return this.add(MatchColumn.likeRight(key, value));
    }

    public QueryCondition strings(String key, Collection<String> value) {
        return this.add(MatchColumn.strings(key, value));
    }

    public QueryCondition longs(String key, Collection<Long> value) {
        return this.add(MatchColumn.longs(key, value));
    }

    public QueryCondition integers(String key, Collection<Integer> value) {
        return this.add(MatchColumn.integers(key, value));
    }

    public QueryCondition descBy(String key) {
        this.order = QueryOrder.descOf(key);
        return this;
    }

    public QueryCondition ascBy(String key) {
        this.order = QueryOrder.ascOf(key);
        return this;
    }

    public void setOffset(int offset) {
        this.page.setOffset(offset);
    }

    public void setLimit(int limit) {
        this.page.setLimit(limit);
    }

    public QueryPage getPage() {
        return page;
    }

    public void setPage(QueryPage page) {
        this.page = page;
    }

    public QueryOrder getOrder() {
        return order;
    }

    public void setOrder(QueryOrder order) {
        this.order = order;
    }

    public QueryLogic getLogic() {
        return logic;
    }

    public MatchColumnGroup getGroup() {
        return group;
    }

}
