package tech.aistar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     * http://10.132.52.88:8082/mvc/hello
     * @return
     */

    //方法的定义
    @GetMapping("hello")// 资源的映射地址
    public String hello(){
        return "hello springboot";
    }
}
