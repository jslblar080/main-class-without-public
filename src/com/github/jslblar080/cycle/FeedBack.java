package com.github.jslblar080.cycle;

import com.github.jslblar080.main.WithPublic;

// main 클래스에서 public 접근 제어자를 생략할 경우
// com.github.jslblar080.main.WithPublic is not public in com.github.jslblar080.main;
// cannot be accessed from outside package

public class FeedBack {
    public FeedBack() {
        System.out.println("cycle 패키지의 FeedBack() 메서드입니다.");
        var strArg = new String[]{""};
        WithPublic.main(strArg);
    }
}
