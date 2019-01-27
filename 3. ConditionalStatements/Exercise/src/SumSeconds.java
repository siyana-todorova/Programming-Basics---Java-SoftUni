import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int TimeOf1 = Integer.parseInt(scanner.nextLine());
        int TimeOf2 = Integer.parseInt(scanner.nextLine());
        int TimeOf3 = Integer.parseInt(scanner.nextLine());
        int All = TimeOf1 + TimeOf2 + TimeOf3;
        int minutes = All / 60;
        int seconds = All % 60;
        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
