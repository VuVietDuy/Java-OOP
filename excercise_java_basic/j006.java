package excercise_java_basic;

public class j006 {
    public static void main(String[] args) {

        int[] arr = {1,2,-8,4,-4,6,8,9,10};

        /*
         * Xuất giá trị của tất cả các phần tử trong mảng
         */
        System.out.print("Mang arr co cac phan tu: ");
        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
        /*
         * Tìm phần tử nhỏ nhất
         */
        int min = Integer.MAX_VALUE;
        for(int x : arr) {
            min = Math.min(x, min);
        }
        System.out.println("Phan tu nho nhat: " + min);
    }
}
