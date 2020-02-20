package com.actionzh.spring_security_demo.mapper;

import com.actionzh.spring_security_demo.domain.Role;

import java.util.List;

public interface RoleMapper {
    List<Role> getRolesByUserId(Long userId);
}
