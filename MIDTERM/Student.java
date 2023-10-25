import java.util.Scanner;

public class Student {
    private String first_name;
    private String middle_name;
    private String last_name;
    private String suffix;

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddleName() {
        return middle_name;
    }

    public void setMiddleName(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String toString() {
        return  "\n    First Name: " + first_name +
                "\n    Middle Name: " + middle_name +
                "\n    Last Name: " + last_name +
                "\n    Suffix: " + suffix +
                "\n    Full Name: " + first_name + " " + middle_name + " " + last_name + " " + suffix;
    }

    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        student.setFirstName(scanner.nextLine());

        System.out.print("Enter Middle Name: ");
        student.setMiddleName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        student.setLastName(scanner.nextLine());

        System.out.print("Enter Suffix: ");
        student.setSuffix(scanner.nextLine());

        scanner.close();

        System.out.println(student);
    }
}
