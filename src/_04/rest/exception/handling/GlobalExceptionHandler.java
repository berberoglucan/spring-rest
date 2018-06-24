package _04.rest.exception.handling;


// @ControllerAdvice // aop sayesinde tum exceptionlarin yakalanmasini saglar
public class GlobalExceptionHandler {
	
	/*@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {
		
		StudentErrorResponse responseError = new StudentErrorResponse();
		
		responseError.setMessage(exc.getMessage());
		responseError.setStatus(HttpStatus.NOT_FOUND.value());
		responseError.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(responseError, HttpStatus.NOT_FOUND); 
	}
	
	// generic exception handler
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(Exception exc) {
		
		StudentErrorResponse responseError = new StudentErrorResponse();
		
		responseError.setMessage("Bad Request");
		responseError.setStatus(HttpStatus.BAD_REQUEST.value()); // send 400
		responseError.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(responseError, HttpStatus.BAD_REQUEST); 
	}*/
	
}
