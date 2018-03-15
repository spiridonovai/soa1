package com.example.soa.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.soa.model.TimeSheet;
import com.example.soa.model.User;
import com.example.soa.service.TimeSheetService;


@RestController
@RequestMapping("/timesheet")
public class TimesheetController {
	
	@Autowired
	private TimeSheetService service;
	
	 @RequestMapping(value = "/all",method=RequestMethod.GET)
	 public List<TimeSheet> getHours() {
		 return service.getUserHours();
	 }
}
