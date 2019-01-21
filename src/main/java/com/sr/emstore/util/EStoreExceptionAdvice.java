package com.sr.emstore.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EStoreExceptionAdvice {

	@ExceptionHandler(value=Exception.class)
	public String showGenericExceptionPage() {
		return PageConstants.EXCEPTION_PAGE;
	}
}
