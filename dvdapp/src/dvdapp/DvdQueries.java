package dvdapp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

 
public class DvdQueries {
	
	

	// DB connection details		
	/* Local MySQL server*/
	private static final String URL = "jdbc:mysql://localhost:3306/dvdapp";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "vabrams";

	private Connection connection = null;
	private PreparedStatement insertMovie = null;
	private PreparedStatement updateMovie = null;
	
	public DvdQueries()
	{
		try
		{
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); // Starts a connection to the database

			insertMovie = connection.prepareStatement("INSERT INTO movies VALUES (?,?,?,?)");
			updateMovie = connection.prepareStatement("UPDATE movies set name='?' where movieId='?'");
			
		}
		catch (SQLException sqlException)
		{
			sqlException.printStackTrace();
			System.exit(1);
		}
	}


	//Method that inserts a new movie in the database
	 
	public void addMovie(int movieId, String name, String director, String genre, int year)
	{
		try
		{
			// Setting the values for the question marks '?' in the prepared statement
			
			
			insertMovie.setInt(1, movieId);
			insertMovie.setString(2, name);
			insertMovie.setString(3, director);
			insertMovie.setString(4, genre);
			insertMovie.setInt(5, year);
			
			// result will contain the amount of updated rows. It should be 1. To simplify the code let's not verify this
			int result = insertMovie.executeUpdate(); 
		}
		catch (SQLException sqlException)
		{
			sqlException.printStackTrace();
		}	
	}
	
	protected void updateMovieInfo(int year, String name) {
		try {
			//TODO-04d: define the parameters for the update statement before executing it.
			updateMovie.setString(1, name);
			updateMovie.setInt(2, year);
			
			updateMovie.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}
	}
	
	
}




	
	

