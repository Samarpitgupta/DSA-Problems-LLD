package systemdesign.bookmyshow;

import java.util.Date;

public class Show {

	private int id;
	private Date showTime;
	private int seatAvailable;
	private Movie movie;
	private Theater theater;

	public Show(int id, Date showTime, Movie movie, Theater theater) {
		this.id = id;
		this.showTime = showTime;
		this.movie = movie;
		this.theater = theater;
		this.seatAvailable = theater.getCapacity();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getShowTime() {
		return showTime;
	}

	public void setShowTime(Date showTime) {
		this.showTime = showTime;
	}

	public int getSeatAvailable() {
		return seatAvailable;
	}

	public void setSeatAvailable(int seatAvailable) {
		this.seatAvailable = seatAvailable;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Theater getTheater() {
		return theater;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}

}
