package ChapterThreeTest;

import ChapterThree.PetrolPurchase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolPurchaseTest {

    private PetrolPurchase petrolPurchase;

    @BeforeEach
    void startEachTestWith(){
        PetrolPurchase petrolPurchase = new PetrolPurchase();
    }

    @Test
    void stationLocation (){
        String locationOfStation = petrolPurchase.stationLocation("Yaba");
        assertEquals("Yaba",locationOfStation);
    }


@Test
    void petrolType (){
        String typeOfPetrol = petrolPurchase.petrolType("pmsPetrol");
        assertEquals("pmsPetrol",typeOfPetrol);
}
@Test
    void petrolQuantity(){
        int quantityOfPetrol = petrolPurchase.petrolQuantity(60);
        assertEquals(60,quantityOfPetrol);
}

@Test
    void pricePerLiter(){
        double literPrice = petrolPurchase.pricePerLiter(67.23);
        assertEquals(67.23,literPrice);
}

@Test
    void percentageDiscount(){
        double percentageDiscount = petrolPurchase.percentageDiscount(5);
        assertEquals(5,percentageDiscount);
}
@Test
    void getPurchaseAmount(){
        double netPurchase = petrolPurchase.netPurchaseAmount();
        assertEquals(20,netPurchase);
}

}