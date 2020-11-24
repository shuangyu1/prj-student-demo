package tech.aistar.mail;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootTest
public class TestMail {
    @Autowired
    private JavaMailSender mailSender;

    @Test
    public void testSender(){
        SimpleMailMessage msg = new SimpleMailMessage();

        msg.setFrom("849962874@qq.com");

        msg.setSubject("验证码");

        msg.setText("验证码:123456");

        msg.setTo("1066551383@qq.com");

        mailSender.send(msg);
    }
}
