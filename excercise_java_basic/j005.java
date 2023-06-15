package excercise_java_basic;

import java.util.Scanner;

public class j005 {
    public static void main(String[] args) {

        /*
         *  So sánh str1 với str2, nếu str1 lớn hơn str2 xuất ra “ok”, nhỏ hơn “ko”, bằng nhau thì xuất ra “equals”.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap str1 :");
        String str1 = sc.next();
        System.out.println("Nhap str1 :");
        String str2 = sc.next();
        int check = str1.compareTo(str2);
        if (check == 1) {
            System.out.println("ok");
        } else if (check == -1) {
            System.out.println("ko");
        } else {
            System.out.println("equals");
        }

        /*
         * Nối 2 chuỗi str1 và str2 sau đó in ra màn hình. str1, str2 nhập từ bàn phím
         */

        System.out.println("Nhap str1 :");
        String s1 = sc.next();
        System.out.println("Nhap str1 :");
        String s2 = sc.next();
        System.out.println(s1.concat(s2));

    }
}
