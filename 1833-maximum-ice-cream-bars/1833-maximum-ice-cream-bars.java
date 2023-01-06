import java.util.Arrays;

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int numIceCream = 0;
        for (int cost : costs) {
            if (cost <= coins) {
                numIceCream++;
                coins -= cost;
            }
        }
        return numIceCream;
    }
}
