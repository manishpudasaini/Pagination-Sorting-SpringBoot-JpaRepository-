package com.pagination.learn.exception;

import org.springframework.http.HttpStatus;

record ProductException(String message,HttpStatus httpStatus) {
}
