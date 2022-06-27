package ch09;

import java.util.regex.Pattern;

/**
 * [A-Z][a-zA-Z]* :
 *      첫문자      : A - Z 중 한 글자
 *      두번째 문자  : a - Z 중 한 글자가 0개 이상
 *      example ) Aa, Aab, Aabc
 *
 * [a-zA-Z]+(['-][a-zA-Z]+)*
 *      첫문자     : a - Z 중 1글자 이상
 *      두번째 문자세트 : (['-][a-zA-Z]+) 이 그륩이 0번 이상
 *                      앞부분 : ' 또는 -
 *                      뒷부분 : a - Z 중 한글자
 *                      example ) 'a, -a, -b, 'b 이런게 두개가 합쳐져서
 *                                'a-c  이런식으로 0번이상
 *      example) a'a-c, a'a-c-a'b
 *
 *  - 핸드폰 전화번호 정규 표현식 -
 *  01[0-9]-\\d{3,4}-\\d{4}
 *      젤앞      : 0 - 9 중 한 숫자
 *      중간      : 숫자 3 - 4 번 이상 나옴 example) 250, 231, 6801, 2073
 *      젤뒤      : 숫자가 4 번 나옴 example) 1234, 5123, 6560, 5689
 *
 *
 *  - 이메일 정규 표현식 -
 *  \\w+@\\w+\\.\\w+(\\.\\w+)?               ( ? : 0 또는 1번 )
 *      젤앞      : 문자가 1번이상 나오고 그다음 @ 가 나옴                   example) a@ , good@, dog@
 *      중간      : 문자가 1번이상 나오고 그다음 . 가 나옴                   exmaple) naver. , daum. , gmail.
 *      젤뒤      : 문자가 1번이상 나옴                                   example) com, net, co
 *      젤뒤괄호   : ". 이나오고 문자가 1번이상 나옴" 0또는 1번 나옴          example) .kr
 *
 */
public class Test18 {
    public static void main(String[] args) {

        String firstName = "Oh";
        String lastName = "Jung-Im";
        String tel = "010-1234-5678";
        String email = "purum@ruby.com";

        boolean firstName_check = Pattern.matches("[A-Z][a-zA-Z]*", firstName);
        boolean lastName_check = Pattern.matches("[a-zA-Z]+([-][a-zA-Z]+)*", lastName);

        String tel_pat = "01[0-9]-\\d{3,4}-\\d{4}";
        String email_pat = "\\w+@\\w+\\.\\w+(\\.\\w+)?";

        boolean tel_check = Pattern.matches(tel_pat, tel);
        boolean email_check = Pattern.matches(email_pat, email);

        System.out.println("first Name : " + firstName_check);
        System.out.println("last Name : " + lastName_check);
        System.out.println("tel : " + tel_check);
        System.out.println("email : " + email_check);

        System.out.println(Pattern.matches("\\w", "!"));


    }
}
