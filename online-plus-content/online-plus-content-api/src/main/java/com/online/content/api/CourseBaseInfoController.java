package com.online.content.api;

import com.online.model.dto.QueryCourseParamDTO;
import com.online.model.po.CourseBase;
import com.online.model.po.PageParam;
import com.online.model.po.PageResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 控制类，课程基本信息
 */
@RestController
@Api(tags = "在线基本信息管理")
public class CourseBaseInfoController {

    /**
     * 分页查询课程信息
     */
    @PostMapping("/course/list")
    public PageResult list(PageParam pageParam, @RequestBody(required = false) QueryCourseParamDTO queryCourseParamDTO) {
        CourseBase courseBase = new CourseBase();
        courseBase.setCreateDate(LocalDateTime.now());
        List<CourseBase> list = new ArrayList<>();
        list.add(courseBase);
        return new PageResult(list, 0, pageParam.getPageNo().intValue(),
                pageParam.getPageSize().intValue());
    }
}
