package com.atguigu.controller;

import com.atguigu.entity.Employee;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    /*
     * @Author GhostGalaxy
     * @Description 测试父子容器之间能否进行相互的注入 访问地址http://localhost:8080/Spring_SpringMVC_war_exploded/hello
     * @Date 20:57:27 2022/12/12
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello方法被调用");
        return "success";
    }
    /*
     * @Author GhostGalaxy
     * @Description 测试CRUD 测试地址：http://localhost:8080/Spring_SpringMVC_war_exploded/query/employee
     * @Date 21:58:08 2022/12/12
     * @Param [model]
     * @return java.lang.String
     **/
    @RequestMapping("/query/employee")
    public String getEmployee(Model model){
        Collection<Employee> allEmployee = userService.getAllEmployee();
        model.addAttribute("employees",allEmployee);
        return "success";
    }

}
