/* Todo service demo */
package com.contoso.services;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.google.gson.Gson;

/**
 * Servlet implementation class TodoServices
 */
@WebServlet("/TodoServices/todos")
public class TodoServices extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodoServices() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Gson gson = new Gson();
                TodoList todoList = new TodoList();
                todoList.name = "Personal";
                todoList.color = "red";
             
                todoList.items = getTestItems();

		String json = gson.toJson(todoList);  
		
		response.setContentType("application/json");
        response.setHeader("Access-Control-Allow-Origin", "*");
		response.getWriter().write(json);
		response.getWriter().flush();
	}
	
	private TodoItem[] getTestItems() {
		List<TodoItem> items = new ArrayList<TodoItem>();

		
		items.add(new TodoItem("Get tickets for the game!"));
		items.add(new TodoItem("Mail package"));
		items.add(new TodoItem("Milk the cows"));
		items.add(new TodoItem("build a new engimeering"));
		

		
		return (TodoItem[])items.toArray(new TodoItem[items.size()]);
	}
}
