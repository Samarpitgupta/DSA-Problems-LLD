package systemdesign.bookmyshow;

import java.util.Date;

public class Ticket {

	private int id;
	private String ownerName;
	private Date bookingTime;
	private int noOfSeat;
	private Show bookedShow;

	public Ticket(int id, String ownerName, Date bookingTime, int noOfSeat, Show bookedShow) {
		super();
		this.id = id;
		this.ownerName = ownerName;
		this.bookingTime = bookingTime;
		this.noOfSeat = noOfSeat;
		this.bookedShow = bookedShow;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Date getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(Date bookingTime) {
		this.bookingTime = bookingTime;
	}

	public int getNoOfSeat() {
		return noOfSeat;
	}

	public void setNoOfSeat(int noOfSeat) {
		this.noOfSeat = noOfSeat;
	}

	public Show getBookedShow() {
		return bookedShow;
	}

	public void setBookedShow(Show bookedShow) {
		this.bookedShow = bookedShow;
	}

}
