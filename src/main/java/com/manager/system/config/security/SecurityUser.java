package com.manager.system.config.security;

import com.manager.system.model.ManagerUserView;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SecurityUser implements UserDetails {
	/**
	 * 用户实体类
	 * @author cbigd
	 *
	 */
	private static final long serialVersionUID = 1L;
	private int pkid;  
    private String username;
    private String password;
    private int userStatus;
    private int groupStatus;
	private int groupPkid;
    private int type;
	private String groupName;
	private List<Integer> levelAuthorities;
	private List<GrantedAuthority> AUTHORITIES = new ArrayList<GrantedAuthority>();
	
	SecurityUser(ManagerUserView userView, List<Integer> levelAuthorities) {
		super();  
        this.pkid = userView.getUserPkid(); 
        this.username = userView.getUsername();  
        this.password = userView.getPassword();
        this.setUserStatus(userView.getUserStatus());
        this.setGroupStatus(userView.getGroupStatus());
        this.setGroupPkid(userView.getGroupPkid());
		this.setGroupName(userView.getGroupName());
        this.type = userView.getType();
        this.levelAuthorities = levelAuthorities;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return AUTHORITIES;
	}
	
	public void setAuthorities(List<GrantedAuthority> AUTHORITIES) {
		 this.AUTHORITIES = AUTHORITIES;
	}


	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPkid() {
		return pkid;
	}
	public void setPkid(int pkid) {
		this.pkid = pkid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public List<Integer> getLevelAuthorities() {
		return levelAuthorities;
	}
	public void setLevelAuthorities(List<Integer> levelAuthorities) {
		this.levelAuthorities = levelAuthorities;
	}

	public int getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}

	public int getGroupStatus() {
		return groupStatus;
	}

	public void setGroupStatus(int groupStatus) {
		this.groupStatus = groupStatus;
	}

	public int getGroupPkid() {
		return groupPkid;
	}

	public void setGroupPkid(int groupPkid) {
		this.groupPkid = groupPkid;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


}
