import java.util.Scanner;

public class Choreography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double CountSteps = Double.parseDouble(scanner.nextLine());
        double CountDancers = Double.parseDouble(scanner.nextLine());
        double CountDaysOfStudy = Double.parseDouble(scanner.nextLine());
        double AllSteps = (CountSteps / CountDaysOfStudy) ;
        double AllSteps2 = Math.ceil((AllSteps/CountSteps)*100);
        double StepsOfDancers = AllSteps2 / CountDancers;
        if (AllSteps2 <= 13) {
            System.out.printf("Yes, they will succeed in that goal! %.2f", StepsOfDancers);
            System.out.println("%.");
        } else if (AllSteps2>13){
            System.out.printf("No, They will not succeed in that goal! Required %.2f",StepsOfDancers);
            System.out.println("% steps to be learned per day.");
        }
    }
}
