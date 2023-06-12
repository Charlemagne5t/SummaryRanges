import java.util.ArrayList;
import java.util.List;


public class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        List<String> result = new ArrayList<>();
        int start = nums[0];
        int finish = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 1) {
                finish = nums[i];
            } else {
                if (start != finish) {
                    result.add(start + "->" + finish);
                } else result.add(String.valueOf(start));
                start = nums[i];
                finish = nums[i];

            }
        }
        if (start == finish) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + finish);
        }
        return result;
    }
}
