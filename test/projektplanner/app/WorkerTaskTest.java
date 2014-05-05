package projektplanner.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class WorkerTaskTest {

	@Test
	public void createTask() 
	{
		User user = new User("ID",  "Name");
		WorkerTask task = new WorkerTask(user, 10);
		assertTrue(task.getUser() == user);
		assertTrue(task.getHours() == 10);
	}

}
