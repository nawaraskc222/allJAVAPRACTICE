package com.java.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","rootpassword");
		
    	Statement st= c1.createStatement();
    	boolean b = st.execute("create table info3 (id int,name varchar(22) )");

    }
}
