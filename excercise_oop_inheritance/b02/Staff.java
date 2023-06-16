package excercise_oop_inheritance.b02;

public class Staff extends Person {
    private String school;
    private double salary;

    public Staff(String name, String address, String school, double salary) {
        super(name, address);
        this.school = school;
        this.salary = salary;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double upToSalary(int precent) {
        return salary + (salary * precent) / 100;
    }
}
