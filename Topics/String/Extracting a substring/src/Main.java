import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regularString = scanner.next();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(regularString.substring(num1,++num2));


    }
}