package com.datajpa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexCOntroller {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {

		return "IndexController!";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index1() {

		return "IndexController!";
	}
}
