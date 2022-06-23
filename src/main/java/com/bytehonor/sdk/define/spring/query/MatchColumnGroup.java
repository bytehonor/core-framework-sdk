package com.bytehonor.sdk.define.spring.query;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.bytehonor.sdk.define.spring.constant.QueryLogic;

public class MatchColumnGroup {

    private final QueryLogic logic;

    private final List<MatchColumn> columns;

    private MatchColumnGroup(QueryLogic logic) {
        this.logic = logic;
        this.columns = new ArrayList<MatchColumn>();
    }

    public static MatchColumnGroup create(QueryLogic logic) {
        Objects.requireNonNull(logic, "logic");

        return new MatchColumnGroup(logic);
    }

    public MatchColumnGroup add(MatchColumn column) {
        Objects.requireNonNull(column, "column");
        Objects.requireNonNull(column.getOperator(), "operator");

        this.columns.add(column);
        return this;
    }

    public QueryLogic getLogic() {
        return logic;
    }

    public List<MatchColumn> getColumns() {
        return columns;
    }

}
