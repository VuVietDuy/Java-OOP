package excercise_oop_java.b03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        Student student = new Student();

        // student.setAddress(address);
        // student.setName("Vu Viet Duy");
        // student.setAge(20);
        // student.setScore(10);

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        String name = sc.nextLine();
        student.setName(name);
       
        System.out.print("Nhap tuoi: ");
        int age = Integer.parseInt(sc.nextLine());
        student.setAge(age);
        
        System.out.print("Nhap diem: ");
        double score = sc.nextDouble();
        student.setScore(score);
        sc.nextLine();

        System.out.print("Nhap quoc gia: ");
        String country = sc.nextLine();
        address.setCountry(country);
        
        System.out.print("Nhap tinh/thanh pho: ");
        String city = sc.nextLine();
        address.setCity(city);

        System.out.print("Nhap quan/huyen: ");
        String district = sc.nextLine();
        address.setDistrict(district);

        System.out.print("Nhap thon/xom: ");
        String street = sc.nextLine();
        address.setStreet(street);

        student.setAddress(address);

        System.out.println(student.toString());

        sc.close();
    }
}
