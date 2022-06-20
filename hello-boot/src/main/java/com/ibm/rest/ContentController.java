package com.ibm.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;

@RestController
public class ContentController {

	@GetMapping(value="/greet/{name}", produces="text/plain")
	public String greetText(@PathVariable String name)
	{
		return "Welcome to Spring Boot, "+name;
	}
	
	@GetMapping(value="/greet",produces="text/html")
	public String greetHtml(@RequestParam String name)
	{
		return "<h1> Welcome to spring boot"+ name + "</h1>";
	}
	
	@GetMapping(value="/greet", produces="text/xml")
	public String greetXml(@RequestParam String name)
	{
		return "<?xml version=\"1.0\"><greeting>Welcome to spring boot "+name+" </greeting>";
	}
	
	@GetMapping(value="/greet", produces="application/json")
	public String greetjson(@RequestParam String name)
	{
		JSONPObject obj=new JSONPObject("greeting", "Welcom to spring boot "+name);
		return obj.getValue().toString();
	}
}
