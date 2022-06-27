package ch08.innerClass;

public class OuterClassTest {
    public static void main(String[] args) {

        // 1. 인스턴스 클래스
        // 외부 클래스의 인스턴스가 필요하다
//        OuterClass outer = new OuterClass();
//        OuterClass.InstanceClass inner01 = outer.new InstanceClass();
//        inner01.a = 123;
//        inner01.method2();

        // 2. 정적 클래스
        // 외부 클래스의 인스턴스가 필요없다
//        OuterClass.StaticClass inner02 = new OuterClass.StaticClass();
//        inner02.b = 456;
//        inner02.method3();
//        OuterClass.StaticClass.c = 789;
//        OuterClass.StaticClass.method4();

        // 3. 로컬 클래스
        OuterClass outer = new OuterClass();
        outer.method1();
    }
}
