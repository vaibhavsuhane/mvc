package com.vaibhav.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.CacheControl;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class EmployeeRestController {
@RequestMapping(value="/get/text",produces=MediaType.TEXT_PLAIN_VALUE)
public ResponseEntity<String> getMsg() {
	return ResponseEntity.ok().body("Hi vaibhav");
	
}	
//in this method has a problem

@RequestMapping(value="/get/josn",produces=MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<List<String>> getJson() {
	
	List<String> list=new ArrayList<String>();
	list.add("vaibhav");
	list.add("Aarohi");
	list.add("Pihu");
	list.add("Laxmi");
	list.add("Basant");
	
	
	return ResponseEntity.ok().body(list);
}




}
