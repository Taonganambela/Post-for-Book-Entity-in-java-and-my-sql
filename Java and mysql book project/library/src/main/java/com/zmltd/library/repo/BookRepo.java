package com.zmltd.library.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zmltd.library.entity.Book;

@Repository

public interface BookRepo extends JpaRepository<Book, Integer> {

}
