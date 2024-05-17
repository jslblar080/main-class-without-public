package com.github.jslblar080.cycle;

import com.github.jslblar080.main.WithPublic;

public class FeedBack3 {

    private static int counter = 0;

    public static void response3(int total) {
        if (counter < total) {
            System.out.println(++counter + ": cycle 패키지의 response3() 메서드입니다.");
        } else return;

        WithPublic.main(WithPublic.strArgs);
    }
}
