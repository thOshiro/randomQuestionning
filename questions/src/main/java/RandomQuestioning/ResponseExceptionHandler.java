package RandomQuestioning;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.logging.Logger;

@ControllerAdvice
public class ResponseExceptionHandler extends ResponseEntityExceptionHandler{

    Logger log = Logger.getLogger(ResponseEntityExceptionHandler.class.toString());

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity handleDataIntegrityViolationException(DataIntegrityViolationException ex){
        log.severe("Constraint error " +
                ((ConstraintViolationException) ex.getCause()).getSQLException().getMessage());
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
