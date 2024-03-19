import java.util.*; 
class ThreeSumClosest {
    public int threeSumClosest(int[] nums,int target) {
        int len = nums.length;
        // special condi
        if(len < 3 || nums == null){
            return 0;
        }
        Arrays.sort(nums);// sort
        int minDistance = Integer.MAX_VALUE;
        int ans_sum = Integer.MAX_VALUE;
        for(int i =0;i<len;i++){
            // continue condi
            if(i>=1 && nums[i]==nums[i-1]){
                continue;
            }
            else {
                // judge L R
                int L = i+1;
                int R = len-1;
                while(L<R){
                    int sum = (nums[i]+nums[L]+nums[R]);
                    int distance = Math.abs(sum-target);
                    if(distance<minDistance){
                        minDistance = distance;
                        ans_sum = sum;
                        if (minDistance==0) {
                            return sum;
                        }
                    }
                    else{
                        if((sum-target)>0){
                            R--;
                        }
                        if((sum-target)<0){
                            L++;
                        }

                    }
                    
                }
            }
            //
        }
        return ans_sum;
    }

    public static void main(String[] args) {
        ThreeSumClosest s = new ThreeSumClosest();
        int[] nums = {1,1,1,1};
        int target = 1;
        int ans = s.threeSumClosest(nums,target);
        System.out.println(ans);
    }
}