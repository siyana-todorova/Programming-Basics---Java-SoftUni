import java.util.Scanner;

public class Threebrothers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double TimeOfFirstBrother = Double.parseDouble(scanner.nextLine());
        double TimeOfSecondBrother = Double.parseDouble(scanner.nextLine());
        double TimeOfThirdBrother = Double.parseDouble(scanner.nextLine());
        double TimeOfFishing = Double.parseDouble(scanner.nextLine());
        double AllTime = 1 / (1 / TimeOfFirstBrother + 1 / TimeOfSecondBrother + 1 / TimeOfThirdBrother);
        double Break = AllTime * 0.15;
        double AllPlusBreak = AllTime + Break;
        double Surprise = TimeOfFishing - AllPlusBreak;
        double up = Math.ceil(Surprise);
        double down = Math.floor(Surprise);
        if (Surprise > 0) {
            System.out.printf("Cleaning time: %.2f\n", AllPlusBreak);
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.",Math.floor(Surprise));
        } else  {
            Surprise = Math.abs(Surprise);
            System.out.printf("Cleaning time: %.2f\n", AllPlusBreak);
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.",Math.ceil(Surprise));
        }
    }
}