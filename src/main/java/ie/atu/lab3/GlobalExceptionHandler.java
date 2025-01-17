package ie.atu.lab3;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;
import java.util.HashMap;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>>  display(MethodArgumentNotValidException ex){

        Map<String,String> errorList = new HashMap<>();

        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
            String errorName = error.getField();
            String errorMessage = error.getDefaultMessage();
            errorList.put(errorName, errorMessage);
        }
        return ResponseEntity.status(400).body(errorList); //Controls the response talend will give. In this case ERROR 400
    }
}
