package serverController;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import serverDao.StudentDao;
@WebServlet("/delete1")
public class StudentDelete extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doGet(req, resp);
		
		String id1=req.getParameter("id");
		int id2=Integer.parseInt(id1);
		
		StudentDao dao=new StudentDao();
		dao.delete1(id2);
		
		
		
		
	}

}
