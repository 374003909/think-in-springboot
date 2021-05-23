package com.jinliang.thinkinspringweb;

import con.jinliang.tool.ChineseCharacterUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @RequestMapping(value = "aop4")
    public String test4() {
        System.out.println("hello world");
        String aCase = ChineseCharacterUtil.getUpperCase("刘金亮", Boolean.TRUE);


        return "hello world" + aCase;
    }
}
