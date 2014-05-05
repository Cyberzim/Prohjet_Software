package projektplanner.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class EventTests extends SampleDataSetup 
{
	@Test
	public void valueTests() 
	{
		Event event = new Event("Conference", "Description", 
				dateServer.getDate().getTime(), dateServer.getDate().getTime());
		event.addUser(superuser1);
		event.addUser(user2);
		
		assertTrue(event.getName().equals("Conference"));
		assertTrue(event.getDesription().equals("Description"));
		assertTrue(event.getUsers().contains(user2));
		assertTrue(event.getUsers().contains(superuser1));
		
		event.removeUser(superuser1);
		assertFalse(event.getUsers().contains(superuser1));
	}
}
