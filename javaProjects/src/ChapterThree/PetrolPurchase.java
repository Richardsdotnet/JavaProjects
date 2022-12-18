package ChapterThree;

public class PetrolPurchase {
    double price;
    double discount;
    int totalQuantity;
    double netAmountOfPurchase;


    public String stationLocation(String locationOfStation){
        System.out.printf("Petrol Station location is @ %s%n",locationOfStation);

        return locationOfStation;
    }

    public String petrolType(String typeOfPetrol ) {
        System.out.printf("Petrol type is %s%n",typeOfPetrol);

        return typeOfPetrol;
    }

    public int petrolQuantity(int numOfLitres) {
         totalQuantity = (numOfLitres);
        System.out.printf("%nTotal petrol quantity bought is %d liters %n ",totalQuantity);
        return totalQuantity;
    }

    public double pricePerLiter(double literPrice) {
        price = literPrice;
        System.out.printf("%nTotal petrol price per liter of  is %f naira %n",price);
        return price;
    }

    public double percentageDiscount(double perDiscount) {
        discount = perDiscount;
        System.out.printf("%nTotal discount is %f naira %n",perDiscount);
        return discount;
    }

    public double netPurchaseAmount() {
         netAmountOfPurchase = (totalQuantity * price) - (discount);
        System.out.printf("The net amount of purchase is %f%n", netAmountOfPurchase);

        return netAmountOfPurchase;
    }
}
