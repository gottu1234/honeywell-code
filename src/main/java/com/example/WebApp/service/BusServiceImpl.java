package com.example.WebApp.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.WebApp.model.Bus;
import com.example.WebApp.model.Payload;
import org.springframework.stereotype.Component;

@Component
public class BusServiceImpl {
	public ArrayList<Bus> getBusesBasedOnLocation(Payload payload) {
		ArrayList<Bus> buses = new ArrayList<>();
		HashMap<Integer,Boolean> hap = new HashMap<>();
		//HashMap to store seats available.default is false
		if(payload.getStart().equals("HYDERABAD") && payload.getEnd().equals("BANGALORE")) {
			hap.put(1,false);
			hap.put(2,false);
			hap.put(3,false);
			hap.put(4,false);
			buses.add(new Bus("a", "hyd-bg-1", "AC",hap));
			buses.add(new Bus("b", "hyd-bg-2", "NON-AC",hap));
			buses.add(new Bus("a", "hyd-bg-3", "AC-SLEEPER",hap));
		}
		else if(payload.getStart().equals("BANGALORE") && payload.getEnd().equals("HYDERABAD")) {
			hap.put(1,false);
			hap.put(2,false);
			hap.put(3,false);
			hap.put(4,false);
			buses.add(new Bus("a", "bg-hyd-1", "AC",hap));
			buses.add(new Bus("b", "bg-hyd-2", "NON-AC",hap));
			buses.add(new Bus("a", "bg-hyd-3", "AC-SLEEPER",hap));
		}
		else if(payload.getStart().equals("BANGALORE") && payload.getEnd().equals("CHENNAI")) {
			hap.put(1,false);
			hap.put(2,false);
			hap.put(3,false);
			hap.put(4,false);
			buses.add(new Bus("a", "bg-che-1", "AC",hap));
			buses.add(new Bus("b", "bg-che-2", "NON-AC",hap));
			buses.add(new Bus("a", "bg-che-3", "AC-SLEEPER",hap));
		}
		else if(payload.getStart().equals("CHENNAI") && payload.getEnd().equals("BANGALORE")) {
			hap.put(1,false);
			hap.put(2,false);
			hap.put(3,false);
			hap.put(4,false);
			buses.add(new Bus("a", "che-bg-1", "AC",hap));
			buses.add(new Bus("b", "che-bg-2", "NON-AC",hap));
			buses.add(new Bus("a", "che-bg-3", "AC-SLEEPER",hap));
		}
		return buses;
	}
}
