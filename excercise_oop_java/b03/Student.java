package excercise_oop_java.b03;

/*
 * Neu mot class co tham chieu den mot thuc the khac, duoc goi la quan he HAS-A
 */

public class Student {
    private String name;
    private int age;
    private double score;
    private Address address;

    // public Student(String name, int age, int score, Address address) {
    //     this.name = name;
    //     this.age = age;
    //     this.score = score;
    //     this.address = address;
    // }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getRating() {
        if(score >= 8) {
            return "good";
        } else if(score>=5 && score<8) {
            return "medium";
        } else {
            return "bad";
        }
    }

    public String toString() {
        return this.name + " - " +
            this.age + " - " +
            this.score + " - " +
            this.getRating() + " - " +
            this.address.toString();
    }
}
