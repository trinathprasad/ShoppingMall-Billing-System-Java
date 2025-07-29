public class PrimeCustomer extends Customer {
  protected double discountRate = 10.0;

  public PrimeCustomer(String name) {
    super(name);
  }

  public void calculateBill(double... prices) {
    double totalPrice = 0;
    for (double price : prices) {
      if (price < 0) {
        System.out.println("Item price cannot be negative.");
        System.exit(0);
      } else {
        totalPrice += price;

      }

    }
    double discount = (totalPrice * discountRate) / 100;
    double finalcost = totalPrice - discount;

    System.out.println("Welcome to Hyderabad Mall :");
    System.out.println("Customer: " + name);
    System.out.println("Total cost RS : " + totalPrice);
    System.out.println("Discount: " + discount);
    System.out.println("Final amount RS : " + finalcost);

  }
}
