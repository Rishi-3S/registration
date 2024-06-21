import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.imple.RegisterImp;
import com.java.model.RegisterModel;

public class register extends HttpServlet {
	
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	 String name = req.getParameter("username");
	 String email = req.getParameter("email");
	 String password = req.getParameter("password");
	 String confirm = req.getParameter("confirm-password");
	 String phone =req.getParameter("phone");
	 String dob = req.getParameter("dob");
	 String gender = req.getParameter("gender");
	 String country = req.getParameter("country");
	 
	 System.out.println(name+" "+email+" "+password+" "+confirm+" "+phone+" "+dob+" "+gender+" "+country);
	 
	 RegisterModel reg = new RegisterModel(name, email, password, confirm, phone, dob, gender, country);
	 
	 RegisterImp imp = new RegisterImp();
	 
	 int i = imp.save(reg);
	 
	 PrintWriter pw = resp.getWriter();
	 
	 if(i == 1) {
		 pw.print("Succesfully Registered");
	 }else {
		 pw.print("sorry , Registered  UnSuccesfully");
	 }
}
	

}
