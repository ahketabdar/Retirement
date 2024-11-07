package DAO;

import java.sql.Connection;

import controller.dataConditions;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class  Connector {
	
    //private static Connection connection;
    private static String url = "jdbc:postgresql://127.0.0.1:5432/RetiredSystem";
    private static String username = "phoenix";
    private static String password = "2516";

    public static Connection connect() throws SQLException, ClassNotFoundException {
    	
    	try {
    	    Class.forName("org.postgresql.Driver");
    	} catch (ClassNotFoundException e) {
    	    System.out.println("PostgreSQL JDBC Driver not found.");
    	    e.printStackTrace();
    	    return null;
    	}
    
    	Connection connection=null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            throw e; 
        	}
		return connection;
    	}

}
	

	

