package br.com.fiap.cleanarchitecture.hexagonalarchitecture.application.core.exception;

public class DomainException extends Exception{
    public DomainException(String message) {
        super(message);
    }
}
