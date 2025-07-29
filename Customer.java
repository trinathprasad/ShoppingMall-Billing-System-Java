public class Customer {

  protected String name;

  public Customer(String name) {
    if (name == null || name.trim().isEmpty()) {
      System.out.println("Invalid name!!!");
      System.exit(0);
    }
    this.name = name;
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
      System.out.println("Welcome to Hyderabad Mall :");
      System.out.println("Customer: " + name);
      System.out.println("Total cost RS : " + totalPrice);
      System.out.println("Discount: No discount for general customers.");

    }

  }

}
