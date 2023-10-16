package com.example.eventlistener.request;

import com.example.eventlistener.entity.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RewardRequest {

    private Long id;

    @Builder
    public RewardRequest(Long id) {
        this.id = id;
    }

}
