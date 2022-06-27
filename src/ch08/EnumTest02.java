package ch08;

enum Mandarin {
    금귤(600),
    한라봉(500),
    레드향(300),
    천혜향(400),
    황금향(800);

    // enum 클래스의 필드
    private int price;
    
    // enum 클래스의 생성자, 열거 상수의 ()안의 값이 생성자에 전달된다
    Mandarin(int p) {
        price = p;
    }

    // enum 클래스의 메서드
    int getPrice() {
        return price;
    }
}

public class EnumTest02 {
    public static void main(String[] args) {

        Mandarin ma = Mandarin.한라봉;

        // 2.
        if(ma == Mandarin.한라봉) {
            System.out.println("ma는 한라봉입니다");
        }
        System.out.println(ma + " 가격 : " + ma.getPrice());

// 1.
//        System.out.println("이름 : " + ma.name());    // 한라봉
//        System.out.println("위치 : " + ma.ordinal()); // 1
//        System.out.println("황금향과의 상대 위치 : " + ma.compareTo(Mandarin.황금향));  // -3 ( 기준은 파라미터인 황금향 )
//
//        Mandarin ma2 = Mandarin.valueOf("레드향");
//        System.out.println(ma2);    // 레드향

        // 2.



        Mandarin list[] = Mandarin.values();
        System.out.println("== 귤의 종류 ==");
        for(Mandarin m : list) {
            System.out.println(m + ":" + m.getPrice());
        }




    }
}
