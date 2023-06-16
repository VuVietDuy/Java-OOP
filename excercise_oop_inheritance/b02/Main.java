package excercise_oop_inheritance.b02;

public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff("Duy", "Ha Noi", "PTIT", 1000);
        Student student = new Student("Nhung", "Ha Nam", "Mutilmedia", 3, 3.6);
        
        System.out.println(student.getRating());
        System.out.println(staff.upToSalary(40));
    }
}
 