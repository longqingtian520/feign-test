package com.criss.wang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.criss.wang.service.FeignService;

@RestController
public class FeignController {

	@Autowired
	private FeignService feignService;

	@RequestMapping(value = "/criss", method = RequestMethod.GET)
	public String feignParam(@RequestParam(value = "name", required = false) String name) {
		return feignService.feignParam(name);
	}
}
