/*
 * Copyright (c) 2022. SienDev, Inc. and Golubnichenko Iurii.  All Rights Reserved.
 */

package corp.siendev.com.verbarium.api;

import corp.siendev.com.verbarium.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserApi {
    private final UserService userService;

    public UserApi(UserService userService) {
        this.userService = userService;
    }
}
