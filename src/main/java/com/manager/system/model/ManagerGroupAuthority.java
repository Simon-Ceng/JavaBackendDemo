package com.manager.system.model;

public class ManagerGroupAuthority {
    private Integer authorityPkid;

    private Integer groupPkid;

    private String level1;

    private String level2;

    private String level3;

    private String level4;

    public ManagerGroupAuthority(Integer authorityPkid, Integer groupPkid, String level1, String level2, String level3, String level4) {
        this.authorityPkid = authorityPkid;
        this.groupPkid = groupPkid;
        this.level1 = level1;
        this.level2 = level2;
        this.level3 = level3;
        this.level4 = level4;
    }

    public ManagerGroupAuthority() {
        super();
    }

    public Integer getAuthorityPkid() {
        return authorityPkid;
    }

    public void setAuthorityPkid(Integer authorityPkid) {
        this.authorityPkid = authorityPkid;
    }

    public Integer getGroupPkid() {
        return groupPkid;
    }

    public void setGroupPkid(Integer groupPkid) {
        this.groupPkid = groupPkid;
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