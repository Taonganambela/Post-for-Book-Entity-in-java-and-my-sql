package com.zmltd.library.service;

import org.springframework.stereotype.Service;
import com.zmltd.library.entity.Book;
import com.zmltd.library.repo.BookRepo;

@Service

public class BookService {

    public final BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {

        this.bookRepo = bookRepo;
    }

    public Book saveBook(Book book) {

        Book book1 = new Book();
        book1.setFName(book.getFName());
        book1.setLName(book.getLName());
        book1.setTitle(book.getTitle());
        book1.setGenre(book.getGenre());
        System.out.println("MyBooks" + book1);
        return bookRepo.save(book1);

    }

}
