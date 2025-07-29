public class VIPCustomer extends Customer {
  protected double discountRate = 15.0;

  public VIPCustomer(String name) {
    super(name);

  }

  public void calculateBill(double... prices) {
    double totalPrice = 0;

    for (double price : prices) {
      if (price < 0) {
        System.err.println("Item price cannot be negative");
        System.exit(0);
      }
      totalPrice += price;
    }

    double discount = (totalPrice * discountRate) / 100;
    double finalAmount = totalPrice - discount;

    System.out.println("Customer :" + name);
    System.out.println("Total Cost :" + totalPrice);
    System.out.println("Discount RS :" + discount);
    System.out.println("Final amount RS :" + finalAmount);

  }

}
