package com.example.LaboBiochimie.Service;

import com.example.LaboBiochimie.Entities.AppRole;
import com.example.LaboBiochimie.Entities.AppUser;

public interface AppUserService {
    public AppUser SaveUser(String username, String password, String confirmedPassword);
    public AppUser login(String email);
    public void UpdateUser(Long Id, AppUser user);
    public void RemoveUser(Long Id);
    public AppUser loadUserByusername(String username);
    public AppRole save(AppRole role);
    public void addRoleToUser(String username,String rolename);
}
