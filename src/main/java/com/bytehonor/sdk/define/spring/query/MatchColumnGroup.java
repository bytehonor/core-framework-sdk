package com.bytehonor.sdk.define.spring.query;

import java.util.ArrayList;
import java.util.List;

public class MatchColumnGroup {

    private final List<MatchColumn> columns;

    public MatchColumnGroup() {
        this.columns = new ArrayList<MatchColumn>();
    }

    public static MatchColumnGroup create() {
        return new MatchColumnGroup();
    }

    public static boolean accept(MatchColumn column) {
        if (column == null) {
            return false;
        }
        return column.getOperator() != null && column.getKey() != null && column.getValue() != null;
    }

    public MatchColumnGroup safeAdd(MatchColumn column) {
        if (accept(column)) {
            this.columns.add(column);
        }
        return this;
    }

    public List<MatchColumn> getColumns() {
        return columns;
    }

}
