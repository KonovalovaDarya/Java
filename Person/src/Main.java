import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name  = "Ivan";
        String middleName = "Ivanovich";
        String familyName = "Ivanov";
        int age = 0;

        Person person = new Person(name, middleName, familyName, age);
        System.out.println(person.toSting());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter person's age: ");
        person.setAge(scanner.nextInt());

        if (person.getAge() != 0) {
            System.out.print("Person's birth year: " + person.birthYear());
        }
    }
}