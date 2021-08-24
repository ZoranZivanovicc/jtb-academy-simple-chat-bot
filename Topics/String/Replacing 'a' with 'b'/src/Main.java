import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regularString = scanner.nextLine();
        System.out.println(regularString.replace('a', 'b'));

    }
}