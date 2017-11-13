package com.mkyong;
import java.lang.reflect.Array;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		
		return "hello world1";
	}
	
	@GetMapping("/hello1")
	public int[] hello1()
	{	
		int[] intArray = { 1, 2, 3, 4, 5 }; 
		return intArray;
	}
	
	@GetMapping("/hello2")
	public String[] hello2()
	{	
		String[] intStr = {"ni","中文呢","ma"}; 
		return intStr;
	}
}
