package com.example.eventlistener.request;

import com.example.eventlistener.entity.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SignupRequest {

    private Long id;
    private String email;
    private String name;
    private String password;

    @Builder
    public SignupRequest(Long id, String email, String name, String password) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public User toEntity() {
        return User
                .builder()
                .id(id)
                .email(email)
                .name(name)
                .password(password)
                .build();
    }

}
