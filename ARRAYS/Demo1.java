package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int [] array = {1,2,3,4,5};
    // System.out.println(Arrays.toString(array));
    int [] [] array = new int[3][3];
    for(int i=0;i<array.length;i++){
        for(int j=0;j<array[i].length;j++){
            array[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<array.length;i++){
        for(int j=0;j<array[i].length;j++){
            System.out.print((array[i][j])+" ");
        }
        System.out.println();
    }
    for(int [] a: array){
        System.out.println(Arrays.toString(a));
    }
    
   } 
}
