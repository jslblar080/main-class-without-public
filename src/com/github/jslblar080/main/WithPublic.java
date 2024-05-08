package com.github.jslblar080.main;

import com.github.jslblar080.cycle.*;

public class WithPublic { // main 클래스에서 public 접근 제어자가 필요한 경우
    public static String[] strArgs;

    public static void main(String[] args) {
        System.out.println("main 패키지의 main() 메서드입니다.");
        FeedBack1.response1(1);
        FeedBack2.response2(2);
        FeedBack3.response3(3);
//        new BackFeed1(1);
//        new BackFeed2(2);
//        new BackFeed3(3);
    }
}

/*
main 패키지의 main() 메서드입니다.
1: cycle 패키지의 response1() 메서드입니다.
main 패키지의 main() 메서드입니다.
1: cycle 패키지의 response2() 메서드입니다.
main 패키지의 main() 메서드입니다.
2: cycle 패키지의 response2() 메서드입니다.
main 패키지의 main() 메서드입니다.
1: cycle 패키지의 response3() 메서드입니다.
main 패키지의 main() 메서드입니다.
2: cycle 패키지의 response3() 메서드입니다.
main 패키지의 main() 메서드입니다.
3: cycle 패키지의 response3() 메서드입니다.
main 패키지의 main() 메서드입니다.
*/

/*
main 패키지의 main() 메서드입니다.
1: cycle 패키지의 BackFeed1() 메서드입니다.
main 패키지의 main() 메서드입니다.
1: cycle 패키지의 BackFeed2() 메서드입니다.
main 패키지의 main() 메서드입니다.
2: cycle 패키지의 BackFeed2() 메서드입니다.
main 패키지의 main() 메서드입니다.
1: cycle 패키지의 BackFeed3() 메서드입니다.
main 패키지의 main() 메서드입니다.
2: cycle 패키지의 BackFeed3() 메서드입니다.
main 패키지의 main() 메서드입니다.
3: cycle 패키지의 BackFeed3() 메서드입니다.
main 패키지의 main() 메서드입니다.
*/