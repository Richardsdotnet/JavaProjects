package ChapterThree;

public class CarMain {
  public static void main(String[] args) {
    Car car1 = new Car(200, "2018", "Benz", 5);
    System.out.println("Car one model: " + car1.getModel());
    System.out.println("Production year: " + car1.getYear());
    car1.setPrice(50000);
    System.out.println("Price: " + car1.getPrice());
    car1.setPercentage(5);
    System.out.println("Percentage discount: " + car1.getPercentage());
    System.out.println("Discounted amount: " + car1.discountedAmount());
    car1.finalPrice();
    System.out.println("Discounted price: " + car1.getFinalPrice());

    Car car2 = new Car(200, "2022", "Lexus", 5);
    System.out.println("Car two model: " + car2.getModel());
    System.out.println("Production year: " + car2.getYear());
    car2.setPrice(100000);
    System.out.println("Price: " + car2.getPrice());
    car2.setPercentage(10);
    System.out.println("Percentage discount: " + car2.getPercentage());
    System.out.println("Discounted amount: " + car2.discountedAmount());
    car2.finalPrice();
    System.out.println("Discounted price is: " + car2.getFinalPrice());

    Car car3 = new Car(200, "2020", "Jeep", 5);
    System.out.println("Car three model: " + car3.getModel());
    System.out.println("Production year: " + car3.getYear());
    car3.setPrice(150000);
    System.out.println("Price: " + car3.getPrice());
    car3.setPercentage(15);
    System.out.println("Percentage discount: " + car3.getPercentage());
    System.out.println("Discounted amount: " + car3.discountedAmount());
    car3.finalPrice();
    System.out.println("Discounted price is: " + car3.getFinalPrice());

  }
}

