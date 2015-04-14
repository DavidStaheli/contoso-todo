package com.contoso.services;

public class TodoList {

	public TodoList() {
		this.items = new TodoItem[0];
	}
	
	public TodoList(String name, String color) {
		this.items = new TodoItem[0];
		this.name = name;
		this.color = color;
	}
	
	public String name;
	public String color;
    public TodoItem[] items;

}
