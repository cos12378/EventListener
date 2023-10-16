package com.example.eventlistener.eventmanage;

import com.example.eventlistener.service.SendEmailService;
import com.example.eventlistener.service.UpdatePointService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SignUpUserEventHandler {

    private final SendEmailService sendEmailService;
    private final UpdatePointService updatePointService;

    @EventListener
    public void sendMail(final SignUpUserEvent signUpUserEvent) {
        final String email = signUpUserEvent.getUser().getEmail();
        sendEmailService.send(email, "회원가입 완료", "안녕하세요! 회원 가입 되었습니다." );
    }

    @EventListener
    public void rewardPoint(final SignUpUserEvent signUpUserEvent) {
        final String email = signUpUserEvent.getUser().getEmail();
        updatePointService.rewardPoint(email);
        System.out.println("포인트 지급 완료");
    }
}