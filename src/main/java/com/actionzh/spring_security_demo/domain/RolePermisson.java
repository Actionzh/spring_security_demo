package com.actionzh.spring_security_demo.domain;

import lombok.Data;

@Data
public class RolePermisson {
    private Long roleId;
    private Long permissionId;
    private String url;
    private String roleName;
    private String description;
    private Long pid;
    private Long id;
}