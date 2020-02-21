package com.actionzh.spring_security_demo.domain;

import lombok.Data;

@Data
public class Permisson {
    private String url;
    private String roleName;
    private String description;
    private Long pid;
    private Long id;
}