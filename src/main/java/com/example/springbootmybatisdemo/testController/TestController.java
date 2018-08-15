package com.example.springbootmybatisdemo.testController;

import com.example.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private AccountMapper accountMapper;

    @ResponseBody
    @RequestMapping(value = "/test")
    public void showString(@RequestParam Integer id, @RequestParam String name){
        System.out.print("id :"+id+"         play name: "+name);
    }
}
