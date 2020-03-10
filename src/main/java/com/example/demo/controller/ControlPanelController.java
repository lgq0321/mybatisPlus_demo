package com.example.demo.controller;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiOperationSupport;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 控制台表 前端控制器
 * </p>
 *
 * @author liuguoquan
 * @since 2019-12-27
 */
@RestController
@RequestMapping("/controlPanel")
public class ControlPanelController {

//    @Autowired
//    RoleOperation roleOperation;

    @ApiOperationSupport(order = 1)
    @GetMapping("/queryRoleList")
    @ApiOperation("获取报表权限角色列表")
    public String queryRoleList(){
        return "nihao";
    }

//    @GetMapping("/queryRoleOp")
//    @ApiOperation("获取报表权限角色列表")
//    public String queryRoleOp(){
//        return roleOperation.op("admin");
//    }


}

