package com.manager.system.util;

public class ImageInfo {
	private String sn;
	private String deviceName;
	private String mac;
	private String level;
	private String ip;
	private String port;
	public void setLevel(String level){
		this.level = level == null ? null : level.trim();
	}
	public String getLevel(){
		return level;
	}
	public void setIp(String ip){
		this.ip = ip == null ? null : ip.trim();
	}
	public String getIp(){
		return ip;
	}
	public void setPort(String port){
		this.port = port == null ? null : port.trim();
	}
	public String getPort(){
		return port;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
}
