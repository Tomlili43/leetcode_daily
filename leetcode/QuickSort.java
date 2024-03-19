import java.util.Arrays;

public class QuickSort {
    public int[] inventoryManagement(int[] stock, int cnt) {
        quickSort(stock,0,stock.length-1);
        return Arrays.copyOf(stock,cnt);
    }
    
    private void quickSort(int[]stock,int l,int r){
        if(l>=r) return;
        int i =l, j =r;
        while(i<j){
            while(i<j&&stock[j]>=stock[l])j--;
            while(i<j&&stock[i]<=stock[l])i++;
            swap(stock,i,j);
        }
        swap(stock,l,i);
        quickSort(stock,l,i-1);
        quickSort(stock,i+1,r);
    }
    
    private void swap(int[] stock,int i,int l){
        int temp = stock[i];
        stock[i] = stock[l];
        stock[l] = temp;
    }


    public static void main(String[] args) {
        int[] stock = {0,0,1,2,4,2,2,3,1,4};
        int cnt = 8;
        QuickSort qs = new QuickSort();
        int[] res = qs.inventoryManagement(stock,cnt);
        System.out.println(Arrays.toString(res));
    }
    }
