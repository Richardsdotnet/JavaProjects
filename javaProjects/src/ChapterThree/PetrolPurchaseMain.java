package ChapterThree;

public class PetrolPurchaseMain {
    public static void main(String[] args) {
        PetrolPurchase petrolPurchase = new PetrolPurchase();
        petrolPurchase.stationLocation("Lekki");
        petrolPurchase.petrolType("AGP");
        petrolPurchase.petrolQuantity(50);
        petrolPurchase.pricePerLiter(200);
        petrolPurchase.percentageDiscount(5);
        petrolPurchase.netPurchaseAmount();
    }
}
