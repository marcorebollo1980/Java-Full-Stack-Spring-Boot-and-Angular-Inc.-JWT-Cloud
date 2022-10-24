package service;

import model.Book;
import org.springframework.stereotype.Service;
import repository.BookRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookServiceImpl implements IBookService{

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public Book saveBook(Book book){
        book.setCreateTime(LocalDateTime.now());
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> findAllBooks(){
        return bookRepository.findAll();
    }
}
