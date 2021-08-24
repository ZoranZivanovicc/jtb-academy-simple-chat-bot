import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = number % 2;
        int numberToAdd = (result == 0) ? 2 : 1;
        System.out.println(number + numberToAdd);
    }
}