package com.sidianle.domain;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tb_user")
@Data
public class User {
    @Id
    private Integer id;
    private String username;
    private String password;
    private String phoneNo;
}
