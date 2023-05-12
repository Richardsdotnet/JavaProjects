package service_test;

import eLibraryApplication.dto.request.BorrowBookRequest;
import eLibraryApplication.services.BooksService;
import eLibraryApplication.services.LibraryBooksService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooksServiceTest {

    BooksService booksService;
    BorrowBookRequest borrowBookRequest;
    @BeforeEach void startAllTestWith(){
        booksService = new LibraryBooksService();
        borrowBookRequest = new BorrowBookRequest();

    }

    @Test void saveNewBookTest(){

    }

}