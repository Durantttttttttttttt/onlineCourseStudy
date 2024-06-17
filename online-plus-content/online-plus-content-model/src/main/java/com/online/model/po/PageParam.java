package com.online.model.po;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * 分页参数
 */
@Data
@ToString
public class PageParam {
    @ApiModelProperty("页码")
    private Long pageNo = 1L;

    @ApiModelProperty("页面大小")
    private Long pageSize = 10L;

    public PageParam() {
    }

    public PageParam(Long pageNo, Long pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}
