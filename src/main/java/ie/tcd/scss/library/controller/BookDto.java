package ie.tcd.scss.library.controller;

import ie.tcd.scss.library.domain.Book;
public class BookDto {
    private Book book;
    private String librarySectionCode;

    public BookDto(Book book, String librarySectionCode) {
        this.book = book;
        this.librarySectionCode = librarySectionCode;
    }

    protected BookDto() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book  book) {
        this.book = book;
    }

    public String getLibrarySectionCode() {
        return librarySectionCode;
    }

    public void setLibrarySectionCoder(String librarySectionCode) {
        this.librarySectionCode = librarySectionCode;
    }
}
