package cn.zrz.ssm.mapper;

import cn.zrz.ssm.pojo.User;

import java.util.List;

public interface UserMapper {


    public abstract List<User> selectList();
}
