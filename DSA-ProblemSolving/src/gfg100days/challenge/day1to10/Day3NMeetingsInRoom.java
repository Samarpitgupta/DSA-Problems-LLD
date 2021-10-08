package gfg100days.challenge.day1to10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Day3NMeetingsInRoom {

	// Function to find the maximum number of meetings that can
	// be performed in a meeting room.
	public static int maxMeetings(int start[], int end[], int n) {
		// add your code here
		List<Meeting> meetingList = new ArrayList<>();

		for (int i = 0; i < start.length; i++)
			meetingList.add(new Meeting(start[i], end[i], i + 1));

		MeetingComparator mc = new MeetingComparator();
		Collections.sort(meetingList, mc);

		List<Integer> answer = new ArrayList<>();
		answer.add(meetingList.get(0).pos);
		int limit = meetingList.get(0).end;

		for (int i = 1; i < start.length; i++) {
			if (meetingList.get(i).start > limit) {
				limit = meetingList.get(i).end;
				answer.add(meetingList.get(i).pos);
			}
		}

		return answer.size();
	}
}

class Meeting {
	int start;
	int end;
	int pos;

	Meeting(int start, int end, int pos) {
		this.start = start;
		this.end = end;
		this.pos = pos;
	}
}

class MeetingComparator implements Comparator<Meeting> {
	@Override
	public int compare(Meeting m1, Meeting m2) {
		if (m1.end < m2.end)
			return -1;
		else if (m1.end > m2.end)
			return 1;
		else if (m1.pos < m2.pos)
			return -1;

		return 1;
	}
}