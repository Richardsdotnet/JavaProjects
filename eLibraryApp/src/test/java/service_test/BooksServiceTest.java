package service_test;

import eLibraryApplication.dto.request.AddBookRequest;
import eLibraryApplication.dto.response.AddBookResponse;
import eLibraryApplication.services.AdminService;
import eLibraryApplication.services.LibraryAdminService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class BooksServiceTest {

    @Test
    void testThatAdminCanAddBook(){
        String title = "Java";
        String author = "Ben Who knows";
        String category = "Tech";
        double buyingPrice = 50.0;
        double borrowingPrice = 45.0;

        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setAuthor(author);
        addBookRequest.setTitle(title);
        addBookRequest.setCategory(category);
        addBookRequest.setBuyingPrice(buyingPrice);
        addBookRequest.setBorrowingPrice(borrowingPrice);

        AdminService adminService = new LibraryAdminService();
        AddBookResponse addedBook = adminService.addBook(addBookRequest);
        assertNotNull(addedBook);
    }



}
