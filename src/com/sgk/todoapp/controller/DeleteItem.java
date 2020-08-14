package com.sgk.todoapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sgk.todoapp.repository.TodoMongoDbRepository;


@WebServlet("/delete")
public class DeleteItem extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteItem() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("_id");
		TodoMongoDbRepository dbRepo = new TodoMongoDbRepository();
		dbRepo.delete(id);
	}

}