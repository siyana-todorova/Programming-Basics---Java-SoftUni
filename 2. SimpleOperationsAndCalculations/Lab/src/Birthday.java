import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());
        double percentage2 = percentage * 0.01;
        int obem = a*b*h;
        double liters = obem * 0.001;
        double real = liters*(1-percentage2);
        System.out.printf("%.3f",real);
    }
}
