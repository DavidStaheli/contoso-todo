package com.contoso.services;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.contoso.services.TodoItem;

public class TodoItemTests {

	@Test
	public void test_TodoItemConstructor() {
		TodoItem item = new TodoItem("TestName");
		//Assert.assertTrue(false);
		Assert.assertEquals("TestName", item.name);
		Assert.assertNotEquals("",  item.id);
		Assert.assertTrue(item.createdAt.after(new Date(1)));
	}
}
