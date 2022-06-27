package ch09;

import java.util.Arrays;

// 정규표현식 2
public class Test19 {
    public static void main(String[] args) {

        String title = "**** 2018 Olympic ****";
        title = title.replaceAll("\\*", "=");
        System.out.println(title);

        title = title.replaceAll("\\w+", "Winter");
        System.out.println(title);

        title = title.replaceAll("Winter", "Olympic");
        System.out.println(title);

        String str = "1, 2, 3, 4, 5, 6, 7, 8";
        String[] result = str.split(",\\s+"); // , 와 공백문자 1개이상을 기준으로
        System.out.println(Arrays.toString(result));

        String temp = "-20";
        temp = temp.replaceFirst("\\W", "+"); // 제일먼저 나타나는 문자가 아닌것을 + 로 바꾸기
        System.out.println(temp);


    }
}
