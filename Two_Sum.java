
/*Q1) Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

  */
import java.util.HashMap;
import java.util.Map;


public class Two_Sum {

   public static int[] twoSum(int[] nums, int target){
    Map<Integer,Integer> map = new HashMap<>();

    for(int i = 0; i < nums.length; i++){
        int compliment = target - nums[i];

        if(map.containsKey(compliment)){
            return new int[]{map.get(compliment), i};
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No Solution Found");
   }


 public static void main(String[] args) {
    int[] nums = {2,7,11,15};
    int target = 9;

    int[] result = twoSum(nums, target);
    System.out.println("Indices: [" + result[0] + "," + result[1] + "]");
 }   
}
