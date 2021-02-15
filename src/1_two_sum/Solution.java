import java.util.Map;
import java.util.HashMap;

public class A1_two_sum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(target - nums[i])) {
                result[0] = i ;
                result[1] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main (String[] args){
        int[] nums = new int[5];
        nums[0] = 3;
        nums[1] = 4;
        nums[2] = 9;
        nums[3] = 6;
        nums[4] = 7;
        int[] result = twoSum(nums , 9);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

}

