import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double PriceOfTravel = Double.parseDouble(scanner.nextLine());
        int CountOfPuzzels = Integer.parseInt(scanner.nextLine());
        int CountOfDolls = Integer.parseInt(scanner.nextLine());
        int CountOfBears = Integer.parseInt(scanner.nextLine());
        int CountOfMinions = Integer.parseInt(scanner.nextLine());
        int CountOfTrucks = Integer.parseInt(scanner.nextLine());
        double Amount = CountOfPuzzels*2.60+CountOfDolls*3+CountOfBears*4.10+CountOfMinions*8.20+CountOfTrucks*2;
        System.out.println(Amount);
        double CountOfAll = CountOfPuzzels+CountOfDolls+CountOfBears+CountOfMinions+CountOfTrucks;
        System.out.println(CountOfAll);
        double Discount = Amount*0.25;
        System.out.println(Discount);
        double FinalPrice = Amount - Discount;
        System.out.println(FinalPrice);
        double Rent = FinalPrice * 0.10;
        System.out.println(Rent);
        double Profit = FinalPrice - Rent;
        System.out.println(Profit);
        double FinalProfit = Profit - PriceOfTravel;
        System.out.println(FinalProfit);
        double FinalProfit2 = PriceOfTravel - Profit;
        System.out.println(FinalProfit2);

        if (Profit>PriceOfTravel && CountOfAll>Discount){
            System.out.printf("Yes! %.2f lv left.",FinalProfit);
        } else if (Profit<PriceOfTravel && CountOfAll<Discount){
            System.out.printf("Not enough money! %.2f lv needed.",FinalProfit2);
        }
    }
}
