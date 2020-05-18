package cn.zrz.ssm.service;

import cn.zrz.ssm.pojo.User;

import java.util.List;

public interface UserService {

    public abstract List<User> selectList();
}
