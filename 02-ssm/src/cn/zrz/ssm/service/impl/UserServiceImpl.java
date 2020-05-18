package cn.zrz.ssm.service.impl;

import cn.zrz.ssm.mapper.UserMapper;
import cn.zrz.ssm.pojo.User;
import cn.zrz.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectList() {
        return userMapper.selectList();
    }



}
