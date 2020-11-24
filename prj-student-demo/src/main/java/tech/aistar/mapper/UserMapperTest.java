package tech.aistar.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void testFindAll(){
        userMapper.findAll().forEach(e-> System.out.println(e));
    }

    @Test
    public void testFindByEmail(){
        System.out.println(userMapper.findByEmail("1066551383@qq.com"));
    }

}
