package com.example.eventlistener.service;

import com.example.eventlistener.entity.User;
import com.example.eventlistener.eventmanage.SignUpUserEvent;
import com.example.eventlistener.repository.UserRepository;
import com.example.eventlistener.request.RewardRequest;
import com.example.eventlistener.request.SignupRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignUpUserService {

    private final UserRepository userRepository;
    private final ApplicationEventPublisher eventPublisher;

    public void register(final SignupRequest signupRequest) {
        final User user = userRepository.save(signupRequest.toEntity());
        eventPublisher.publishEvent(new SignUpUserEvent(user)); // 해당하는 이벤트를 등록한 리스너들에게 알림
    }

}
