package dvdapp;

public class Dvd {
	
	private String name;
	private String director;
	private String genre;
	private int year; 
	private int movieid;
	
	Dvd (String aPlateNr, String aColour, String aModel, int aModelYear, int aMovieID)
	{
		this.name = aPlateNr;
		this.director = aColour;
		this.genre = aModel;
		this.year = aModelYear;
		this.movieid = aMovieID;
	}

	// Getters will be needed in file JdbcExample.java
	public String getName()
	{
		return this.name;
	}
	
	public String getDirector()
	{
		return this.director;
	}
	
	public String getGenre()
	{
		return this.genre;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
	public int getMovieID() {
		return this.movieid;
	}
	
	
}