import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input product name: ");
        String name = scanner.nextLine();
        System.out.print("Input quantity: ");
        long quantity = scanner.nextLong();
        System.out.print("Input phone: ");
        float phone = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Input address: ");
        String address = scanner.nextLine();
        System.out.printf("Name: %s Quantity: %d Phone: %f Address: %s", name, quantity, phone, address);
        scanner.close();
    }


}




