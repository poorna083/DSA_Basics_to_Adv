package LINEARSEARCH;

import java.util.Scanner;
import java.util.ArrayList;
class Linkedlist{
    public int isLinkedlist(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                System.out.println("The index is:");
                return i;
            }
        }
        return -1;
    }
}
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(); 
        System.out.println("Enter The size:");
        int size =sc.nextInt();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        int target = sc.nextInt();
        Linkedlist i = new Linkedlist();
        System.out.println(i.isLinkedlist(list, target));
        sc.close();
    }
}
