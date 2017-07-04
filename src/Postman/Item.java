package Postman;

import java.util.ArrayList;

public class Item {
	
	String name;
	Request request;
	ArrayList<Object> response = new ArrayList<>();
	ArrayList<Item> item;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Request getRequest() {
		return request;
	}
	public void setRequest(Request request) {
		this.request = request;
	}
	public ArrayList<Object> getResponse() {
		return response;
	}
	public void setResponse(ArrayList<Object> response) {
		this.response = response;
	}
	public ArrayList<Item> getItem() {
		return item;
	}
	public void setItem(ArrayList<Item> item) {
		this.item = item;
	}
	

	
	
	
}
