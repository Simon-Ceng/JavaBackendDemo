package com.manager.system.controller;

import com.manager.system.config.security.JwtAuthenticationResponse;
import com.manager.system.config.security.JwtTokenProvider;
import com.manager.system.config.security.SecurityUser;
import com.manager.system.config.security.SecurityUserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class AuthController {
	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

	@Autowired
    AuthenticationManager authenticationManager;

	@Autowired
	JwtTokenProvider tokenProvider;

	@Autowired
	SecurityUserService userService;

	@PostMapping("/login")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
		try {
			Authentication authentication = authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
			SecurityContextHolder.getContext().setAuthentication(authentication);
			String authority = (String) ((SecurityUser) authentication.getPrincipal()).getAuthorities().toArray()[0]
					.toString();
			String jwt = tokenProvider.generateToken(authentication);
			logger.info("username: {}", loginRequest.getUsername());

			//在这里加上生成数量的清零
			return ResponseEntity.ok(new JwtAuthenticationResponse(jwt, authority));
		} catch (Exception e) {
			return ResponseEntity.ok(new JwtAuthenticationResponse(null, e.getMessage()));
		}
	}
}
