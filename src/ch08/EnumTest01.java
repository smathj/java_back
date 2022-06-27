package ch08;


enum Status {
    // 기본 내장 public static final
    READY,
    SEND,
    COMPLETE,
    CLOSE
}

public class EnumTest01 {
    public static void main(String[] args) {

        Status work = null;


        System.out.println(Status.READY);
        System.out.println(Status.SEND);
        System.out.println(Status.COMPLETE);
        System.out.println(Status.CLOSE);


        System.out.println(Status.valueOf("READY"));
        System.out.println(Status.valueOf("SEND"));
        System.out.println(Status.valueOf("COMPLETE"));
        System.out.println(Status.valueOf("CLOSE"));

        int n = 2;

        switch(n) {
            case 1:
                work = Status.READY;
                break;
            case 2:
                work = Status.SEND;
                break;
            case 3:
                work = Status.COMPLETE;
                break;
            case 4:
                work = Status.CLOSE;
                break;
        }
        System.out.println("현재 직업 상태 : " + work);
    }
}
