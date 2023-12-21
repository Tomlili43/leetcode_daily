package array;

public class FindMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        double res = 0;
        for(int i =0;i<k;i++){
            res +=nums[i];
        }
        double sum = res;
        int len = nums.length;
        for(int j = k;j<len;j++){
            sum = (sum-nums[j-k]+nums[j]);
            if(sum>res)res = sum;
        }
        return res/k;
    }
    public static void main(String[] args){
        FindMaxAverage f = new FindMaxAverage();
        int[] nums = {0,4,0,3,2};
        int k = 1;
        System.out.println(f.findMaxAverage(nums,k));
    }
}
