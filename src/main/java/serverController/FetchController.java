package serverController;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import serverDao.StudentDao;
import serverDto.StudentDto;

@WebServlet("/fetchbyid")
public class FetchController extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sid=req.getParameter("sid");
		int id=Integer.parseInt(sid);
		
		StudentDao dao=new StudentDao();
		StudentDto dt=dao.fetchById(id);
		res.getWriter().print(dt);
		
		
	}

}
