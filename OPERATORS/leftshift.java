package OPERATORS;

import java.util.Scanner;

public class leftshift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //8 --> 1 0 0 0
        int shift = sc.nextInt();
        int b = a >> shift; //2  --> 0 1 
        System.out.println(b);
        sc.close();
    }
}
