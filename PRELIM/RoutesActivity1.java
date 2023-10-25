import java.util.Scanner;

public class RoutesActivity1 {
    public static void main(String[] args) {

        double distanceDefault = 92.3;
        double distanceRecommended1 = 94;
        double distanceRecommended2 = 84.9;

        Scanner scan = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Route to MoalBoal\n");
        System.out.println("===============================");
        System.out.println("Default route:");
        System.out.println("Cebu City       (Start)");
        System.out.println("Minglanilla     (Route 1)");
        System.out.println("San Fernando    (Route 2)");
        System.out.println("Carcar          (Route 3)");
        System.out.println("Barili          (Route 4.1)");
        System.out.println("Dumanjug        (Route 4.1.1)");
        System.out.println("Alcantara       (Route 4.1.2)");
        System.out.println("Moalboal        (End)\n");
        System.out.println("===============================");
        System.out.println("Recommended route:");
        System.out.println("Cebu City       (Start)");
        System.out.println("Minglanilla     (Route 1)");
        System.out.println("San Fernando    (Route 2)");
        System.out.println("Carcar          (Route 3)");
        System.out.println("Sibonga         (Route 4.2)");
        System.out.println("Dumanjug        (Route 4.1.1)");
        System.out.println("Alcantara       (Route 4.1.2)");
        System.out.println("Moalboal        (End)\n");
        System.out.println("===============================");
        System.out.print("Is Barili (Route 4.1) obstructed? (Yes or No): ");
        String BariliObstructed = scan.next();

        if (BariliObstructed.equalsIgnoreCase("No")) {
            System.out.print("Enter speed: ");
            int speed = scan.nextInt();
            double ETA = distanceDefault / speed;

            int hours = (int) ETA;
            double remainingMinutes = (ETA - hours) * 60;
            int minutes = (int) remainingMinutes;

            System.out.println("===============================");
            System.out.println("Proceed to Recommended Route:");
            System.out.println("Cebu City       (Start)");
            System.out.println("Mingla          (Route 1)");
            System.out.println("San Fernando    (Route 2)");
            System.out.println("CarCar          (Route 3)");
            System.out.println("Barili          (Route 4.1)");
            System.out.println("Dumanjug        (Route 4.1.1)");
            System.out.println("Alcantara       (Route 4.1.2)");
            System.out.println("Moalboal        (End)");
            System.out.print("ETA: " + hours + " hours and " + minutes + " minutes");
        } else {
            System.out.print("Is Sibonga (Route 4.2) obstructed? (Yes or No): ");
            String SibongaObstructed = scan.next();
            System.out.println("\n");

            if (SibongaObstructed.equalsIgnoreCase("No")) {
                System.out.print("Enter speed: ");
                int speed = scan.nextInt();
                double ETA = distanceRecommended1 / speed;

                int hours = (int) ETA;
                double remainingMinutes = (ETA - hours) * 60;
                int minutes = (int) remainingMinutes;
                System.out.println("===============================");
                System.out.println("Proceed to this Recommended Route:");
                System.out.println("Recommended Route");
                System.out.println("Cebu City       (Start)");
                System.out.println("Minglanilla     (Route 1)");
                System.out.println("San Fernando    (Route 2)");
                System.out.println("Carcar          (Route 3)");
                System.out.println("Sibonga         (Route 4.2)");
                System.out.println("Dumanjug        (Route 4.2.1)");
                System.out.println("Alcantara       (Route 4.2.2)");
                System.out.println("Moalboal        (End)");
                System.out.print("ETA: " + hours + " hours and " + minutes + " minutes");
            } else {
                System.out.print("Enter speed: ");
                int speed = scan.nextInt();
                double ETA = distanceRecommended2 / speed;

                int hours = (int) ETA;
                double remainingMinutes = (ETA - hours) * 60;
                int minutes = (int) remainingMinutes;
                System.out.println("===============================");
                System.out.println("Proceed to this Recommended Route:");
                System.out.println("Cebu City       (Start)");
                System.out.println("Minglanilla     (Route 1)");
                System.out.println("San Fernando    (Route 2)");
                System.out.println("Carcar          (Route 3)");
                System.out.println("Sibonga         (Route 4.2)");
                System.out.println("Argao           (Route 5)");
                System.out.println("Ronda           (Route 5.1)");
                System.out.println("Alcantara       (Route 5.2)");
                System.out.println("Moalboal        (End)");
                System.out.print("ETA: " + hours + " hours and " + minutes + " minutes");
            }
        }

        scan.close();
    }
}
