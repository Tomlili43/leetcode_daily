import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<Integer>();
    for (int i = 0; i < nums.length; i++) {
      if (set.contains(nums[i])) {
        return true;
      }
      set.add(nums[i]);
    }
    return false;
  }
  public static void main(String[] args) {
    ContainDuplicate cd = new ContainDuplicate();
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
    System.out.println(cd.containsDuplicate(nums));
  }
}
