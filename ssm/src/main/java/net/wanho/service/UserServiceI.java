package net.wanho.service;

import com.github.pagehelper.PageInfo;
import net.wanho.pojo.User;

import java.util.List;

/**
 * Created by Administrator on 2019/4/18.
 */
public interface UserServiceI {

    PageInfo<User> getAllUsers();

    void addUser(User user);

    User getUserById(Integer id);

    User getUserByName(String name);

    void deleteUser(Integer id);

    void updateUser(User user);

    List<User> getAllUser();
}
