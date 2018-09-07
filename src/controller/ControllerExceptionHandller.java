package controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
@ControllerAdvice
public class ControllerExceptionHandller {

		@ExceptionHandler(value=NullPointerException.class)
		public String handleNullPointerException(Exception e) {
		System.out.println("Null pointer exception occured"+e);
		
		return "ExceptionHandled";
	}
	
	
		@ExceptionHandler(value=Exception.class)
		public String allException(Exception e) {
		System.out.println("Null pointer exception occured"+e);
		return "ExceptionHandled";
		
	}
}
