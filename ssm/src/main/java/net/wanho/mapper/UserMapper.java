package net.wanho.mapper;

import net.wanho.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    void addUser(User user);

    User getUserById(Integer id);

    User getUserByName(String name);

    void deleteUser(Integer id);

    void updateUser(User user);

    List<User> getAllUsers();




}
