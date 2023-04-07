package com.fragile.bookapi.mapper;

import com.fragile.bookapi.model.Book;
import com.fragile.bookapi.model.User;
import com.fragile.bookapi.rest.dto.UserDto;


public interface UserMapper {

    UserDto toUserDto(User user);
}