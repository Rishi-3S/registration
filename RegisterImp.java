package com.java.imple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.inter.RegisterI;
import com.java.model.RegisterModel;

public class RegisterImp implements RegisterI {
	Connection con;
	public RegisterImp() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tap", "root", "root");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public int save(RegisterModel reg) {
	try {
		PreparedStatement stmt = con.prepareStatement("insert into register(name,email,password,confirm,phone,dob,gender,country) values (?,?,?,?,?,?,?,?)");
		
		stmt.setString(1, reg.getName());
		stmt.setString(2, reg.getEmail());
		stmt.setString(3, reg.getPassword());
		stmt.setString(4, reg.getConfirm());
		stmt.setString(5, reg.getPhone());
		stmt.setString(6, reg.getDob());
		stmt.setString(7, reg.getGender());
		stmt.setString(8, reg.getCountry());
		
		int i = stmt.executeUpdate();
		
		return i;
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return 0;
	}

}
