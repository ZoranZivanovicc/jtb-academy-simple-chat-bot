import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginningOfTheInterval = scanner.nextInt();
        int endOfTheInterval = scanner.nextInt();


        for (; beginningOfTheInterval <= endOfTheInterval; beginningOfTheInterval++) {
            if (beginningOfTheInterval % 3 == 0 && beginningOfTheInterval % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (beginningOfTheInterval % 3 == 0) {
                System.out.println("Fizz");
            } else if (beginningOfTheInterval % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(beginningOfTheInterval);
            }

        }
    }
}