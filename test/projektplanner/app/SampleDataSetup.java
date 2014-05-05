package projektplanner.app;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;

public class SampleDataSetup {
	
	ProjectPlanner pp = new ProjectPlanner();

	User user1;
	User user2;
	SuperUser superuser1;
	SuperUser superuser2;
	Activity activity1;
	Activity activity2;
	List<User> users;
	DateServer dateServer;
	
	@Before
	public void setUp() throws Exception 
	{
		user1 = new User("AAAA", "Bobby");
		user2 = new User("BBBB", "Allan");
		superuser1 = new SuperUser("ABCD", "Super1");
		superuser2 = new SuperUser("EFGH", "Super2");
		activity1 = new Activity("Activity1", "lav lort");
		activity2 = new Activity("Activity2", "tis");		
		users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		dateServer = new DateServer();
	}
}
