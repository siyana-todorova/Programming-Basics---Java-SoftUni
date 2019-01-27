import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname = scanner.nextLine();
        String lastname = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String city = scanner.nextLine();
        System.out.println("You are " + firstname + " " + lastname + "," + " " + "a " + age + "-years old person from" + " " + city + "." );

    }
}