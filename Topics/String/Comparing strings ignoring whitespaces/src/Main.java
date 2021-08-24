import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine().replace(" ","");
        String text2 = scanner.nextLine().replace(" ","");
        System.out.println(text1.equals(text2));

    }
}