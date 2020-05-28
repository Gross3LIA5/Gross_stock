package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection 
{
	private Connection connection;
	
	public OracleConnection() throws Exception
	{
		try 
		{
			Class.forName("oracle.jdbc.OracleDriver");
		} 
		catch (ClassNotFoundException e) 
		{
			throw new Exception("could not find driver");
		}
	}
	public void open() throws Exception
	{
		try 
		{
			connection = DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:ORCL","DEMO","oracle");
		} 
		catch (SQLException e) 
		{
			throw new Exception("could not open");
		}
	}
	public void close() throws Exception
	{
		try 
		{
			connection.close();
		} 
		catch (SQLException e) 
		{
			throw new Exception("could not close");
		}
	}
	
	public Connection getConnection()
	{
		return connection;
	}

}
