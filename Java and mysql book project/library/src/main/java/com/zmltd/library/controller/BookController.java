package com.zmltd.library.controller;
import org.springframework.web.bind.annotation.RestController;
import com.zmltd.library.entity.Book;
import com.zmltd.library.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/Book")


public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService){

        this.bookService = bookService;
    }

    @PostMapping("/saveBook")
    public Book book(@RequestBody Book book) {
        
        
        return bookService.saveBook(book);
    }
    



}
