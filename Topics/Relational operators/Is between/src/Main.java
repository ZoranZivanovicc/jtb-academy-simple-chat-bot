import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean m = a > b && a < c;
        boolean n = a > c && a < b;
        boolean k = a == b && b == c;
        System.out.println(m || n || k);


        // put your code here
    }
}