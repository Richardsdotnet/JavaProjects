package ChapterThree;

public class Car {
  private double price;
  private String year;
  public String model;
  private int percentage;
  private double discount;
  private double finalPrice;


    public Car(double price, String year, String model, int percentage){
        this.price = price;
        this.year = year;
        this.model = model;
        this.percentage = percentage;
    }
    public void setPercentage(int percentage){
        this.percentage = percentage;
    }
    public int getPercentage(){
        return percentage;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getModel() {
        return model;

    }

    public void setModel(String model) {
        this.model = model;


    }

    public double discountedAmount(){
        discount = (double) percentage/100 * price;
        return discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void finalPrice(){
        finalPrice = price - discountedAmount();

    }

    public double getFinalPrice() {
        return finalPrice;
    }

    }

