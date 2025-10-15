package BINARYSEARCH;

import java.util.Scanner;
class BINARYSEARCH{
    public int binary(int [] array,int target){
        
    }
}
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size");
        int size = sc.nextInt();
        System.out.println("Enter The array");
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        BINARYSEARCH b = new BINARYSEARCH();
        System.out.println(b.binary(array, target));
    }
}
