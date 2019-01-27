import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Speed = Double.parseDouble(scanner.nextLine());
        if (Speed<=10){
            System.out.println("slow");
        } else if (Speed>10 && Speed<=50){
            System.out.println("average");
        } else if (Speed>50 && Speed<=150){
            System.out.println("fast");
        } else if (Speed>150 && Speed<=1000){
            System.out.println("ultra fast");
        } else if (Speed>1000){
            System.out.println("extremely fast");
        }
    }
}
