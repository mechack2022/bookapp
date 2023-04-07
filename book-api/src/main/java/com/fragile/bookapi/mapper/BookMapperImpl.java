package com.fragile.bookapi.mapper;

import com.fragile.bookapi.model.Book;
import com.fragile.bookapi.rest.dto.BookDto;
import com.fragile.bookapi.rest.dto.CreateBookRequest;
import org.springframework.stereotype.Service;

@Service
public class BookMapperImpl implements BookMapper {

    @Override
    public Book toBook(CreateBookRequest createBookRequest) {
        if (createBookRequest == null) {
            return null;
        }
        return new Book(createBookRequest.getIsbn(), createBookRequest.getTitle());
    }

    @Override
    public BookDto toBookDto(Book book) {
        if (book == null) {
            return null;
        }
        return new BookDto(book.getIsbn(), book.getTitle());
    }
}
