package com.example.arty;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "userTable")
@Data
class User extends BaseModel {
    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String cellphone;

    @Column(nullable = false)
    @JsonIgnore
    private String password;

    @JsonIgnore
    private String register_date;

    @JsonIgnore
    private String last_ip;

    @JsonIgnore
    private String register_ip;

}
