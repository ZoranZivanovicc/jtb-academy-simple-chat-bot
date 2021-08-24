import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPeanutButterCups = scanner.nextInt();
        boolean isItWeekend = scanner.nextBoolean();

        boolean isPartySuccessfulWhenIsNoWeekend = numPeanutButterCups >= 10
                && numPeanutButterCups <= 20
                && !isItWeekend;
        boolean isPartySuccessfulWhenIsWeekend = numPeanutButterCups >= 15
                && numPeanutButterCups <= 25
                && isItWeekend;
        System.out.println(isPartySuccessfulWhenIsNoWeekend || isPartySuccessfulWhenIsWeekend);
    }
}