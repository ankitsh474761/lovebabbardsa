public class problem2 {
    public static void main(String[] args) {
        //min and max in an array
        int arr[] ={12,23,45,46,900,1,-1};
        maxArr(arr);
    }
    static void maxArr(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            if(i>max){
                max = i;
            }
            if(i<min){
                min = i;
            }
        }
        System.out.println("maximum element is : "+max);
        System.out.println("minimum element is : "+min);
    }
}
