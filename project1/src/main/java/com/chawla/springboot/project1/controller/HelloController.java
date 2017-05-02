package com.chawla.springboot.project1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

		@RequestMapping("/hello")
		public String messageReturn(String str) {
			return str + " how are you?";
		}
}
