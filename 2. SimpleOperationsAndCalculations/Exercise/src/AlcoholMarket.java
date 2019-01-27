import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double PriceOfWhiskey = Double.parseDouble(scanner.nextLine());
        double QuantityOfBeer = Double.parseDouble(scanner.nextLine());
        double QuantityOfWhine = Double.parseDouble(scanner.nextLine());
        double QuantityOfRakia = Double.parseDouble(scanner.nextLine());
        double QuantityOfWhiskey = Double.parseDouble(scanner.nextLine());
        double PriceOfRakiaLiter = PriceOfWhiskey/2;
        double PriceOfWineLiter = PriceOfRakiaLiter-(PriceOfRakiaLiter*0.4);
        double PriceOfBeerLiter = PriceOfRakiaLiter - (PriceOfRakiaLiter*0.8);
        double AmountOfRakia = QuantityOfRakia*PriceOfRakiaLiter;
        double AmountOfWine = QuantityOfWhine*PriceOfWineLiter;
        double AmountOfBeer = QuantityOfBeer*PriceOfBeerLiter;
        double AmountOfWhiskey = QuantityOfWhiskey*PriceOfWhiskey;
        double AllAmount = AmountOfRakia+AmountOfWine+AmountOfBeer+AmountOfWhiskey;
        System.out.printf("%.2f",AllAmount);
    }
}
