package com.example.common;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lsv400
 *
 */
@Slf4j
@RestController
@RequestMapping("/common")
public class CommonRestController {
	// @RequestMapping("/hello/{name}")
	// String hello(@PathVariable String name) {
	// log.debug("This is a debug message");
	// log.info("This is an info message");
	// log.warn("This is a warn message");
	// log.error("This is an error message");
	// return "Hello, " + name + "!";
	// }

	@RequestMapping("/json")
	public @ResponseBody Map<String, String> callSomething() {

		Map<String, String> map = new HashMap<String, String>();
		map.put("url", "http://www.leveluplunch.com");

		return map;
	}

	@RequestMapping("/hello/{name}")
	String hello(@PathVariable String name) {
		return "Hello, " + name + "!";
	}

}
