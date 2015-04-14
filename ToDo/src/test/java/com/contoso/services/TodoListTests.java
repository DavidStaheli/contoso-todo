package com.contoso.services;

import org.junit.Assert;
import org.junit.Test;

import com.contoso.services.TodoList;

public class TodoListTests {

	@Test
	public void test_TodoListConstructor1() {
		TodoList list = new TodoList();
		Assert.assertEquals(list.items.length, 0);
		Assert.assertNull(list.color);
		Assert.assertNull(list.name);
	}
	
	@Test
	public void test_TodoListConstructor2() {
		TodoList list = new TodoList("TestName", "TestColor");
		Assert.assertEquals(list.items.length, 0);
		Assert.assertEquals(list.color, "TestColor");
		Assert.assertEquals(list.name, "TestName");
	}
}
