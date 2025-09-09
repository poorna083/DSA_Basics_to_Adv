package DAY1;
import java.util.*;
public class MyStackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        System.out.println(stack.empty());
        for (int i = 0; i < 5; i++) {
            stack.add(sc.nextLine());
        }
        System.out.println(stack.empty());
        System.out.println(stack);
        sc.close();
    }
}
