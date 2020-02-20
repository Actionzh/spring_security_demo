package com.actionzh.spring_security_demo.mapper;

import com.actionzh.spring_security_demo.domain.RolePermisson;

import java.util.List;

public interface PermissionMapper {

    List<RolePermisson> getRolePermissions();
}
