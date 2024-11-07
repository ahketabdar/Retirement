package controller;

import common.retirement;



import java.sql.Connection;
import java.sql.SQLException;

import DAO.Connector;
import DAO.dbOperation;
import java.util.Properties;


public class dataConditions {


	private static retirement person = new retirement();
	
	
	//condition of DB connect
	public static void checkDBconnect() throws SQLException {
		
		Connection conn = null;
		try {
			conn = Connector.connect();
			} catch (Exception e) {
				e.printStackTrace();
			}
				if( conn != null) {
					System.out.println("Connection successful!");
				}else {
					System.out.println("Connection failed!");
				}
		
	}		
		
	//condition of ID
	public static void checkID(String id) throws SQLException {
	

		if (id.length()>3 || id.length() <= 0) {
			System.out.println("ID must have 3 digit numbers");
		}else {
			person.setId(Integer.parseInt(id));
			try {
				checkDBconnect();
				System.out.println("ID :D:D:D:D");
				
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("ddd");
			}
		}
	}	
}

