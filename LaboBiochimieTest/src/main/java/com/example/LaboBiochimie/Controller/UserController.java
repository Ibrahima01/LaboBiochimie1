package com.example.LaboBiochimie.Controller;

import com.example.LaboBiochimie.Entities.AppUser;
import com.example.LaboBiochimie.Service.AppUserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private AppUserService accountService;
    @PostMapping("/register")
    public AppUser register(@RequestBody UserForm userForm){
        return  accountService.SaveUser(
                userForm.getUsername(),userForm.getPassword(),userForm.getConfirmedPassword());
    }
}
@Data
class UserForm{
    private String username;
    private String password;
    private String confirmedPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmedPassword() {
        return confirmedPassword;
    }

    public void setConfirmedPassword(String confirmedPassword) {
        this.confirmedPassword = confirmedPassword;
    }
}
