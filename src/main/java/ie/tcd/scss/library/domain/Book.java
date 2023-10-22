package ie.tcd.scss.library.domain;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @Column
    private String authors;

    @Column
    private Integer publicationYear;

    @Column
    private Integer price;

    @Column
    private String isbn;

    @Column(length = 500)
    private String keywords;

    @Column(length = 2000)
    private String description;

    @ManyToOne
    private LibrarySection librarySection;

    public Book(Long id, String title, String authors, Integer publicationYear, Integer price, String isbn, String keywords, String description, LibrarySection librarySection) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publicationYear = publicationYear;
        this.price = price;
        this.isbn = isbn;
        this.keywords = keywords;
        this.description = description;
        this.librarySection = librarySection;
    }

    protected Book() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LibrarySection getLibrarySection() {
        return librarySection;
    }

    public void setLibrarySection(LibrarySection librarySection) {
        this.librarySection = librarySection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(getId(), book.getId())
                && Objects.equals(getTitle(), book.getTitle())
                && Objects.equals(getAuthors(), book.getAuthors())
                && Objects.equals(getPublicationYear(), book.getPublicationYear())
                && Objects.equals(getPrice(), book.getPrice())
                && Objects.equals(getIsbn(), book.getIsbn())
                && Objects.equals(getKeywords(), book.getKeywords())
                && Objects.equals(getDescription(), book.getDescription())
                && Objects.equals(getLibrarySection(), book.getLibrarySection());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getTitle(),
                getAuthors(),
                getPublicationYear(),
                getPrice(),
                getIsbn(),
                getKeywords(),
                getDescription(),
                getLibrarySection());
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authors='" + authors + '\'' +
                ", publicationYear=" + publicationYear +
                ", price=" + price +
                ", isbn='" + isbn + '\'' +
                ", keywords='" + keywords + '\'' +
                ", description='" + description + '\'' +
                ", librarySection=" + librarySection +
                '}';
    }
}
