package com.manager.system.model;

public class ManagerUserView {
    private Integer userPkid;

    private String username;

    private String password;

    private Integer userStatus;

    private Integer groupPkid;

    private String groupName;

    private Integer type;

    private Integer groupStatus;

    private Integer authorityPkid;

    private String level1;

    private String level2;

    private String level3;

    private String level4;

    public ManagerUserView(Integer userPkid, String username, String password, Integer userStatus, Integer groupPkid, String groupName, Integer type, Integer groupStatus, Integer authorityPkid, String level1, String level2, String level3, String level4) {
        this.userPkid = userPkid;
        this.username = username;
        this.password = password;
        this.userStatus = userStatus;
        this.groupPkid = groupPkid;
        this.groupName = groupName;
        this.type = type;
        this.groupStatus = groupStatus;
        this.authorityPkid = authorityPkid;
        this.level1 = level1;
        this.level2 = level2;
        this.level3 = level3;
        this.level4 = level4;
    }

    public ManagerUserView() {
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

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(Integer groupStatus) {
        this.groupStatus = groupStatus;
    }

    public Integer getAuthorityPkid() {
        return authorityPkid;
    }

    public void setAuthorityPkid(Integer authorityPkid) {
        this.authorityPkid = authorityPkid;
    }

    public String getLevel1() {
        return level1;
    }

    public void setLevel1(String level1) {
        this.level1 = level1 == null ? null : level1.trim();
    }

    public String getLevel2() {
        return level2;
    }

    public void setLevel2(String level2) {
        this.level2 = level2 == null ? null : level2.trim();
    }

    public String getLevel3() {
        return level3;
    }

    public void setLevel3(String level3) {
        this.level3 = level3 == null ? null : level3.trim();
    }

    public String getLevel4() {
        return level4;
    }

    public void setLevel4(String level4) {
        this.level4 = level4 == null ? null : level4.trim();
    }
}