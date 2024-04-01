package com.bookStore.bookStore.controller;

import com.bookStore.bookStore.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @GetMapping(path = "/books")
    public ResponseEntity<List<BookDto>> getBooks(){
        BookDto book= BookDto.builder()
                .title("My First book title")
                .build();
        List<BookDto> books=new ArrayList<>();
        books.add(book);
        return ResponseEntity.ok(books);
    }
}
