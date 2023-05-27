package serverController;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import serverDto.StudentDto;
import serverDao.StudentDao;

@WebServlet("/insert")
public class StudentController extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sid=req.getParameter("sid");
		int id=Integer.parseInt(sid);
		String sname=req.getParameter("sname");
		String gen=req.getParameter("gender");
		String mail=req.getParameter("mail");
		String phno=req.getParameter("phno");
		long ph=Long.parseLong(phno);
		
		StudentDto dto=new StudentDto();
		dto.setSid(id);
		dto.setSname(sname);
		dto.setGender(gen);
		dto.setMail(mail);
		dto.setPhno(ph);
		
		StudentDao dao=new StudentDao();
		dao.create(dto);
		
	}
	

}
