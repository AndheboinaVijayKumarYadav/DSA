package DSA.Practice.ex_5thNov;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] array = {1,1,2};
        List<Integer>  duplicates = findDuplicates(array);
        System.out.println(duplicates);
    }

    public static List<Integer> findDuplicates(int[] nums) {

        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(!set.add(nums[i])) {
                result.add(nums[i]);
            }

        }
        return result;


    }
}
