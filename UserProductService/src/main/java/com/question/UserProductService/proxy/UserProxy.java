package com.question.UserProductService.proxy;

import com.question.UserProductService.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "authentication-service",url = "http://localhost:8085")
public interface UserProxy {
    @PostMapping("/userdata/register")
    ResponseEntity<?> saveUser(@RequestBody User user);
}
