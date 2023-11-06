public class TwoSortedArray {
    public double findMedianSortedArrays(int[]nums1,int[]nums2){

        int N1 = nums1.length;
        int N2 = nums2.length;
        //N1 be the shortest;
        if(N1>N2){
            return findMedianSortedArrays(nums2,nums1);
        }
        if(N1==0){
            double median = ((double) nums2[N2/2] + (double) nums2[(N2-1)/2])/2;
            return median;
        }
        int MIN_VALUE = 0x80000000;
        int MAX_VALUE = 0x7fffffff;
        int size = N1+N2;
        int cutL = 0;
        int cutR = N1;
        int cut1 = cutL+(cutR-cutL)/2;
        int cut2 = size/2-cut1;
        //binary search
        while(cut1<N1){
            cut1 = cutL+(cutR-cutL)/2;
            cut2 = size/2-cut1;
            int L1 = cut1==0 ? MIN_VALUE:nums1[cut1-1];
            int L2 = cut2==0 ? MIN_VALUE:nums2[cut2-1];
            int R1 = cut1==N1 ? MAX_VALUE:nums1[cut1];
            int R2 = cut2==N2 ? MAX_VALUE:nums2[cut2];

            if(L1>R2){
                cutR = cut1-1;
            }
            if(L2>R1){
                cutL = cut1+1;
            }
            if(L1<=R2&&L2<=R1){
                if (size%2==0) {
                    double median1 = L1>=L2? L1:L2;
                    double median2 = R1<=R2? R1:R2;
                    double median = (median1+median2)/2;
                    return median;
                }else{
                    return (double) R1<=R2? R1:R2;
                }
            }
        }
        return -1; 

    }
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 ={3,4};
        TwoSortedArray twoSortedArray = new TwoSortedArray();
        double result = twoSortedArray.findMedianSortedArrays(nums1,nums2);
        System.out.println(result);
    }
}
