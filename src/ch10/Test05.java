package ch10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList
 *  1. ArrayList와는 다르게 메모리를 순서대로(연속성) 확보하여 저장하지 않는다, 임의의 위치에 저장함(비연속성)
 *
 *  2. 장점 : 메모리 효율이 ArrayList 보다 높다, 데이터 삭제, 삽입에 용이
 *     단점 : 검색 기능은 ArrayList 보다 낮다, 메모리 더씀
 *
 *  3. "노드" 라는 데이터 (2~3)
 *      - 데이터(value) 필수값
 *      - 다음 데이터의 주소, 단방향 (단일 링크드리스트) 필수값
 *          example) 노드(header) -> 노드 -> 노드 -> 노드(tail)
 *      - 이전 데이터의 주소, 양방향 (양방향 링크드리스트)
 *          example) 노드(header) <-> 노드 <-> 노드 <-> 노드(tail)
 *
 *  4. 시작 위치의 생성된 노드를 "header" 라고 부른다, 내부적으로 값이 설정됨
 *     마지막 위치에 생성된 노드를 "tail" 이라고 부른다, 내부적으로 값이 설정됨
 */

public class Test05 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("서울");
        list.add("북경");
        list.add("상해");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + "\t");
        }

        list.add(1, "LA");

        print(1, list);

        list.addFirst("런던");

        print(2, list);

        list.addLast("서울");

        print(3, list);

        // tail 뒤에 새로운 노드 추가 ( 즉 tail 바낌 )
        list.offer("파리");

        print(4, list);

        // head 앞에 새로운 노드 추가 ( 즉 head 바낌 )
        list.offerFirst("로마");

        print(5, list);

        // 마지막 요소로 추가
        list.offerLast("베른");

        print(6, list);

        // head 추출
        System.out.println("7 : " + list.peek());

        // 첫번째 요소 추출
        System.out.println("8 : " + list.peekFirst());

        // 마지막 요소 추출
        System.out.println("9 : " + list.peekLast());

        // head 추출후 삭제
        list.poll();

        print(10, list);

        // 첫번쨰 요소 추출후 삭제
        list.pollFirst();

        print(11, list);

        // 마지막 요소 추출후 삭제
        list.pollLast();

        print(12, list);

        // 첫번쨰 요소 위치에 데이터를 추가
        list.push("제주");

        print(13, list);

        // 첫번째 요소 위치에 데이터를 추출후 삭제
        System.out.println("14 : " + list.pop());


        // [서울, LA, 북경, 상해, 서울, 파리]

        System.out.println("15 : " + list.get(3));
        System.out.println("16 : " + list.getFirst());
        System.out.println("17 : " + list.getLast());

        System.out.println("18 : " + list.indexOf("서울"));
        System.out.println("19 : " + list.lastIndexOf("서울"));

        list.removeFirst();

        print(20, list);

        list.removeLast();

        print(21, list);

        list.remove(3);

        print(22, list);

        list.remove("LA");

        print(23, list);

        List<String> list2 = Arrays.asList("북경", "상해");
        list.addAll(list2);

        Object obj[] = list.toArray();
        System.out.println("24 : " + Arrays.toString(obj));

        String cities[] = new String[0];
        cities = list.toArray(cities);

        System.out.println("25 : " + Arrays.toString(cities));

        list.removeAll(list2);

        print(26, list);
    }

    public static void print(int n, List<String> list) {
        System.out.println(n + " : " + list);
    }
}
