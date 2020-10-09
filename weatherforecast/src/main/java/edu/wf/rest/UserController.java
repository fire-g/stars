package edu.wf.rest;

import edu.wf.model.User;
import edu.wf.service.UserService;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserService service;

    public UserController(UserService service){
        this.service =service;
    }

    @PostMapping(value="/login" , produces={"application/json;charset=UTF-8"})
    public Map<?,?> login(@Param("email") String email,
                          @Param("password") String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        User u = service.login(user);
        Map<String,Object> objectMap=new HashMap<>();
        if(u!=null){
            objectMap.put("code",0);
            objectMap.put("message","登录成功");
            objectMap.put("data",user);
            return objectMap;
        }
        objectMap.put("code",400);
        objectMap.put("message","登录邮箱或密码错误");
        objectMap.put("data",new Object());
        return objectMap;
    }

    @PostMapping(value="/register" , produces={"application/json;charset=UTF-8"})
    public Map<?,?> register(@Param("email") String email,
                          @Param("password") String password,
                             @Param("username")String username) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setUsername(username);
        boolean b=service.register(user);
        Map<String,Object> objectMap=new HashMap<>();
        if(b){
            objectMap.put("code",0);
            objectMap.put("message","注册成功");
            return objectMap;
        }
        objectMap.put("code",400);
        objectMap.put("message","邮箱已经注册,请登录或更换邮箱");
        return objectMap;
    }

}
