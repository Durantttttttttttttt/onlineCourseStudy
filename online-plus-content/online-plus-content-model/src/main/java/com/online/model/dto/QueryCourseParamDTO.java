package com.online.model.dto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * 分页查询课程参数的DTO
 */
@Data
@ToString
public class QueryCourseParamDTO {
    @ApiModelProperty("作者状态")
    private String auditStatus;
    @ApiModelProperty("课程名称")
    private String courseName;
    @ApiModelProperty("发布状态")
    private String publishStatus;
}
