import java.util.Scanner;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return  "\n    First Name ='" + firstName + '\'' +
                "\n    Middle Name ='" + middleName + '\'' +
                "\n    Last Name ='" + lastName;
    }

    public static void main(String[] args) {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        person.setFirstName(scanner.nextLine());

        System.out.print("Enter Middle Name: ");
        person.setMiddleName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        person.setLastName(scanner.nextLine());

        scanner.close();

        System.out.println(person);
    }
}
