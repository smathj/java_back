package ch09;

import java.util.Random;

// Random
//public class Test15 {
//    public static void main(String[] args) {
//
//        Random r1 = new Random();
//
//        for(int i=0; i<5; i++) {
//            System.out.print(r1.nextInt()+"\t");
//            System.out.print(r1.nextInt(10)+"\t");  // 0 ~ 9
//            System.out.print(r1.nextBoolean()+"\t");
//            System.out.print(r1.nextDouble()+"\t"); // 0.0 ~ 0.9xxx
//            System.out.println();
//        }
//    }
//}


// Random 2
public class Test15 {
    public static void main(String[] args) {

        Random r1 = new Random(123); // seed 추가

        for(int i=0; i<5; i++) {
            System.out.print(r1.nextInt()+"\t");
            System.out.print(r1.nextInt(10)+"\t");  // 0 ~ 9
            System.out.print(r1.nextBoolean()+"\t");
            System.out.print(r1.nextDouble()+"\t"); // 0.0 ~ 0.9xxx
            System.out.println();
        }
        
        // 모두 일관되게 나옴, 테스트할떄 ㅇㅇ
    }
}