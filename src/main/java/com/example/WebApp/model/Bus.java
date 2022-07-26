package com.example.WebApp.model;


import java.util.HashMap;

public class Bus {
	public Bus(String id, String name, String description,HashMap<Integer,Boolean> hm) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.hm = (HashMap<Integer, Boolean>) hm.clone();
	}
	private String id;
	private String name;
	private String description;
	private HashMap<Integer,Boolean> hm = new HashMap<>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setHm(HashMap<Integer,Boolean> hm){
		this.hm = (HashMap<Integer, Boolean>) hm.clone();
	}
	public HashMap<Integer,Boolean> getHm(){
		return this.hm;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
