import java.util.Scanner;

public class ShoppingMall {

  public static void main(String[] args) {
    System.out.println("Please select the Customer Type to get additional Discount :");
    System.out.println("\t\t 1) General Customer ");
    System.out.println("\t\t 2) Prime Customer ");
    System.out.println("\t\t 3) VIP Customer ");

    Scanner sc = new Scanner(System.in);
    Customer customer = null;
    System.out.println("Please enter Customer type :");
    int type = Integer.parseInt(sc.nextLine());

    switch (type) {

      case 1: {
        System.out.println("Enter the name of the customer:");
        String name = sc.nextLine();

        customer = new GeneralCutomer(name);

        System.out.println("Enter number of items.");
        int noOfItem = Integer.parseInt(sc.nextLine());
        double[] items = new double[noOfItem];
        System.out.println("Please enter item name and price.");
        for (int i = 0; i < items.length; i++) {
          System.out.println((i + 1) + ") Enter Item name:");
          String itemName = sc.nextLine();
          System.out.println("Enter Item price.");
          double itemPrice = Double.parseDouble(sc.nextLine());

          items[i] = itemPrice;
        }

        generateBill(customer, items);

      }
        break;

      case 2: {
        System.out.println("Enter the name of the customer:");
        String name = sc.nextLine();

        customer = new PrimeCustomer(name);

        System.out.println("Enter number of items.");
        int noOfItem = Integer.parseInt(sc.nextLine());
        double[] items = new double[noOfItem];
        System.out.println("Please enter item name and price.");
        for (int i = 0; i < items.length; i++) {
          System.out.println((i + 1) + ") Enter Item name:");
          String itemName = sc.nextLine();
          System.out.println("Enter Item price.");
          double itemPrice = Double.parseDouble(sc.nextLine());

          items[i] = itemPrice;
        }

        generateBill(customer, items);

      }
        break;

      case 3: {
        System.out.println("Enter the name of the customer:");
        String name = sc.nextLine();

        customer = new VIPCustomer(name);

        System.out.println("Enter number of items.");
        int noOfItem = Integer.parseInt(sc.nextLine());
        double[] items = new double[noOfItem];
        System.out.println("Please enter item name and price.");
        for (int i = 0; i < items.length; i++) {
          System.out.println((i + 1) + ") Enter Item name:");
          String itemName = sc.nextLine();
          System.out.println("Enter Item price.");
          double itemPrice = Double.parseDouble(sc.nextLine());

          items[i] = itemPrice;
        }

        generateBill(customer, items);

      }
        break;
      default:
        System.out.println("Invalid choice!!!");
    }

    sc.close();
  }

  public static void generateBill(Customer cust, double... prices) {
    System.out.println("Welcome to hyderbad shopping mall!!");

    cust.calculateBill(prices);

  }
}
