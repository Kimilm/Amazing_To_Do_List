package com.amazing.todolist.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Thymeleaf {

    @RequestMapping("/thymeleafTest")
    public String thymeleafTest(Model model) {
        System.out.println("thymeleafTest");
        TestVo testModel = new TestVo("test", "테스트");
        model.addAttribute("testModel", testModel);
        return "thymeleaf/thymeleafTest";

    }
}
