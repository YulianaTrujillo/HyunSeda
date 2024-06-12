package com.unicauca.domain.entity;

import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Role implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long roleId;
    private String roleName;

}
