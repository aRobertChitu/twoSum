import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array =  new int[]{2,7,11,15};

        System.out.println(Arrays.toString(twoSum(array, 9)));

    }
    public  static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map =  new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i, map.get(target-nums[i])};
            } else{
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }

}