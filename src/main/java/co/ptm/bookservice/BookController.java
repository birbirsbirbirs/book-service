package co.ptm.bookservice;

import co.ptm.bookservice.model.Book;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/book")
public class BookController {
    private final BookService bookService;
    @GetMapping
    public Book getBook(){
        return bookService.getBook();
    }
}
