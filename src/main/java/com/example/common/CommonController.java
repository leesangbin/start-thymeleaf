package com.example.common;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.helpers.LoggingHelper;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lsv400
 *
 */
@Slf4j
@Controller
// @RestController
// @RequestMapping("/common")
public class CommonController {

	// @RequestMapping("/")
	// @ResponseBody
	// public String index2() {
	//
	// // Log a simple message
	// log.debug("debug level log");
	// log.info("info level log");
	// log.error("error level log");
	//
	// // Log a formatted string with parameters
	// log.info("another info log with {}, {} and {} arguments", 1, "2", 3.0);
	//
	// return "Proudly handcrafted by " + "<a
	// href='http://netgloo.com/en'>Netgloo</a> :)";
	// }

	@RequestMapping("/hello")
	// @RequestMapping("/index")
	public String hello(Model model) {
		log.debug("This is a debug message");
		log.info("This is an info message");
		log.warn("This is a warn message");
		log.error("This is an error message");
		new LoggingHelper().helpMethod();
		model.addAttribute("name", "thymeleaf spring test");
		return "hello";
	}

	@RequestMapping("/")
	// @RequestMapping("/index")
	public String home(Locale locale, Model model) {

		log.info("Welcome home! The client locale is {}.", locale);
		model.addAttribute("name", "spring test");
		return "index";
	}

	@RequestMapping("/index")
	// @RequestMapping("/index")
	public void index(Model model) {
		log.debug("This is a debug message");
		log.info("This is an info message");
		log.warn("This is a warn message");
		log.error("This is an error message");
//		new LoggingHelper().helpMethod();
		model.addAttribute("name", "spring test");
		// return "index";
	}

	@RequestMapping("/json")
	public @ResponseBody Map<String, String> callSomething() {

		Map<String, String> map = new HashMap<String, String>();
		map.put("url", "http://www.leveluplunch.com");

		return map;
	}

}
