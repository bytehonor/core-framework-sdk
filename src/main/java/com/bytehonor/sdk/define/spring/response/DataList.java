package com.bytehonor.sdk.define.spring.response;

import java.util.List;

/**
 * @author lijianqiang
 *
 * @param <T>
 */
public class DataList<T> {

    private Integer total;

    private List<T> list;

    public static <T> DataList<T> of(List<T> list) {
        return of(list, list != null ? list.size() : 0);
    }

    public static <T> DataList<T> of(List<T> list, Integer total) {
        DataList<T> vo = new DataList<T>();
        vo.setList(list);
        vo.setTotal(total);
        return vo;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

}
