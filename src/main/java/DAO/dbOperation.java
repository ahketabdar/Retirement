package DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import DAO.Connector;

public class dbOperation {
	
	
	public static void retiredShow(int id1) throws SQLException {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;  
	    ResultSet resultSet = null;
	    
	    
	    try {
	    connection = Connector.connect();
		String sql = "SELECT * FROM retired WHERE id=?";
		preparedStatement = connection.prepareStatement(sql);
	    preparedStatement.setInt(1, id1);
        resultSet = preparedStatement.executeQuery();
	   
	    while (resultSet.next()) {
	        
	            	int id = resultSet.getInt("id");
	                String name = resultSet.getString("name");
	                String family = resultSet.getString("family");
	                Date dor = resultSet.getDate("dor");
	                int pass = resultSet.getInt("pass");		
	                
	                System.out.println("ID: " + id +  "Name: " + name + "family: " 
	                + family +"Date Of Retirement: " + dor +"Pass: " + pass );
	            } 
	    } catch (SQLException e) {
	                e.printStackTrace();
	            }finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
	  }
	}
}