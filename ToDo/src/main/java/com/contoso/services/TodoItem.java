package com.contoso.services;

import java.util.Date;

public class TodoItem {
	
	public TodoItem(String name) {
		this.id = ((int)Math.random() * 12300) + "";
		this.name = name;
		this.createdAt = new Date();
	}
	
	public String id;
	public String name;
	public Date createdAt;		
			
}