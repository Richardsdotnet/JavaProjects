package ChapterThree;

public class PetrolPurchaseMain {
    public static void main(String[] args) {
        PetrolPurchase petrolPurchase = new PetrolPurchase();
        petrolPurchase.stationLocation("Mushin");
        petrolPurchase.petrolType("AGP");
        petrolPurchase.petrolQuantity(45);
        petrolPurchase.pricePerLiter(65);
        petrolPurchase.percentageDiscount(5);
        petrolPurchase.netPurchaseAmount();
    }
}
