package com.example.helpers;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggingHelper {

	public void helpMethod() {
		log.debug("This is a debug message");
		log.info("This is an info message");
		log.warn("This is a warn message");
		log.error("This is an error message");
	}

}
