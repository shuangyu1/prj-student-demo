package tech.aistar.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.aistar.entity.User;
import tech.aistar.mapper.UserMapper;
import tech.aistar.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String email){
        return userMapper.findByEmail(email);
    }
}
