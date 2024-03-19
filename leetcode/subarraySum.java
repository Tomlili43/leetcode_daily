public class subarraySum {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int[] preSum = new int[len];
        // preSum[i] = preSum[i-1]
        preSum[0]=nums[0];
        for(int i =1;i<len;i++) preSum[i] = preSum[i-1]+nums[i];

        int count = 0;
        for(int i=0;i<len;i++){
            if(preSum[i]==k){
                count++;
            }
            for(int j=i+1;j<len;j++){
                if(preSum[j]-preSum[i]==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        subarraySum test = new subarraySum();
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println(test.subarraySum(nums, k));
    }
}
