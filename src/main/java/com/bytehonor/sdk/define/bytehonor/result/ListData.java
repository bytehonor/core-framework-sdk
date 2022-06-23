package com.bytehonor.sdk.define.bytehonor.result;

import java.util.List;

/**
 * @author lijianqiang
 *
 * @param <T>
 */
public class ListData<T> {

    private Integer total;

    private List<T> list;

    public static <T> ListData<T> of(List<T> list) {
        return of(list, list != null ? list.size() : 0);
    }

    public static <T> ListData<T> of(List<T> list, Integer total) {
        ListData<T> vo = new ListData<T>();
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
