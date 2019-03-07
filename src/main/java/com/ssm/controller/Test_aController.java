package com.ssm.controller;

import com.ssm.service.Test_aService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * fileName:Test_aController
 * description:
 * author:zz
 * createTime:2019/3/4 上午 11:15
 */
@Controller
public class Test_aController {
    @Autowired
    private Test_aService ts;
    @ResponseBody
    @RequestMapping("/finds")
    public Object find(){
        List<Map> list=ts.find();
       return list;
    };
}
