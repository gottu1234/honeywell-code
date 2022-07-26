package com.example.WebApp.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.WebApp.model.Bus;
import com.example.WebApp.model.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.WebApp.service.BusServiceImpl;


@RestController
public class BusController {
	@Autowired
	private BusServiceImpl busService;

	@RequestMapping(method=RequestMethod.POST,value="/get-buses")
	public ArrayList<Bus> getBuses(@RequestBody Payload payload) {
		return busService.getBusesBasedOnLocation(payload);
	}

}
 