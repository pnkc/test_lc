public class A1753_Maximum_Score_Moving_stone_opt {

    public static int maximumScore(int a, int b, int c) {
        int sum = a + b + c;
        int max = Math.max(a, Math.max(b, c));
        return Math.min(sum/2, sum - max);
    }

    public static void main (String[] args){

        int result1 = maximumScore(2 ,4, 6);
        System.out.println(result1);
        int result2 = maximumScore(4 ,4, 6);
        System.out.println(result2);

    }
}

