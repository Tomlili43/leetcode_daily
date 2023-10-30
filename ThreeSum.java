import java.util.*; 
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int len = nums.length;
        // special condi
        if(len < 3 || nums == null){
            return ans;
        }
        Arrays.sort(nums);// sort
        for(int i =0;i<len;i++){
            // break conditon
            if(nums[i]>0){
                break;
            }
            // continue condi
            else if(i>=1 && nums[i]==nums[i-1]){
                continue;
            }
            else {
                // judge L R
                int L = i+1;
                int R = len-1;
                while(L<R){
                    int sum = nums[i]+nums[L]+nums[R];
                    if(sum ==0){
                        ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                        while(L<R && nums[L]==nums[L+1]) L++;
                        while(L<R && nums[R]==nums[R-1]) R--;
                        L++;
                        R--;
                    }
                    if(sum>0){
                        R--;
                    }
                    if(sum<0){
                        L++;
                    }
                }
            }
            //
        }
        return ans;
    }

    public static void main(String[] args) {
        ThreeSum s = new ThreeSum();
        int[] nums = {0,0,0,0}; 
        List<List<Integer>> ans = s.threeSum(nums);
        System.out.println(ans);
    }
}