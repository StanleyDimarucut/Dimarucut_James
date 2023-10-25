import java.util.*;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String birthday;
    private String address;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return  "\n    First Name ='" + firstName + '\'' +
                "\n    Middle Name ='" + middleName + '\'' +
                "\n    Last Name ='" + lastName + '\'' +
                "\n    Age = " + age +
                "\n    Birthday ='" + birthday + '\'' +
                "\n    Address ='" + address;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("James");
        person.setMiddleName("Stanley");
        person.setLastName("Dimarucut");
        person.setAge(20);
        person.setBirthday("May 20, 2003");
        person.setAddress("Nichols Heights Guadalupe, Cebu City");

        System.out.println(person);
    }
}
