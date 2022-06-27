package ch08.innerClass;

public class MessengerTest {
    public static void main(String[] args) {

        // 익명 클래스
        Messenger test = new Messenger() {

            @Override
            public void setMessage(String msg) {
                System.out.println("test에서 메세지를 설정합니다 : " + msg);
            }

            @Override
            public String getMessage() {
                return "test";
            }
        };

        System.out.println(test.getMessage());
        test.setMessage("have a nice day !");
    }

}
