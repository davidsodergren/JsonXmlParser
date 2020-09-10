package com.david.sodergren.exception;

public class XmlFileNotValidException extends Exception {
    public XmlFileNotValidException(String errorMessage) {
        super(errorMessage);
    }
}