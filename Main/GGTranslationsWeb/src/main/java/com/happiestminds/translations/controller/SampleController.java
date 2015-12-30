package com.happiestminds.translations.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;


@Controller
@RequestMapping(value = "/sendEmail")
public class SampleController {

	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public String doReport(final HttpServletRequest req) {
		System.out.println("its here in controller");
		
		return "hello";
	}

}
