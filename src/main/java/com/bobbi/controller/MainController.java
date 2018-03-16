package com.bobbi.controller;

import com.bobbi.domain.Student;
import com.bobbi.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by bobbi on 18/3/16.
 */
@Controller
public class MainController {

    @Resource
    private StudentService studentService;

    @RequestMapping(value = {"/home", "/"})
    public String homePage() {

        return "home";

    }

    /**
     * @RequestParam("name") name是前端的name
     * String name name 是后台的参数
     * required 代表"不是必须的"（可以为空）
     */
    @ResponseBody
    @RequestMapping(value = "/findAllStudent")
    public List<Student> findAllStudent(@RequestParam(value = "username", required = false) String username) {

        System.out.println(username);

        return studentService.findAllStudent();

    }

}
