package com.example.eventlistener.service;

import com.example.eventlistener.entity.User;
import com.example.eventlistener.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UpdatePointService {

    private final UserRepository userRepository;

    public void rewardPoint(String email) {
        Optional<User> user = userRepository.findByEmail(email);
        user.get().setPoint(100);
        System.out.println(user.get().toString());
    }
}

