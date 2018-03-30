package com.mkyong;

import java.util.Map;

import com.demoit.dao.OrderFilmMapper;
import com.demoit.entity.OrderFilm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class WelcomeController {

	private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

	// inject via application.properties
	@Value("${welcome.message:test21212}")
	private String message = "Hello World";


	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {

		logger.debug("Welcome {}", "testing");

		model.put("message", this.message);
		return "welcome";
	}

}