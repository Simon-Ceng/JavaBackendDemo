package com.manager.system.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

/**
 * Spring security 用户认证
 * 
 * @author cbigd
 *
 */
@Component
public class AuthenticationProviderCustom implements AuthenticationProvider {
	@Autowired
	private SecurityUserService myUserService;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username = null;
		SecurityUser user = null;
		try {
			username = new String(authentication.getName().getBytes("iso8859-1"), "utf-8");
			System.out.println(username);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		if (username != null) {
			user = (SecurityUser) myUserService.loadUserByUsername(username);
		}
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if (user != null) {
			if (encoder.matches((CharSequence) authentication.getCredentials(), user.getPassword())) {
				if (user.getUserStatus() == 1) {
					if (user.getGroupStatus() == 1) {
						return new UsernamePasswordAuthenticationToken(user, authentication.getCredentials(), user.getAuthorities());
					}
					throw new BadCredentialsException("Group disabled");
				}
				throw new BadCredentialsException("Account disabled");
			}
			throw new BadCredentialsException("Password error");
		}
		throw new BadCredentialsException("Username error");

	}

	@Override
	public boolean supports(Class<?> authentication) {
		// 返回true后才会执行上面的authenticate方法,这步能确保authentication能正确转换类型
		return UsernamePasswordAuthenticationToken.class.equals(authentication);
	}
}