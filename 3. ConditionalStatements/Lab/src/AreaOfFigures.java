import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ShapeType = scanner.nextLine();

        if (ShapeType.equals("square")){
            double a = Double.parseDouble(scanner.nextLine());
            double area = a*a;
            System.out.printf("%.3f",area);
        } else if (ShapeType.equals("rectangle")){
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            double area = sideA*sideB;
            System.out.printf("%.3f",area);
        } else if (ShapeType.equals("circle")){
            double r = Double.parseDouble(scanner.nextLine());
            double area = Math.PI * r * r;
            System.out.printf("%.3f",area);
        } else if (ShapeType.equals("triangle")){
            double sideA  = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            double area = sideA * h / 2;

            System.out.printf("%.3f",area);
        }
    }
}
