package systemdesign.bookmyshow;

import java.util.ArrayList;
import java.util.List;

public class Theater {

	private int id;
	private String name;
	private int capacity;
	private String location;
	private List<Show> shows;

	public Theater(int id, String name, int capacity, String location) {
		this.id = id;
		this.name = name;
		this.capacity = capacity;
		this.location = location;
		this.shows = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Show> getShows() {
		return shows;
	}

	public void setShows(List<Show> shows) {
		this.shows = shows;
	}

}
