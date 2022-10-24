package service;


import model.Book;

import java.util.List;

public interface IBookService {
    void deleteBook(Long id);

    Book saveBook(Book book);

    List<Book> findAllBooks();
}
