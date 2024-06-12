package com.unicauca.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long userId;
    private String userName;
    private String userEmail;
    private String userPassword;

    private List<Role> userRoles = new ArrayList<>();
}
