package tn.amine.hazelcastcachinglayer.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.amine.hazelcastcachinglayer.services.BookService;

@RestController
@RequestMapping("api/v1/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("{isbn}")
    public String getBook(@PathVariable String isbn) {
        return bookService.getBook(isbn);

    }


}
