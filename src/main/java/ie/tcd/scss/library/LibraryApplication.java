package ie.tcd.scss.library;

import ie.tcd.scss.library.service.BookService;
import ie.tcd.scss.library.service.LibrarySectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication implements CommandLineRunner {
	@Autowired
	private LibrarySectionService librarySectionService;

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		createLibrarySections();
		createBooks();
	}

	private void createLibrarySections() {
		librarySectionService.createLibrarySection("Scifi", "Science Fiction Books");
		librarySectionService.createLibrarySection("Fiction", "Fiction Books");
		librarySectionService.createLibrarySection("Non-fiction", "Non-fiction Books");
		librarySectionService.createLibrarySection("CS", "Computer Science Books");
	}

	private void createBooks() {
		bookService.createBook("The Hobbit", "J.R.R. Tolkien", 2023, 99,"ISBN 978-123456",
				"hobbit, tolkien, fantasy", "A book about a hobbit", "Fiction");
		bookService.createBook("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1978, 49,
				"ISBN 978-456789", "comedy, bbc, scifi", "A book about life and all the rest", "Scifi");
	}

}
