package com.example.soa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.soa.model.TimeSheet;
import com.example.soa.repository.TimeSheetRepository;
import com.example.soa.service.TimeSheetService;

@Service
public class TimeSheetServiceImpl implements TimeSheetService{
	
	@Autowired
	TimeSheetRepository timesheetRepository;

	@Override
	public List<TimeSheet> getUserHours() {
		return timesheetRepository.findAll();
	}

}
