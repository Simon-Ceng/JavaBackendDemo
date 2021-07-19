package com.manager.system.controller;

import com.google.gson.JsonObject;
import com.manager.system.dao.InvitecodeListMapper;
import com.manager.system.dao.ManagerUserMapper;
import com.manager.system.model.InvitecodeListExample;
import com.manager.system.model.ManagerUser;
import com.manager.system.model.ManagerUserExample;
import com.manager.system.model.SystemHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    ManagerUserMapper userMapper;

    @Autowired
    InvitecodeListMapper invitecodeListMapper;

    @PostMapping(value = "/addUser")
    @ResponseBody
    public void addNewUser(@RequestBody Map<String,String> in,
                           HttpServletResponse response) {
        PrintWriter writer = null;
        JsonObject res = new JsonObject();
        InvitecodeListExample temp = new InvitecodeListExample();
        temp.or().andInviteCodeEqualTo(in.get("sign"));
        if (invitecodeListMapper.countByExample(temp)!=0) {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            String password = encoder.encode(in.get("password"));
            ManagerUser newuser = new ManagerUser();
            newuser.setUsername(in.get("username"));
            newuser.setPassword(password);
            newuser.setStatus(Integer.parseInt(in.get("status")));
            newuser.setGroupPkid(Integer.parseInt(in.get("groupId")));
            ManagerUserExample fcode = new ManagerUserExample();
            fcode.or().andUsernameEqualTo(in.get("username"));
            if (userMapper.countByExample(fcode) == 0) {
                userMapper.insert(newuser);
                res.addProperty("result", true);
                res.addProperty("status", 200);
            } else {
                res.addProperty("result", false);
                res.addProperty("status", 500);
            }
        }
        else{
            res.addProperty("result", false);
            res.addProperty("status", 500);
        }
        try {
            writer = response.getWriter();
        }catch (Exception e) {
            e.printStackTrace();
        }finally{
            writer.print(res);
            writer.flush();
        }
        writer.close();
    }

}
