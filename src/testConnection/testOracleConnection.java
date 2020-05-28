package testConnection;
import connection.OracleConnection;
public class testOracleConnection 
{

	public static void main(String[] args) 
	{
		try 
		{
			OracleConnection oc = new OracleConnection();
			oc.open();
			System.out.println(oc.getConnection().getMetaData().getDatabaseMajorVersion());
			oc.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
