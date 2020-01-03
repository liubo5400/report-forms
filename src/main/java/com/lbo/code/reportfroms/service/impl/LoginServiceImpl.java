package com.lbo.code.reportfroms.service.impl;

import com.lbo.code.reportfroms.persistence.UserInfoMapper;
import com.lbo.code.reportfroms.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserInfoMapper userInfoMapper;

}
