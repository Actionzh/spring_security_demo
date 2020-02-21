package com.actionzh.spring_security_demo.mapper;

import com.actionzh.spring_security_demo.domain.User;

public interface UserRoleMapper {
    User loadUserByUsername(String userName);
}
