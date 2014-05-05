package projektplanner.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTests {

	@Test
	public void createUser()
	{
		User user = new User("ID", "Name");
		assertTrue(user.getID().equals("ID"));
		assertTrue(user.getName().equals("Name"));
		
		user.setID("New ID");
		assertTrue(user.getID().equals("New ID"));
		
		user.setNominatedHours(40);
		assertTrue(user.getNominatedHours() == 40);
	}
	
	@Test
	public void checkUserRights()
	{
		User normalUser = new User("ID", "Name");
		SuperUser superUser = new SuperUser("ID", "Name");
		assertFalse(normalUser.isSuperUser());
		assertTrue(superUser.isSuperUser());
	}
}
