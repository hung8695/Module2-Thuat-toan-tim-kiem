public class BinarySearch {
    public static void main(String[] args) {
        int[] list={2,4,5,6,7,8,10,11,13,15,16,17,18};
        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch(list, 79)); /*12 */
        System.out.println(binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch(list, 5));  /*-1 */
        System.out.println(binarySearch(list, 80)); /*-1 */
    }
    static int binarySearch(int []list,int key){
        int left=0;
        int right=list.length-1;
        while (right>=left){
            int mid=(left+right)/2;
            if(key<list[mid]){
                right=mid-1;
            } else if(key==list[mid]){
                return mid;
            } else
                left=mid+1;
        }
        return -1;
    }
}
