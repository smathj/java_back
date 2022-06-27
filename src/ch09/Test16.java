package ch09;

import java.util.Arrays;
import java.util.List;

// Arrays
public class Test16 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6};

        Integer nums2[] = new Integer[6];

        for(int i=0; i<nums.length; i++) {
            nums2[i] = Integer.valueOf(nums[i]);
        }

        System.out.println(nums);
        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(nums).charAt(0));


        List<Integer> list = Arrays.asList(nums2);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));





    }
}
