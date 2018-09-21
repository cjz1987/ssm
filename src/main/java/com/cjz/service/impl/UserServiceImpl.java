package com.cjz.service.impl;

import com.cjz.dao.UserDao;
import com.cjz.service.UserService;
import com.cjz.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> list() {
    	List<User> list = userDao.list();
        return list;
    }
}
