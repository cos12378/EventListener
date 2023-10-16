package com.example.eventlistener.entity;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "Users")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder @Getter
public class User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String name;
    private String password;


    @Builder.Default
    private int point = 0;

    public void setPoint(int newPoint) {
        if (newPoint < 0) {
            throw new IllegalArgumentException("포인트는 음수가 될 수 없습니다.");
        }
        this.point = newPoint;
    }

    @Override
    public String toString(){
        return "User{id=" +id + ", name = '"+ name + "'}";
    }
}
