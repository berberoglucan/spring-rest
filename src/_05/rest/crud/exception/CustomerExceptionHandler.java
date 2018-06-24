package _05.rest.crud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerExceptionHandler {
	
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<CustomerErrorResponse> customerNotFound(CustomerNotFoundException ex) {
		
		CustomerErrorResponse customerErrorResponse = new CustomerErrorResponse();
		
		customerErrorResponse.setMessage(ex.getMessage());
		customerErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
		customerErrorResponse.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<CustomerErrorResponse>(customerErrorResponse, HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<CustomerErrorResponse> catchAll(Exception ex) {
		
		CustomerErrorResponse customerErrorResponse = new CustomerErrorResponse();
		
		customerErrorResponse.setMessage("Bad Request");
		customerErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		customerErrorResponse.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<CustomerErrorResponse>(customerErrorResponse, HttpStatus.BAD_REQUEST);
		
	}

}