package ie.tcd.scss.library.controller;

import ie.tcd.scss.library.domain.Book;
import ie.tcd.scss.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/booksControllerWithDto")
public class BookControllerWithDto {

    private BookService bookService;

    @Autowired
    public BookControllerWithDto(BookService bookService) {
        this.bookService = bookService;
    }

    protected BookControllerWithDto() {
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createBook(@RequestBody BookDto bookDto) {
        Book book = bookDto.getBook();
        String librarySectionCode = bookDto.getLibrarySectionCode();

        bookService.createBook(book.getTitle(), book.getAuthors(), book.getPublicationYear(), book.getPrice(), book.getIsbn(),
                book.getKeywords(), book.getDescription(), librarySectionCode);
    }
}
