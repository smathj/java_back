package ch09;

// 오토 박싱
public class Test12 {
    public static void main(String[] args) {

        int n1 = 10;
        Integer obj1 = n1; // 오토 박싱(박싱) Integer.valueOf(10);

        Integer obj2 = Integer.valueOf("20");


        int n2 = obj2;  // 오토 박싱(언박싱) obj2.intValue();

        Integer obj3 = 30;  // 오토 박싱

        int n3 = obj3 + 40; // 오토 박싱

        System.out.println(n1 + " : " + obj1);
        System.out.println(obj2 + " : " + n2);
        System.out.println(n3);


    }
}
