package com.fragile.bookapi.rest.dto;


public record UserDto(Long id, String username, String name, String email, String role) {
}
