import java.util.*;

/**
 * Array, ArrayList
 * Map, HashMap
 * Set, HashSet
 * for, forEach
 */
public class Test1 {
    public static void Log() {
        System.out.println("안녕하세요 오랜만에 자바를 작성합니다");
        System.out.println("자바와 스프링을 다시 해봅시다");
        System.out.println("일단 자바 자주 쓰는것 위주로");
    }

    public static void main(String args[]) {
//        Test1.Log();
//        ArrayList<String> test = new ArrayList<String>();
//        ArrayList<String> result = new ArrayList<>();
//        test.add("a");
//        test.add("b");
//        test.add("c");
//        test.add("d");
//        System.out.println("--------------------------------------------");
//        int i = 0;
//        test.forEach((value) -> {
//            result.add(value + i);
//        });
//        System.out.println(result);

        // Map
        HashMap<String,String> myHash = new HashMap<String,String>();
        Map<String,String> myHash2;

        myHash.put("key1", "이렇게");
        myHash.put("key2", "썻었지");

//        System.out.println(myHash.get("key1"));
//        System.out.println(myHash.keySet());
//        System.out.println(myHash.values());

        // myHash을 복사해서 myHash2에 얕은 복사
        myHash2 = (Map<String, String>) myHash.clone();
        myHash.remove("key2");

//        System.out.println(myHash);
//        System.out.println(myHash2);


        // Set
        Set<String> mySet = new HashSet<String>();
        mySet.add("A");
        mySet.add("B");
        mySet.add("A");
//        System.out.println(mySet);


        // Array
        int[] myNums = {1,2,3,4,5,6};
        for(int num : myNums) {
//            System.out.println(num);
        }




    }
}
