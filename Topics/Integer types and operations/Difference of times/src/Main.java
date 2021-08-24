import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourFromTheFirstTimer = scanner.nextInt() * 60;
        int minuteFromTheFirstTimer = scanner.nextInt();
        int secondsFromTheFirstTimer = scanner.nextInt();
        int hourFromTheSecondTimer = scanner.nextInt() * 60;
        int minuteFromTheSecondTimer = scanner.nextInt();
        int secondsFromTheSecondTimer = scanner.nextInt();
        int resultFromTheFirstTimer = ((hourFromTheFirstTimer + minuteFromTheFirstTimer) * 60) + secondsFromTheFirstTimer;
        int resultFromTheSecondTimer = ((hourFromTheSecondTimer + minuteFromTheSecondTimer) * 60) + secondsFromTheSecondTimer;
        int finalResult = resultFromTheSecondTimer - resultFromTheFirstTimer;
        System.out.println(finalResult);

    }
}