package ARRAYLIST;

import java.util.Scanner;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
