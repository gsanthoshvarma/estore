package com.sr.emstore.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR,
reason="Some Internal error occured server side, Please contact any one of developer")
public class EStoreExceptionAdvice {

	@ExceptionHandler(value=Exception.class)
	public String showGenericExceptionPage() {
		return PageConstants.EXCEPTION_PAGE;
	}
}
