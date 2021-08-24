import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (-15 < number && number <= 12) {
            System.out.println("True");
        } else if (14 < number && number < 17) {
            System.out.println("True");
        } else if (19 <= number) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}