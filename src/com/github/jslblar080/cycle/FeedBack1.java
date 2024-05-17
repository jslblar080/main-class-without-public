package com.github.jslblar080.cycle;

import com.github.jslblar080.main.WithPublic;

// main 클래스에서 public 접근 제어자를 생략할 경우
// com.github.jslblar080.main.WithPublic is not public in com.github.jslblar080.main;
// cannot be accessed from outside package

public class FeedBack1 {

    private static int counter = 0;

    public static void response1(int total) {
        if (counter < total) {
            System.out.println(++counter + ": cycle 패키지의 response1() 메서드입니다.");
        } else return;

        WithPublic.main(WithPublic.strArgs);
    }
}
