import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number;
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 0; i < n; i++) {
            number = scanner.nextInt();
            if (number == 1) {
                larger++;
            } else if (number == -1) {
                smaller++;
            } else if (number == 0) {
                perfect++;
            } else {
                System.out.println("Output is not in the correct format");
            }
        }
        System.out.print(perfect + " " + larger + " " + smaller);

    }
}