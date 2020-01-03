package com.lbo.code.reportfroms.web.controller.admin;

import com.lbo.code.reportfroms.common.cache.RedisCache;
import com.lbo.code.reportfroms.service.LoginService;
import com.lbo.code.reportfroms.service.UserService;
import com.lbo.code.reportfroms.web.dto.req.LoginAdminReqDto;
import com.lbo.code.reportfroms.web.dto.rsp.LoginAdminRspDto;
import com.lbo.code.reportfroms.web.dto.rsp.base.VoidRspDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 登陆相关
 */
@Slf4j
@RestController
@RequestMapping(value = "/admin")
public class LoginAdminController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public LoginAdminRspDto login(@Valid @RequestBody LoginAdminReqDto reqDto) {

        return LoginAdminRspDto.builder().build();
    }

    @GetMapping("logout")
    public VoidRspDto logout(@Valid @RequestParam("token") String token) {
        RedisCache.deleteToken(token);
        return new VoidRspDto();
    }

}
