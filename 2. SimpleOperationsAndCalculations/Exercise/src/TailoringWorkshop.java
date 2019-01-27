import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());
        double lenght = Double.parseDouble(scanner.nextLine());
        double cover = count * (weight + 2 * 0.30) * (lenght + 2 * 0.30);
        double square = count * (weight / 2) * (weight / 2);
        double USD = cover * 7 + square * 9;
        double BGN = USD * 1.85;
        System.out.printf("%.2f" + " " + "USD\n", USD);
        System.out.printf("%.2f" + " " + "BGN", BGN);
        }
    }