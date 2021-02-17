import java.util.PriorityQueue;

public class A1753_Maximum_Score_Moving_stone {

        public static int maximumScore(int a, int b, int c) {
            int res = 0;
            PriorityQueue<Integer> pq = new PriorityQueue<>((x1, x2) -> x2 - x1);
            pq.add(a);
            pq.add(b);
            pq.add(c);
            int countZero = 0;
            while (!pq.isEmpty()) {
                if (countZero >= 2) {
                    break;
                }
                int max1 = pq.poll();
                int max2 = pq.poll();
                res += 1;
                pq.add(max1 - 1);
                pq.add(max2 - 1);
                if (max1 - 1 == 0) countZero++;
                if (max2 - 1 == 0) countZero++;
            }
            return res;
        }


    public static void main (String[] args){

        int result1 = maximumScore(2 ,4, 6);
        System.out.println(result1);
        int result2 = maximumScore(4 ,4, 6);
        System.out.println(result2);

    }

}

