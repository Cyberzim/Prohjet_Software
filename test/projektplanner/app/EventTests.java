package projektplanner.app;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class EventTests extends SampleDataSetup 
{
	@Test
	public void valueTests() 
	{
		Calendar calendar = dateServer.getDate();
		Date startDate = calendar.getTime();
		calendar.add(Calendar.DATE, 1);
		Date endDate = calendar.getTime();

		Event event = new Event("Conference", "Description", startDate, endDate);
		event.addUser(superuser1);
		event.addUser(user2);
		
		assertTrue(event.getName().equals("Conference"));
		assertTrue(event.getDesription().equals("Description"));
		assertTrue(event.getUsers().contains(user2));
		assertTrue(event.getUsers().contains(superuser1));
		assertTrue(event.getStartDate().compareTo(startDate) == 0);
		assertTrue(event.getEndDate().compareTo(endDate) == 0);
		
		event.removeUser(superuser1);
		assertFalse(event.getUsers().contains(superuser1));
		
		calendar.add(Calendar.DATE, 1);
		startDate = calendar.getTime();
		calendar.add(Calendar.DATE, 1);
		endDate = calendar.getTime();
		
		event.removeUser(user2);
		event.removeUser(superuser1);
		event.setDesription("New description");
		event.setName("New name");
		event.setStartDate(startDate);
		event.setEndDate(endDate);
		
		assertTrue(event.getName().equals("New name"));
		assertTrue(event.getDesription().equals("New description"));
		assertFalse(event.getUsers().contains(user2));
		assertFalse(event.getUsers().contains(superuser1));
		assertTrue(event.getStartDate().compareTo(startDate) == 0);
		assertTrue(event.getEndDate().compareTo(endDate) == 0);
		event.toString();
	}
}
