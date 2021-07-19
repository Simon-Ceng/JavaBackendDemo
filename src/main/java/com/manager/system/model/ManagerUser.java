package com.manager.system.model;

public class ManagerUser {
    private Integer userPkid;

    private String username;

    private String password;

    private Integer status;

    private Integer groupPkid;

    private String groupName;

    public ManagerUser(Integer userPkid, String username, String password, Integer status, Integer groupPkid, String groupName) {
        this.userPkid = userPkid;
        this.username = username;
        this.password = password;
        this.status = status;
        this.groupPkid = groupPkid;
        this.groupName = groupName;
    }

    public ManagerUser() {
        super();
    }

    public Integer getUserPkid() {
        return userPkid;
    }

    public void setUserPkid(Integer userPkid) {
        this.userPkid = userPkid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getGroupPkid() {
        return groupPkid;
    }

    public void setGroupPkid(Integer groupPkid) {
        this.groupPkid = groupPkid;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }
}