package com.virtualpairprogrammers.tracker.rest;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.virtualpairprogrammers.tracker.data.Data;
import com.virtualpairprogrammers.tracker.domain.VehiclePosition;

@RestController
public class IncomingReportsController {
	
	@Autowired
	private Data data;
		
	@RequestMapping( method=RequestMethod.POST, value="/vehicles/")
	public void receiveUpdatedPostion(@RequestBody VehiclePosition newReport) throws ParseException 
	{
		System.out.println("Recieved data!" + newReport);
		data.updatePosition(newReport);
	}

}
