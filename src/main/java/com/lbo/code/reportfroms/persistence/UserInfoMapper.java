package com.lbo.code.reportfroms.persistence;

import com.lbo.code.reportfroms.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    @Select("select * from user_info where username = #{username} and status = 'ENABLED'")
    UserInfo selectByUsername(@Param("username") String username);
}
