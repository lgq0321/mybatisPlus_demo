package com.example.demo.controller;

import com.example.demo.context.SystemContext;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2020/1/9 10:10
 */
//@RestController
@Controller
@RequestMapping
public class IndexController {
    /**
     * 上下文path
     */
    @Value("${server.servlet.context-path}")
    private String contextPath;

    @GetMapping("/index")
    public String index(Model model, @RequestAttribute SystemContext systemContext) {
        String contextPath2 = contextPath;
        System.out.printf(systemContext.getUserId());
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User u = new User();
            u.setId((long) i);
            u.setName("javaboy:" + i);
            u.setAddress("深圳:" + i);
            users.add(u);
        }
        model.addAttribute("users", users);
        return "index";
    }

    @GetMapping("/index1")
    public String index1(Model model) {
        model.addAttribute("username", "李四");
        return "index";
    }

    @Autowired
    TemplateEngine templateEngine;

    @GetMapping("/index2")
    public String index2(Model model) {
        Context context = new Context();
        context.setVariable("username", "javaboy");
        context.setVariable("position", "Java工程师");
        context.setVariable("salary", 99999);
//        String mail = templateEngine.process("mail", context);
        return "index2";
    }

}
