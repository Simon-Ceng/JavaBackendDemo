package com.manager.system.model;

public class ManagerUserGroup {
    private Integer groupPkid;

    private String groupName;

    private Integer type;

    private Integer status;

    private String fromEmail;

    private String fromPassword;

    private String fromPort;

    private String fromSmtp;

    private Integer fromTls;

    private String toEmail;

    private String testEmail;

    private Integer emailPeriod;

    private String startTime;

    private String stopTime;

    public ManagerUserGroup(Integer groupPkid, String groupName, Integer type, Integer status, String fromEmail, String fromPassword, String fromPort, String fromSmtp, Integer fromTls, String toEmail, String testEmail, Integer emailPeriod, String startTime, String stopTime) {
        this.groupPkid = groupPkid;
        this.groupName = groupName;
        this.type = type;
        this.status = status;
        this.fromEmail = fromEmail;
        this.fromPassword = fromPassword;
        this.fromPort = fromPort;
        this.fromSmtp = fromSmtp;
        this.fromTls = fromTls;
        this.toEmail = toEmail;
        this.testEmail = testEmail;
        this.emailPeriod = emailPeriod;
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    public ManagerUserGroup() {
        super();
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail == null ? null : fromEmail.trim();
    }

    public String getFromPassword() {
        return fromPassword;
    }

    public void setFromPassword(String fromPassword) {
        this.fromPassword = fromPassword == null ? null : fromPassword.trim();
    }

    public String getFromPort() {
        return fromPort;
    }

    public void setFromPort(String fromPort) {
        this.fromPort = fromPort == null ? null : fromPort.trim();
    }

    public String getFromSmtp() {
        return fromSmtp;
    }

    public void setFromSmtp(String fromSmtp) {
        this.fromSmtp = fromSmtp == null ? null : fromSmtp.trim();
    }

    public Integer getFromTls() {
        return fromTls;
    }

    public void setFromTls(Integer fromTls) {
        this.fromTls = fromTls;
    }

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail == null ? null : toEmail.trim();
    }

    public String getTestEmail() {
        return testEmail;
    }

    public void setTestEmail(String testEmail) {
        this.testEmail = testEmail == null ? null : testEmail.trim();
    }

    public Integer getEmailPeriod() {
        return emailPeriod;
    }

    public void setEmailPeriod(Integer emailPeriod) {
        this.emailPeriod = emailPeriod;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime == null ? null : stopTime.trim();
    }
}