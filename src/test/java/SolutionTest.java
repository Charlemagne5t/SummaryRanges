import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void summaryRangesTest1() {
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> output = new ArrayList<>(List.of("0->2", "4->5", "7"));
        Assert.assertEquals(output, new Solution().summaryRanges(nums));
    }

    @Test
    public void summaryRangesTest2() {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        List<String> output = new ArrayList<>(List.of("0", "2->4", "6", "8->9"));
        Assert.assertEquals(output, new Solution().summaryRanges(nums));
    }
}
