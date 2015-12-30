package com.happiestminds.translations.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import hm.gg.translations.facade.TranslationsFacade;
import hm.gg.translations.model.Translations;


@Controller

public class TranslationsController {
	
	@Autowired(required = true)
	private TranslationsFacade transFacade;
	
	@RequestMapping(method = RequestMethod.POST,value = "/addConfig")
	@ResponseBody
	
	public ModelAndView addConfiguration(final HttpServletRequest req) throws Exception {
		System.out.println("its here in controller");
		String id=req.getParameter("id");
		String module=req.getParameter("module");
		String key=req.getParameter("key");
		String value=req.getParameter("value");
		Translations translations = new Translations();
		translations.setGg_key(key);
		translations.setGg_value(value);
		
		translations.setModel(module);
		System.out.println(translations);
		transFacade.addTransConfiguration(translations);
		return new ModelAndView("index", "message", "Success");  
		
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/listConfig")
	@ResponseBody
	public ResponseEntity<String> listConfiguration() throws Exception {
		System.out.println("its here in list controller");
		Gson gson = new Gson();
		List configs = transFacade.getAllTransConfiguration();
		System.out.println(configs);
		String translationJSON = "{\"Translations\":"+gson.toJson(configs)+"}";
		System.out.println(translationJSON);
		if(configs.isEmpty()){
            return new ResponseEntity<String>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<String>(translationJSON, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/deleteConfig")
	@ResponseBody
	public ResponseEntity<String> deleteConfiguration() throws Exception {
		System.out.println("its here in list controller");
		Gson gson = new Gson();
		List configs = transFacade.getAllTransConfiguration();
		System.out.println(configs);
		String translationJSON = "{\"Translations\":"+gson.toJson(configs)+"}";
		System.out.println(translationJSON);
		if(configs.isEmpty()){
            return new ResponseEntity<String>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<String>(translationJSON, HttpStatus.OK);
	}

}
