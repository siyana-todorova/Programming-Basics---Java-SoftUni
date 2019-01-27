import java.util.Scanner;

public class ScholarShip2 {
    static double first = 0, second = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double srednaOcenka = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());


        if (income < minSalary && srednaOcenka > 4.5) {
            first = 0.35 * minSalary;
        }

        if (srednaOcenka >= 5.5) {
            second = 25 * srednaOcenka;
        }

        if (first == 0 && second == 0) {
            System.out.print("You cannot get a scholarship!");
        } else if (first >= second) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(first));
        } else {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(second));
        }
    }
}