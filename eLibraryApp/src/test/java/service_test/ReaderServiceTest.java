package service_test;

import eLibraryApplication.dto.request.AddBookRequest;
import eLibraryApplication.dto.request.BuyBookRequest;
import eLibraryApplication.dto.response.AddBookResponse;
import eLibraryApplication.dto.response.BuyBookResponse;
import eLibraryApplication.services.AdminService;
import eLibraryApplication.services.LibraryAdminService;
import eLibraryApplication.services.LibraryReaderService;
import eLibraryApplication.services.ReaderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class ReaderServiceTest {
    private ReaderService readerService;

    @BeforeEach

    public  void setUp(){
         readerService = new LibraryReaderService();
    }


    @Test
    public void testThatReaderCanBuyBook(){
        String title = "Java";
        String author = "Ben";
        String category = "Tech";
        double buyingPrice = 50.0;


        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setAuthor(author);
        addBookRequest.setTitle(title);
        addBookRequest.setCategory(category);
        addBookRequest.setBuyingPrice(buyingPrice);

        AdminService adminService = new LibraryAdminService();
        AddBookResponse addedBook = adminService.addBook(addBookRequest);

        BuyBookRequest buyBookRequest = new BuyBookRequest();
        buyBookRequest.setAmount("34.04");
        buyBookRequest.setBookTitle("Java");
        buyBookRequest.setAuthor("Ben");
        BuyBookResponse boughtBook = readerService.buyBook(buyBookRequest);
        assertFalse(boughtBook.isAvailable());


    }

}