package com.example.demo.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.PanelDef;
import com.example.demo.service.PanelDefService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiOperationSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 面板定义表 前端控制器
 * </p>
 *
 * @author liuguoquan
 * @since 2019-12-27
 */
@RestController
@RequestMapping("/panelDef")
public class PanelDefController {

    @Autowired
    PanelDefService panelDefService;

    @ApiOperationSupport(order = 1)
    @GetMapping("/queryList")
    @ApiOperation("获取面板定义列表")
    public String queryList(){
        Page<PanelDef> page = panelDefService.page(new Page<>());

        return "nihao";
    }

}

