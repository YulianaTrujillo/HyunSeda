package com.unicauca.domain.service;

import com.unicauca.domain.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "user-service", url = "localhost:8001")
public interface IUserClientRest {
    @PostMapping("/users")
    public User create(@RequestBody User user);

    @PutMapping("/users/{id}")
    public User update(@RequestBody User user, @PathVariable Long id);

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable Long id);
}
