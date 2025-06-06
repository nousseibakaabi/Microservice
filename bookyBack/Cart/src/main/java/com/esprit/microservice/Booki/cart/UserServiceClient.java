package com.esprit.microservice.Booki.cart;


import com.esprit.microservice.Booki.cart.config.FeignConfig;
import com.esprit.microservice.Booki.cart.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "user-service", url = "http://localhost:8081", configuration = FeignConfig.class)
public interface UserServiceClient {



    @GetMapping("/api/users/{userId}")
    UserDTO getUserById(@PathVariable Long userId);


    @GetMapping("/api/users/username/{username}")
    Long getUserIdByUsername(@PathVariable String username);



    @GetMapping("/api/users/username-details/{username}")
    UserDTO getUserDetailsByUsername(@PathVariable String username);


}