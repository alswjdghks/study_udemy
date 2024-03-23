package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //여러 후보가 단일 값 의존성을 자동 와이어링할 자격이 있는 경우 해당 Bean에 우선권 부여
public class MarioGame implements GamingConsole {
    public void up() {
        System.out.println("Jump");
    }
    public void down() {
        System.out.println("Go into a hole");
    }
    public void left() {
        System.out.println("Go back");
    }
    public void right() {
        System.out.println("Accelerate");
    }
}
