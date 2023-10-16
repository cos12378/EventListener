package com.example.eventlistener.controller;

import com.example.eventlistener.request.RewardRequest;
import com.example.eventlistener.request.SignupRequest;
import com.example.eventlistener.service.SignUpUserService;
import com.example.eventlistener.service.UpdatePointService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class userController {

    private final SignUpUserService signUpUserService;

    @PostMapping("/signUp")
    public void signUp(@RequestBody SignupRequest signupRequest){
        signUpUserService.register(signupRequest);
    }

}
