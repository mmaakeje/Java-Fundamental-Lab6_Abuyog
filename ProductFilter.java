import java.util.Scanner;

public class ProductFilter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name of first product: ");
        String product1 = input.nextLine();
        System.out.print("Enter price of " + product1 + ": ");
        double price1 = input.nextDouble();
        input.nextLine();

        System.out.print("Enter name of second product: ");
        String product2 = input.nextLine();
        System.out.print("Enter price of " + product2 + ": ");
        double price2 = input.nextDouble();
        input.nextLine();

        System.out.print("Enter name of third product: ");
        String product3 = input.nextLine();
        System.out.print("Enter price of " + product3 + ": ");
        double price3 = input.nextDouble();

        System.out.print("\nEnter the minimum price to display: ");
        double minPrice = input.nextDouble();

        System.out.println("\nProducts with price higher than " + minPrice + ":");

        int count = 0;
        if (price1 > minPrice) {
            System.out.println(product1 + " - ₱" + price1);
            count++;
        }
        if (price2 > minPrice) {
            System.out.println(product2 + " - ₱" + price2);
            count++;
        }
        if (price3 > minPrice) {
            System.out.println(product3 + " - ₱" + price3);
            count++;
        }

        System.out.println("Total products found: " + count);
        input.close();
    }
}
