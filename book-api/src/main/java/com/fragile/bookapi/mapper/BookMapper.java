package com.fragile.bookapi.mapper;


import com.fragile.bookapi.model.Book;
import com.fragile.bookapi.rest.dto.BookDto;
import com.fragile.bookapi.rest.dto.CreateBookRequest;

public interface BookMapper {

    Book toBook(CreateBookRequest createBookRequest);

    BookDto toBookDto(Book book);
}
