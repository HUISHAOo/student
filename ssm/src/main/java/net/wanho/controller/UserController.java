package net.wanho.controller;

import com.github.pagehelper.PageInfo;
import net.wanho.pojo.User;
import net.wanho.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserServiceI userServiceI;

    @RequestMapping("getuser")
    public  String  getuser(){
        PageInfo<User> allUsers = userServiceI.getAllUsers();
        List stus=allUsers.getList();
        System.out.println(stus);
        return "login";
    }
    @RequestMapping("getstus")
    public String getstus(Map map){
        List stus =userServiceI.getAllUser();
        map.put("stus",stus);
        return "student";
    }
    @RequestMapping("addStus")
    public String addStus(User user){
        userServiceI.addUser(user);

        return "redirect:/getstus";
    }
    @RequestMapping("updateStus")
    public String updateStus(User user){

        userServiceI.updateUser(user);

        return "redirect:/getstus";
    }
    @RequestMapping("addstu02")
    public String addstu02(Map map){

        return "addStudent";
    }
    @RequestMapping("updatestu02")
    public String updatestu02(Integer uid,Map map){
        User stus =userServiceI.getUserById(uid);
        map.put("stu",stus);
        return "updatestu";
    }
    @RequestMapping("deleteStu")
    public String deleteStu(Integer uid) {
        userServiceI.deleteUser(uid);

        return "redirect:/getstus";
    }
}
