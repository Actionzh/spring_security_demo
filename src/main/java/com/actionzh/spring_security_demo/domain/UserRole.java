package com.actionzh.spring_security_demo.domain;

import lombok.Data;

@Data
public class UserRole {
    private Long userId;
    private Long roleId;
}