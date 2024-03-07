import java.util.HashMap;
import java.util.HashSet;

public class UniqueElements {
    public static int sumOfUnique(int[] nums){
        HashMap<Integer,Integer> temp = new HashMap<>();

        for(int i=0; i<nums.length; i++){

            if(temp.containsKey(nums[i])){
                if(temp.get(nums[i]) > 2){
                    continue;
                }
                temp.put(nums[i], temp.get(nums[i])+1);
            }else{
                temp.put(nums[i],1);
            }
        }

        int out = 0;

        for(int i=0; i<nums.length; i++){
            if(temp.get(nums[i]) > 1){

            }else{
                out += nums[i];
            }
        }
        return out;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        System.out.println(sumOfUnique(nums));
    }
}
