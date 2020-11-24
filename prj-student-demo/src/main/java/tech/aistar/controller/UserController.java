package tech.aistar.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tech.aistar.entity.User;
import tech.aistar.service.IUserService;
import tech.aistar.entity.Result;


@Controller
@RequestMapping("users")
public class UserController {

    private JavaMailSender mailSender;

    @Autowired
    private IUserService userService;

    @GetMapping("login")
    public String login(){

        //转发[servlet]的的方式...
        //return "/WEB-INF/user/login.jsp";

        return "user/login";
    }

    @GetMapping("sendCode")
    @ResponseBody
    public Result send(String email){
        User user = userService.login(email);
        if(null==user){
            return new Result("404","sorry,邮箱不存在!");
        }else{

            SimpleMailMessage msg = new SimpleMailMessage();

            msg.setFrom("849962874@qq.com");
            msg.setSubject("验证码");
            msg.setText("验证码:"+(int)(Math.random()*90000+10000));
            msg.setTo(email);
            mailSender.send(msg);
            return new Result("200","发送验证码成功!注意查收邮件!");
        }
//        System.out.println(user);
//            return "user/login";
    }
}
