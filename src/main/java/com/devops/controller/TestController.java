package com.devops.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController {

	 @GetMapping("/msg")
	   public ResponseEntity<String> showProductMsg() {
	      return new ResponseEntity<String>(" Application Runing .... ", HttpStatus.OK);
	   }
}