package ch10;

import java.util.ArrayList;
import java.util.Iterator;

// 이터레이터 ( List, Set 계열 모두 가능 )
public class Test02 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("하북");
        list.add("나북");
        list.add("키북");

        list.forEach((element) -> {
            System.out.println(element);
        });

        System.out.println("=======================================");

        Iterator<String> iter = list.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());;
        }

    }
}
