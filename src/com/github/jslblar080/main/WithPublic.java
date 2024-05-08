package com.github.jslblar080.main;

import com.github.jslblar080.cycle.FeedBack;

public class WithPublic { // main 클래스에서 public 접근 제어자가 필요한 경우
    public static int counter = 0;

    public static void main(String[] args) {
        if (counter < 5) {
            System.out.println(++counter + ": main 패키지의 main() 메서드입니다.");
        } else return;
        new FeedBack();
    }
}

/*
1: main 패키지의 main() 메서드입니다.
cycle 패키지의 FeedBack() 메서드입니다.
2: main 패키지의 main() 메서드입니다.
cycle 패키지의 FeedBack() 메서드입니다.
3: main 패키지의 main() 메서드입니다.
cycle 패키지의 FeedBack() 메서드입니다.
4: main 패키지의 main() 메서드입니다.
cycle 패키지의 FeedBack() 메서드입니다.
5: main 패키지의 main() 메서드입니다.
cycle 패키지의 FeedBack() 메서드입니다.
*/