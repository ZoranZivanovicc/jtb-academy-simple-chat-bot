//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String singleRoomGuest = scanner.next();
        String doubleRoomGuest1 = scanner.next();
        String doubleRoomGuest2 = scanner.next();
        String secondDoubleRoomGuest1 = scanner.next();
        String secondDoubleRoomGuest2 = scanner.next();
        String familyRoomGuest1 = scanner.next();
        String familyRoomGuest2 = scanner.next();
        String familyRoomGuest3 = scanner.next();

        System.out.println(familyRoomGuest3 + "\n" + familyRoomGuest2 + "\n" + familyRoomGuest1);
        System.out.println(secondDoubleRoomGuest2 + "\n" + secondDoubleRoomGuest1 + "\n" + doubleRoomGuest2 + "\n" +doubleRoomGuest1);
        System.out.println(singleRoomGuest);
    }
}