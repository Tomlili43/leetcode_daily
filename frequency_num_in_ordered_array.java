public class frequency_num_in_ordered_array {
    
    public int GetNumOfK(int[] arr,int k) {
        int low = GetFirstGreater(arr,k-0.5);
        int high = GetFirstGreater(arr,k+0.5);
        
        return high-low;
    }

    public int GetFirstGreater(int[]arr,double k) {
        int low = 0;
        int high = arr.length-1;
        //break condition: low > high
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(arr[mid] < k) {
                low = mid+1;
            }else if(arr[mid] > k) {
                high = mid-1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,4,5};
        int k = 3;
        System.out.println("The number of "+k+" in the array is:");
        frequency_num_in_ordered_array f = new frequency_num_in_ordered_array();
        System.out.println(f.GetNumOfK(arr,k));

    }
}
