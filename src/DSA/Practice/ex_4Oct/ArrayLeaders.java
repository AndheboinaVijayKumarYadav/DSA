package DSA.Practice.ex_4Oct;

import java.util.ArrayList;

public class ArrayLeaders {

    // method to find the leaders of array
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int leader = arr[n-1];
        list.add(leader);

        for(int i = n-2;i>=0;i--){

            if(arr[i] >= leader){
                list.add(0,arr[i]);
            }
            leader = Math.max(leader,arr[i]);
        }

        return list;
    }
}
