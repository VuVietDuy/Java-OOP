package excercise_java_basic;

import java.util.Scanner;

public class j001 {
    public static void main(String[] arge) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println(a/b);

        sc.close();
    }
}
