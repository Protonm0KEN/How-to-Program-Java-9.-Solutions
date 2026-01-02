package Exercise4_27SelfCheck;

import java.io.PrintStream;

public class DanglingElseProblemCheck {

    static void main() {
//        int x = 9;
//        int y = 11;
//
//        if (x<10)
//            if(y>10)
//                System.out.println("*****");
//            else
//                System.out.println("#####");
//        System.out.println("$$$$$");
//
//        if(x<10)
//        {
//            if(y>10)
//                System.out.println("*****");
//        }
//        else
//        {
//            System.out.println("#####");
//            System.out.println("$$$$$");
//        }

        int x = 5;
        int y = 7;

        if(y == 8)
            if(x==5)
                System.out.println("@@@@@");
        else
                System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");
    }
}
