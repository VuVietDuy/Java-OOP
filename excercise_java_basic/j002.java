package excercise_java_basic;

import java.util.Scanner;

public class j002 {
    public static void main(String[] ards) {

        
        /*
         *  Viết chương trình java giải phương trình bậc 2 aX2+ bX + c. Với a, b, c là 2 số nhập vào từ bàn phím.
         */

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double denta = b*b-4*a*c;

        if(denta<0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if(denta==0) {
            System.out.println("x1 = x2 = " + (0-b/(2*a)));
        } else {

            double x1 = (-b + Math.pow(denta, 0.5))/(2.0*a);            
            double x2 = (-b - Math.pow(denta, 0.5))/(2.0*a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        }
    }
}
