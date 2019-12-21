package com.wangyb.springlearning.vueserver.controller;

import com.github.pagehelper.PageInfo;
import com.wangyb.springlearning.vueserver.annotation.SysLog;
import com.wangyb.springlearning.vueserver.entity.SysLogInfo;
import com.wangyb.springlearning.vueserver.pojo.PageResult;
import com.wangyb.springlearning.vueserver.pojo.RestResult;
import com.wangyb.springlearning.vueserver.service.SysLogInfoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyb
 * @Date 2019/5/6 15:20
 * Modified By:
 * Description:
 */
@Api(tags = "系统日志")
@RestController
@CrossOrigin
@RequestMapping(value = "log")
public class SysLogController {

    private final SysLogInfoService sysLogInfoService;

    @Autowired
    public SysLogController(SysLogInfoService sysLogInfoService) {
        this.sysLogInfoService = sysLogInfoService;
    }

    //暂时未设置日志权限
    @SysLog(operationType = "查看",operationName = "获取日志列表")
    @GetMapping("list")
    public RestResult<PageResult<SysLogInfo>> getLogList(int pageNum, int pageSize) {
        PageInfo<SysLogInfo> info = sysLogInfoService.listLog(pageNum, pageSize);
        return new RestResult<>(new PageResult<>(info.getList(), pageNum, info.getSize(), info.getTotal()));
    }
}
