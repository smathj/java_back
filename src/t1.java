import java.util.ArrayList;
import java.util.List;

public class t1 {

    public static int solution(String str1, String str2) {
        // 자카드 유사도(int) = 두집합의 합집합/두집합의 교집합의 크기
        // 서로 공집합이면 유사도는 1
        /**
         A = {1,1,1,}
         B = {1,1,1,1,1}
         AUB = 5

         A = {1,1,2,2,3}
         B = {1,2,2,4,5}
         AUB = {1,1,2,2,3,4,5}
         AnB = {1,2,2}
         **/
        System.out.println(str1);
        System.out.println(str2);
        String[] str1Word = str1.split("");
        String[] str2Word = str2.split("");

        List<String> str1List = new ArrayList<>();
        List<String> str2List = new ArrayList<>();

        // "가나다라마바사" 7글자
        // "가나", "나다", "다라", "라마", "마바", "바사" 6 set

        // 12345678 8글자
        // 12, 23, 34, 45, 56, 67, 78,  89 8세트

        // 1234 4글자
        // 12 23 34 3개

        // 123456 6글자
        // 12 23 34 45 56 5개


        // 123 3글자
        // 12 23 34 3셋트

        // 12345 5글자
        // 12 23 34 45  4셋트

        // 1234567 7 글자
        // 12 23 34 45 56 67  6 셋트

        // 123456789 9글자
        // 12 23 34 45 56 67 78 89 8셋트

        // 영문자 글자쌍만 유지


        System.out.println("---------1------------");
        String insertStr = null;
        for(int i=1; i<= str1Word.length; i++) {

            String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";
            str1Word[i] =str1Word[i].replaceAll(match, "");
            String removeNum = "[0-9]";

            str1Word[i] =str1Word[i].replaceAll(removeNum, "");

            if(!str1Word[i].equals("")) {
                insertStr += str1Word[i];
                if(i % 2 == 0 ) {
                    str1List.add(insertStr);
                    insertStr = null;
                }
            }
        }

        str1List.forEach((str) -> {
            System.out.println(str);
        });
        
        
//        System.out.println("---------2----------------");
//        for(int i=0; i< str2Word.length; i++) {
//            System.out.println(str2Word[i]);
//        }



        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        t1.solution("가1+나_다3마","하라마나1");
    }
}
