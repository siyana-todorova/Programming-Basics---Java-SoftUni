import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double IncomeInlv = Double.parseDouble(scanner.nextLine());
        double Average = Double.parseDouble(scanner.nextLine());
        double MinSalary = Double.parseDouble(scanner.nextLine());
        double Canget = MinSalary * 0.35;
        double ExcellenGrade = Average * 25;
        if (IncomeInlv>MinSalary && Average<5.50) {
            System.out.printf("You cannot get a scholarship!");
        } else if (IncomeInlv<MinSalary && Average<=4.50){
            System.out.printf("You cannot get a scholarship!");
        } else if ((IncomeInlv<MinSalary) &&(Average>=4.50 && ExcellenGrade<=5.50)) {
            System.out.printf("You get a Social scholarship %.0f BGN", Canget);
        } else if (Canget>ExcellenGrade && IncomeInlv<MinSalary && Average>=4.50){
            System.out.printf("You get a Social scholarship %.0f BGN", Canget);
        } else if (IncomeInlv<MinSalary && Average>=5.50 && ExcellenGrade>Canget){
            System.out.printf("You get a scholarship for excellent results %.0f BGN",ExcellenGrade);
        } else if (IncomeInlv>=MinSalary && ExcellenGrade>=5.50){
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(ExcellenGrade));
        }
    }
}
