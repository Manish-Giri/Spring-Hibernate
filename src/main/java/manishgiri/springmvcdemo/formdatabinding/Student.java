package manishgiri.springmvcdemo.formdatabinding;

public class Student {
    private String firstName;
    private String lastName;

    public Student() {
        System.out.println("Student Constructor...");
    }

    public String getFirstName() {
        System.out.println("Student firstname Getter called.");
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        System.out.println("Student lastname Getter called.");
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
