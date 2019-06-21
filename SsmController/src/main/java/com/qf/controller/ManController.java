package com.qf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qf.pojo.ManBean;
import com.qf.service.ManService;

@RestController
public class ManController {

	 @Autowired
	 private ManService manservice;
	 
	 @RequestMapping("/manservice")
	 public List<ManBean> getall(){
		 return manservice.getlist();
	 }
}
