package com.ssafy.ws.step2.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.ws.step2.dto.Movie;

//이 서블릿이 호출되기 위해서는 url 상에 http://server_ip:port/context_name/main 이 필요하다.
@WebServlet("/main")
public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	
    /**
     * get 방식의 요청에 대해 응답하는 메서드이다.
     * front controller pattern을 적용하기 위해 내부적으로 process를 호출한다.
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}
	
	
    /**
     * post 방식의 요청에 대해 응답하는 메서드이다.
     * front controller pattern을 적용하기 위해 내부적으로 process를 호출한다.
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // post 요청 시 한글 파라미터의 처리를 위해 encoding을 처리한다.
        request.setCharacterEncoding("utf-8");
        process(request, response);
    }
	
    /**
     * request 객체에서 action 파라미터를 추출해서 실제 비지니스 로직 메서드(ex: doRegist) 
     * 호출해준다.
     */
	private void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		switch (action) {
		case "regist":
			doRegist(request, response);
			break;
		}
	}
	
    /**
     * 클라이언트에서 전달된 request를 분석한 결과를 regist_result.jsp에서 볼 수 있도록 한다.
     * RequestDispatcher를 사용해서 regist_result.jsp로 forward한다.
     * 
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
	private void doRegist(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// request 객체에서 전달된 parameter를 추출한다.
		int id = Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("title");
		String director = request.getParameter("director");
		String genre = request.getParameter("genre");
		int runningTime = Integer.parseInt(request.getParameter("runningTime"));
		// 전달받은 parameter를 이용해서 User 객체를 생성한다.
		Movie movie = new Movie(id, title, director, genre, runningTime);
		
		// 전달받은 파라미터를 request에 담는다.
		request.setAttribute("title", title);
		request.setAttribute("director", director);
		request.setAttribute("genre", genre);
		request.setAttribute("runningTime", runningTime);
		
		// JSP 화면 호출을 위해 RequestDispatcher의 forward를 사용한다.
		// 이때 연결할 jsp의 이름을 넘겨준다. forward에서는 /는 context root를 나타낸다.
		RequestDispatcher disp = request.getRequestDispatcher("/regist_result.jsp");
		disp.forward(request, response);
		
	}
}
