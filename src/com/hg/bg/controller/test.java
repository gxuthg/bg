package com.hg.bg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {
		@RequestMapping(value="test")
		public String test(){
			
			return "index2";
		}
}
