package ie.tcd.scss.library.controller;
//CONTROLLER USING REQUEST PARAMETER
import ie.tcd.scss.library.domain.Book;
import ie.tcd.scss.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/booksController")
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    protected BookController() {
    }

    @PostMapping
    @ResponseStatus (HttpStatus.CREATED)
    public void createBook(@RequestBody Book book, @RequestParam String librarySectionCode) {
        bookService.createBook(book.getTitle(), book.getAuthors(), book.getPublicationYear(), book.getPrice(),
                book.getIsbn(), book.getKeywords(), book.getDescription(), librarySectionCode);
    }
}
