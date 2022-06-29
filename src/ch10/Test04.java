package ch10;

/**
 * 컬렉션 뷰
 *  1. 컬렉션 데이터에 접근할 수 있는 통로와 같은 객체 ( getter 처럼, 또는 자바스크립트의 프로퍼티 디스크립터 처럼 )
 *  2. 컬렉션과 컬렉션 뷰는 다르다, 컬렉션이 원본이고, 컬렉션 뷰는 말그대로 view 일듯 ( DB View Table 처럼 )
 */

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Enumeration 클래스
 *  1. Iterator와 같은 컬렉션 뷰 역할 (포인터로 접근하는 방식 (hasNext, next... )
 *  2. Iterator와 동기화 지원하지만, ( 오류를 발생 시킬 수 있음 )
 *     Enumeration 동기화를 지원하지 않는다 ( 오류를 발생 시키지 않음 )
 *       - 접근할때 다른데에서 값을 수정하는 상황이 있을 수 있음
 *       - 따라서 동기화를 지원해야 안전하다.
 *  3. 컬렉션 뷰는 데이터를 복사하지 않고, 접근만 한다
 */
public class Test04 {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>(20);

        // vector.add("서울"); == vector.addElement("서울")
        vector.addElement("서울");
        vector.addElement("대구");
        vector.addElement("부산");

        Enumeration<String> en = vector.elements();

        System.out.println("[Enumerration 으로 사용으로 표현]");
        // 커서 개념으로 접근
        while(en.hasMoreElements()) {
            String city = en.nextElement();
            System.out.println(city);
        }

        System.out.println("============================");

        // 컬렉션 데이터를 , 컬렉션 뷰로 접근하기 위해서
        Enumeration<String> en2 = vector.elements();

        // Enumeration을 Iterator로 변환
        Iterator<String> iter = en2.asIterator();

        System.out.println("[Iterator 으로 사용으로 표현]");
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }




    }
}
