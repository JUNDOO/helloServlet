package kr.ac.hansung.cse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")  //URL 맵핑을 해줌.
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

    
    // ↓ index.html에서 post 라는 method 가 넘어오면 처리해 줄 부분 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// read form data
		String username = request.getParameter("username"); //request 입력값을 username으로 받아 변수에 저장.
		String password = request.getParameter("password"); //request주소로부터 객체 얻어오기.
		
		// Process : access to database, perform business logic
		
		// Build HTML code (response를 만드는 부분)
		PrintWriter out = response.getWriter();
		
		String htmlResponse = "<html>";
		htmlResponse += "<h2> Your username is " + username + "<br/>";
		htmlResponse += "<h2> Your password is " + password + "<h2/>";
		htmlResponse += "</html>";
		
		out.println(htmlResponse);
		
		
	}
}
