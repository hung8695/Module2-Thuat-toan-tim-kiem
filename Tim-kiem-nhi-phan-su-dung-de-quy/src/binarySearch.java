import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("Nhập chiều dài mảng: ");
//        int N= scanner.nextInt();
//        int[] arr=new int[N];
//        for (int i = 0; i < N; i++) {
//            arr[i]=(int)Math.random()*99;
//        }
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println( binarySearch(arr,0,arr.length-1,6));

    }
    static int  binarySearch(int[] array,int left,int right,int value){
        int middle=(left+right)/2;
        if(value==array[middle])
            return middle;
        else if(value>array[middle])
          return   binarySearch(array,middle+1,right,value);
        else if(value<array[middle])
          return   binarySearch(array,left,middle-1,value);
        return -1;
    }
}
