import java.util.ArrayList;
import java.util.List;


public class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length == 0) return new ArrayList<>();
        List<String> result = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();
        temp.add(nums[0]);
        for (int i = 1; i < nums.length ; i++) {
            if(nums[i] - nums[i - 1] == 1){
                temp.add(nums[i]);
            }else {
                if(temp.size() > 1){
                    result.add(temp.get(0) + "->" + temp.get(temp.size() - 1));
                }else result.add(String.valueOf(temp.get(0)));
                temp.clear();
                temp.add(nums[i]);
            }
        }
        if(temp.size() == 1){
            result.add(String.valueOf(temp.get(0)));
        }else if(temp.size() > 1){
            result.add(temp.get(0) + "->" + temp.get(temp.size() - 1));
        }
        return result;
    }
}
