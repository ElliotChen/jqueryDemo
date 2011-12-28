package tw.elliot.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.elliot.model.Page;
import tw.elliot.model.User;
import tw.elliot.util.JsonUtils;

/**
 * Servlet implementation class DataTableServlet01
 */
public class DataTableServlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DataTableServlet02() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Page<User> page = new Page<User>();
		ArrayList<User> users = new ArrayList<User>();
		
		users.add(new User("1","A","0910"));
		users.add(new User("2","B","0810"));
		users.add(new User("3","C","0710"));
		
		page.setResults(users);
		page.setPageSize(10);
		page.setTotalCount(100);
		response.getWriter().write(JsonUtils.toJson(page, request.getParameter("sEcho")));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
