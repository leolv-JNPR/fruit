package com.fruit.admin.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fruit.bean.Greeting;

@RestController
@RequestMapping("/api/admin")
@Secured("ROLE_ADMIN")
public class FruitRestController {
	
	private static Logger logger = Logger.getLogger(FruitRestController.class);
	
	public FruitRestController() {
		logger.info("init fruitrestcontroller");
	}
	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
	
	//@RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @RequestMapping("/greeting")
    public ResponseEntity<Greeting> greeting(@RequestParam(value="name", defaultValue="World") String name) {
		Greeting g = new Greeting(counter.incrementAndGet(),
                String.format(template, name));
		return new ResponseEntity<Greeting>(g, HttpStatus.OK);
    }

}
