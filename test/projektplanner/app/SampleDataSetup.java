package projektplanner.app;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;

public class SampleDataSetup {
	
	ProjectPlanner pp = new ProjectPlanner();
	
	
	@Before
	public void setUp() throws Exception {
		User user1 = new User("AAAA", "Bobby");
		User user2 = new User("BBBB", "Allan");
		SuperUser superuser1 = new SuperUser("ABCD", "Super1");
		SuperUser superuser2 = new SuperUser("EFGH", "Super2");
		Activity activity1 = new Activity("Activity1", "lav lort");
		Activity activity2 = new Activity("Activity2", "tis");
		
		List<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
	}
}
