package excercise_oop_inheritance.b01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(0, null, 0);

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap radius: ");
        double radius = sc.nextInt();
        cylinder.setRadius(radius);

        sc.nextLine();
        System.out.print("Nhap color: ");
        String color = sc.nextLine();
        cylinder.setColor(color);

        System.out.print("Nhap height: ");
        double height = sc.nextInt();
        cylinder.setHeight(height);

        System.out.println(cylinder.toString());

        System.out.println("Volume: " + cylinder.getVolume());
    
        sc.close();
    }
}
