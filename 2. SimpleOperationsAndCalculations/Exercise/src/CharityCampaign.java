import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int confectioner = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());
        double CakesPrice = cakes*45;
        double WafflesPrice = waffles*5.80;
        double PancakesPrice = pancakes*3.20;
        double AmountOfAll = (CakesPrice+WafflesPrice+PancakesPrice)*confectioner;
        double AmountOfCampaign = AmountOfAll*days;
        double AmountAfterExpence = AmountOfCampaign - (AmountOfCampaign/8);
        System.out.printf("%.2f",AmountAfterExpence);
    }
}
