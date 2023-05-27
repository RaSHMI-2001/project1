package serverController;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import serverDao.StudentDao;
import serverDto.StudentDto;

@WebServlet("/update")
public class Studentupdate extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=req.getParameter("sid");
		String phno=req.getParameter("phno");
		int id1=Integer.parseInt(id);
		long phno1=Long.parseLong(phno);
		
		StudentDto dto=new StudentDto();
		dto.setPhno(phno1);
		
		
		StudentDao dao=new StudentDao();
		String msg=dao.update(id1,phno1);
		res.getWriter().print(msg);
		
	}

}
