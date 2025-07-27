package co.ptm.bookservice;

import co.ptm.bookservice.model.Book;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BookService {

    public Book getBook(){
        return Book.builder().title(UUID.randomUUID().toString()).author(UUID.randomUUID().toString()).build();
    }
}
