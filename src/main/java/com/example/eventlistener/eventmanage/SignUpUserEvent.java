package com.example.eventlistener.eventmanage;

import com.example.eventlistener.entity.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SignUpUserEvent {
    private final User user;
}

