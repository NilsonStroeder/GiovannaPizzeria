package br.com.giovannapizzeria.giovannaPizzeria.exceptions;

import org.springframework.web.server.WebExceptionHandler;
import org.springframework.web.server.WebHandler;
import org.springframework.web.server.handler.ExceptionHandlingWebHandler;

import java.util.List;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(){
        super("Usuário não encontrado!");
    }

    public UserNotFoundException(String message){
        super(message);
    }

}
