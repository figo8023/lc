package q01.s1;


import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            int x = numbers[i];
            if (map.containsKey(target - x)) {
                return new int[] { map.get(target - x) + 1, i + 1 };
            }
            map.put(x, i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args){
        int[] number = {2,5,3,6,7,9,4};
        int target = 16;
        Solution1 solution = new Solution1();
        int[] result = solution.twoSum(number, target);
        System.out.println(result[0] + " + " + result[1]);
    }
}
