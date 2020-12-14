

import java.sql.SQLOutput;
import java.util.HashMap;

public class GoodPairs {

    public static void main(String[] args) {

        int[] array = {1,2,8,1,2};
        int out = numIdenticalPairs(array);
        System.out.println(out);
    }
    public static int numIdenticalPairs(int[] nums) {

        int goodPair = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j])
                    goodPair++;
            }
        }

       return goodPair;
    }
}
