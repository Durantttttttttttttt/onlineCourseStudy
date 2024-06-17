package com.online.model.po;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * 分页查询的返回类
 */
@Data
@ToString
public class PageResult {
    private List<?> items;

    private Integer counts;

    private Integer page;

    private Integer pageSize;

    public PageResult(List<?> items, Integer counts, Integer page, Integer pageSize) {
        this.items = items;
        this.counts = counts;
        this.page = page;
        this.pageSize = pageSize;
    }
}
