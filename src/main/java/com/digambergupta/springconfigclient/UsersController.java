package com.digambergupta.springconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Digamber Gupta
 * Controller class for users
 */
@RefreshScope
@RestController
class UsersController {

	@Value("${user.firstName:DG default}")
	private String user;

	@RequestMapping("/user")
	String getMessage() {
		return this.user;
	}
}