package com.criss.wang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.criss.wang.api.FeignApi;

@Service
public class FeignService {

	@Autowired
	private FeignApi feignApi;

	public String feignParam(String name) {
		return feignApi.feginTest(name);
	}

}
