package com.devsuperior.hrauth.feignclients;

import com.devsuperior.hrauth.entities.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "hr-user", path = "/users")
@Component
public interface UserFeignClient {

    @GetMapping(value = "/search")
    ResponseEntity<User> findByEmail(@RequestParam String email);
}
