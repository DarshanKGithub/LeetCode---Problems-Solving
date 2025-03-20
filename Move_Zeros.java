class Solution{
    public void moveZeros(int[] nums){
        int nonZeroIndex = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                if(i != nonZeroIndex){
                    int temp = nums[i];
                    nums[i] = nums[nonZeroIndex];
                    nums[nonZeroIndex] = temp;
                }
                nonZeroIndex++;
            }
        }
    }
}

public class Move_Zeros {
public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {0,1,0,3,12};
    solution.moveZeros(nums);
    for( int num : nums){
        System.out.println(num + " ");
    }
}    
}
