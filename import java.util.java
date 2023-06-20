import java.util.Scanner;

public class OxygenProduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l, b, plantArea;
        System.out.println("Enter the length of the room(in m)");
        Outer:
        while (true) {
            l = sc.nextDouble();
            if (l <= 0) {
                System.out.println("Invalid length");
                break;
            }
            System.out.println("Enter the breadth  of the room(in m)");
            b = sc.nextDouble();
            if (b <= 0) {
                System.out.println("Invalid breadth");
                break;
            }
            System.out.println("Enter the plant area of a single plant(in cm2)");
            plantArea = sc.nextDouble();
            if (plantArea <= 0) {
                System.out.println("Invalid plant area");
                break;
            }
            int totalPlants = (int) ((l * b) / (plantArea / 10000));
            if (totalPlants % 10 != 0) {
                int rem = totalPlants % 10;
                totalPlants = totalPlants - rem;
            }
            double production = 0.9 * totalPlants;
            System.out.println("Total number of plants is " + totalPlants);
            System.out.printf("Total oxygen production is %.2f litres", production);
            break;
        }
        sc.close();
    }
}
