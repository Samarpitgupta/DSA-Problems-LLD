package systemdesign.bookmyshow;

import java.util.ArrayList;
import java.util.List;

public class BookMyShow {

	private List<User> users;
	private List<Theater> theaters;

	public BookMyShow() {
		super();
		this.users = new ArrayList<>();
		this.theaters = new ArrayList<>();
	}

}
