package ch10;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * Vector 자료형
 * 1. ArrayList와 같다
 * 2. 차이점은, 동기화 처리를 한다,
 * 3. List 인터페이스를 상속한다 ( example, ArrayList, Vector, LinkedList )
 *
 */
public class Test03 {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>(20);

        // vector.add("서울"); == vector.addElement("서울")
        vector.addElement("서울");
        vector.addElement("도쿄");
        vector.addElement("뉴욕");

        for(int i=0; i<vector.size(); i++) {
            // vector.get(index) == vector.elementAt(index);
            System.out.println(vector.elementAt(i));
        }

        System.out.println("\n");

        // 제일 첫번째 요소
        System.out.println("1 : " + vector.firstElement());

        // 제일 마지막 요소
        System.out.println("2 : " + vector.lastElement());


        // 2번 인덱스에 "파리" 추가(뒷부분은 밀어낸다)
        vector.insertElementAt("파리", 2);

        // 출력
        print(3,vector);

        // 1번 인덱스에 값 수정
        vector.setElementAt("런던", 1);

        // 출력
        print(4,vector);

        // 전체 용량 추출
        System.out.println("3 : " + vector.capacity()); // 20
        
        // 현재 용량의 크기
        System.out.println("4 : " + vector.size());     // 4

        // 현재 용량의 크기에 맞게 크기 변경
        vector.trimToSize();

        // 전체 용량 추출
        System.out.println("5 : " + vector.capacity()); // 4

        // 해당 요소 삭제( 크기도 줄어듬 )
        vector.removeElement("뉴욕");

        // 출력
        print(6,vector);

        // 해당 인덱스 요소 삭제 ( 크기도 줄어듬 )
        vector.removeElementAt(1);

        // 출력
        print(7,vector);

        // 모든 요소 삭제 ( 크기도 줄어듬 )
        vector.removeAllElements();

        // 출력
        print(8,vector);

        List<String> list = Arrays.asList("서율", "도쿄", "뉴욕");

        // 데이터 추가 , 크기는 3
        vector.addAll(list);

        // 출력
        print(9,vector);

        // 크기 설정, 빈 3개의 인덱스의 요소는 null로 채워짐
        vector.setSize(6);

        // 출력
        print(10,vector);






    }

    public static void print(int n, List<String> vector) {
        System.out.println(n + " : " + vector);
    }
}
