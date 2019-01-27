import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double RecordInsec = Double.parseDouble(scanner.nextLine());
        double DistanceInmin = Double.parseDouble(scanner.nextLine());
        double TimeOfSwimmingInsec = Double.parseDouble(scanner.nextLine());
        double Pool = DistanceInmin * TimeOfSwimmingInsec;
        double PlusSec = Math.floor(DistanceInmin/15);
        double PlusSec2 = PlusSec * 12.5;
        double AllTime = Pool + PlusSec2;
        double Failed = AllTime - RecordInsec;
        if (AllTime>=RecordInsec){
            System.out.printf("No, he failed! He was %.2f seconds slower.",Failed);
        } else if (AllTime<=RecordInsec){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",AllTime);
        }
    }
}
