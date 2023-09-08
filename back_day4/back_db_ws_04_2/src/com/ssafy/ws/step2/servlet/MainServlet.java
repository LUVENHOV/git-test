package com.ssafy.ws.step2.servlet;

// 이 서블릿이 호출되기 위해서는 url 상에 http://server_ip:port/context_name/main 이 필요하다.
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ssafy.ws.step2.dto.Movie;

// 코드를 작성하세요
@WebServlet("/main")
public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private static List<Movie> movieList = new ArrayList<>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	/**
	 * post 방식의 요청에 대해 응답하는 메서드이다. front controller pattern을 적용하기 위해 내부적으로 process를
	 * 호출한다.
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// post 요청 시 한글 파라미터의 처리를 위해 encoding을 처리한다.
		request.setCharacterEncoding("utf-8");
		process(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		switch (action) {
		case "regist":
			doRegist(request, response);
			break;
		case "list":
			doList(request, response);
			break;
		}
	}
	
	private void doRegist(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// request 객체에서 전달된 parameter를 추출한다.
		String title = request.getParameter("title");
		String director = request.getParameter("director");
		String genre = request.getParameter("genre");
		// 문자열로 전달된 mileage는 숫자로 변환
		int runningTime = Integer.parseInt(request.getParameter("runningTime"));

		Movie movie = new Movie(title, director, genre, runningTime);
		request.setAttribute("movie", movie);
		
		movieList.add(movie);

		HttpSession session = request.getSession();
		session.setAttribute("movieCount", movieList.size());

		RequestDispatcher disp = request.getRequestDispatcher("/regist_result.jsp");
		disp.forward(request, response);
	}
	
	private void doList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// attribute에 지금까지 등록한 자동차 리스트 등록
		request.setAttribute("movies", movieList);
		
		// forward를 통해 list.jsp 호출
		RequestDispatcher disp = request.getRequestDispatcher("/list.jsp");
		disp.forward(request, response);
	}
	
}
