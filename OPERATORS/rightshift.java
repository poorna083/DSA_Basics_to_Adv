package OPERATORS;

import java.util.Scanner;

public class rightshift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 8 --> 1 0 0 0
        int shift = sc.nextInt(); //2 --> 1 0 0 0 0 0 
        int b = a << shift; 
        System.out.println(b);
    }
}
