package com.example.cleanarch.infrastructure.controllers;

public record CreateUserRequest(String username, String password, String email) {
}
