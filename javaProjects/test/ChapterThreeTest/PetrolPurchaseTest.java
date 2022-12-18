package ChapterThreeTest;

import ChapterThree.PetrolPurchase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolPurchaseTest {

    @Test
    void stationLocation (){
        PetrolPurchase petrolPurchase = new PetrolPurchase();
        String locationOfStation = petrolPurchase.stationLocation("Yaba");
        assertEquals("Yaba",locationOfStation);
    }


@Test
    void petrolType (){
        PetrolPurchase petrolPurchase = new PetrolPurchase();
        String typeOfPetrol = petrolPurchase.petrolType("pmsPetrol");
        assertEquals("pmsPetrol",typeOfPetrol);
}
@Test
    void petrolQuantity(){
        PetrolPurchase petrolPurchase = new PetrolPurchase();
        int quantityOfPetrol = petrolPurchase.petrolQuantity(60);
        assertEquals(60,quantityOfPetrol);
}

@Test
    void pricePerLiter(){
        PetrolPurchase petrolPurchase = new PetrolPurchase();
        double literPrice = petrolPurchase.pricePerLiter(67.23);
        assertEquals(67.23,literPrice);
}

@Test
    void percentageDiscount(){
        PetrolPurchase petrolPurchase = new PetrolPurchase();
        double percentageDiscount = petrolPurchase.percentageDiscount(5);
        assertEquals(5,percentageDiscount);
}
@Test
    void getPurchaseAmount(){
        PetrolPurchase petrolPurchase = new PetrolPurchase();
        double netPurchase = petrolPurchase.netPurchaseAmount();
        assertEquals(20,netPurchase);
}

}