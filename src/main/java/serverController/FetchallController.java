package serverController;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import serverDao.StudentDao;
import serverDto.StudentDto;

@WebServlet("/fetchAll")
public class FetchallController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		StudentDao dao=new StudentDao();
		List<StudentDto>li=dao.fetchAll();
		
		req.setAttribute("studentlist",li);
		
		RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
		rd.forward(req, resp);
		
	}
		
		
		
	}

