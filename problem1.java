public class problem1 {
    //reverse array

    public static void main(String[] args) {
//        String str = "0100110101";
//        System.out.println(reverse1(str));
//        System.out.println(reverse2(str));

        int arr[] = {1,2,3,4,5,6};
        reverse(arr,0,5);

        int no = 123456;
        System.out.println();
        System.out.println("reversing number :     "+reverseNO(no));

    }

    static int reverseNO(int no){
        int rem,rev = 0;
        while ( no != 0 ){
            rem = no % 10;
            rev = rev * 10 + rem;
            no = no / 10;
        }
        return rev;
    }

    static String reverse1(String str){
        StringBuilder builder = new StringBuilder();
        for(char ch : str.toCharArray()){
            builder.append(ch);
        }
        builder.reverse();
        return builder.toString();
    }

   static void reverse(int arr[],int star,int en) {
       int start = 0;
       int end = arr.length - 1;
       int temp;
       while (end > start) {
           temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
       for (int i : arr) {
           System.out.print(i + " ");
       }
   }
}
