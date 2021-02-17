public class A1760_Minimum_Limit_of_balls_in_a_bag {

        public static int minimumSize(int[] nums, int maxOperations) {
            int max = 0;
            for (int num : nums) max = Math.max(max, num);
            int res = (int) 1e9;
            int left = 1, right = max;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (bs(nums, mid) > maxOperations) {
                    left = mid + 1;
                } else {
                    res = Math.min(res, mid);
                    right = mid - 1;
                }
            }
            return res;
        }

        public static int bs(int[] nums, int guess) {
            int count = 0;
            for (int num : nums) {
                if (num > guess) { // 9 > 3; 5 > 3; 3 > 3  9 = 3 + 3 + 3
                    count += (num - 1) / guess;
                    //System.out.println("cur = " + cur + " guess = " + guess);
                    // if (num % guess == 0) count += cur;
                    // else count += cur - 1;
                }
            }
            System.out.println("guess = " + guess + " count = " + count);
            return count;
        }

    public static void main (String[] args){
        int[] nums = new int[5];
        nums[0] = 2;
        nums[1] = 4;
        nums[2] = 8;
        nums[3] = 2;
        int result = minimumSize(nums , 4);
        System.out.println(result);

    }
}


