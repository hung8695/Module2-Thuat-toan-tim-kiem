import java.util.LinkedList;

import java.util.Scanner;

public class FindMaximumSubsequence {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi");
        LinkedList<Character> list =new LinkedList<>();
        Scanner scanner= new Scanner(System.in);
        String str=scanner.nextLine();
        list.add(str.charAt(0));
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>list.getLast()){
                list.add(str.charAt(i));
            }
        }
        for(Character ch:list){
            System.out.print(ch);
        }
    }

}
