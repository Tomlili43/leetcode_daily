import java.util.HashMap;

public class FindTarget {
  public int findTargetSumWays(int[] nums, int target) {
    HashMap<HashMap<Integer, Integer>, Integer> dp = new HashMap<HashMap<Integer, Integer>, Integer>();
    return backTrack(0, 0, nums, target, dp);

  }

  public int backTrack(int i, int total, int[] nums, int target, HashMap<HashMap<Integer, Integer>, Integer> dp) {
    HashMap<Integer, Integer> tmp = new HashMap<>();
    tmp.put(i, total);
    if (i == nums.length) {
      if (total == target) {
        return 1;
      } else {
        return 0;
      }
    } else if (dp.containsKey(tmp)){
      return dp.get(tmp);
    }

    dp.put(tmp,backTrack(i+1,total+nums[i],nums,target,dp) + backTrack(i+1,total+nums[i],nums,target,dp));
    return dp.get(tmp);
  }
  public static void main(String[] args) {
    FindTarget ft = new FindTarget();
    int[] nums = {1,1,1,1,1};
    int target = 3;
    System.out.println(ft.findTargetSumWays(nums, target));
  }
}
