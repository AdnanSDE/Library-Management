package com.example.studentLibraryManagmentSystem.Controllers;

import com.example.studentLibraryManagmentSystem.Models.Book;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @PostMapping("/add")
    public String addBook(@RequestBody Book book){
        return "";
    }

}