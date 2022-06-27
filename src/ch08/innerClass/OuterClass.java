package ch08.innerClass;

public class OuterClass {

    // 로컬 클래스
   public void method1() {
       
       // 내부 클래스는 모두 접근 제한자 사용 불가
       // static도 불가
       class LocalClass {
           int d;
           void method5() {
               System.out.println("LocalClass : " + d);
           }
       }
       
       LocalClass inner = new LocalClass();
       inner.d = 1004;
       inner.method5();
   }


    // 정적 클래스
    static class StaticClass {
        int b;
        static int c;
        void method3() {
            System.out.println("Static Class : " + b);
        }
        static void method4() {
            System.out.println("Static Class : " + c);
        }

    }

    // 인스턴스 클래스
    class InstanceClass {
        int a;

        void method2() {
            System.out.println("Instance Class : " + a );
        }
    }
}
