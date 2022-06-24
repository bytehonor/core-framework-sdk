package com.bytehonor.sdk.define.spring.query;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MatchColumnGroup {

    private final List<MatchColumn> columns;

    public MatchColumnGroup() {
        this.columns = new ArrayList<MatchColumn>();
    }

    public static MatchColumnGroup create() {
        return new MatchColumnGroup();
    }

    public MatchColumnGroup add(MatchColumn column) {
        Objects.requireNonNull(column, "column");
        Objects.requireNonNull(column.getOperator(), "operator");

        if (column.getKey() != null && column.getValue() != null) {
            this.columns.add(column);
        }
        return this;
    }

    public List<MatchColumn> getColumns() {
        return columns;
    }

}
