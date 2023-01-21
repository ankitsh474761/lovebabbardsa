import java.util.Arrays;

public class problem4 {
    public static void main(String[] args) {

//==========================================================================================================
        //DUTCH NATIONAL FLAG PROBLEM

        //sort an array of 0,1,2


        int a[] ={0 ,2, 1, 2, 0};
        int n = a.length;
        sortArr(a,n);
    }
    static void sortArr(int a[],int n){
        int high = a.length-1;
        int low = 0 ;
        int mid = 0;
        while(mid <= high){
            switch (a[mid]){
                // if mid ==0 swap mid and low and increment both
                case 0:
                    int temp;
                    temp   = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;

                case 1:
                    //if mid = 1 increment mid only
                    mid++;
                    break;

                case 2:
                    //if mid =2 swap mid and high and decrement high
                    temp= a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                    break;
            }
        }
        System.out.println(Arrays.toString(a));


    }
}
