import java.util.Scanner;

public class Area {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in) ;
        int a= Integer.parseInt(scanner.nextLine());
        int b= Integer.parseInt(scanner.nextLine());
        int area= a * b;
        System.out.println(area);
        // TODO: calculate the area and print it
    }
}