import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfDays = scanner.nextInt();
        int numOfNights = numOfDays - 1;
        int foodCostPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int hotelCostPerNight = scanner.nextInt();

        int totalCost = foodCostPerDay * numOfDays + numOfNights * hotelCostPerNight + flightCost * 2;

        System.out.println(totalCost);

    }
}