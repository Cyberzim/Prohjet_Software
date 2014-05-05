package projektplanner.app;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class ActivityTest {
	
	@Test
	public void createAndChangeActivity()	{
		
		Activity act = new Activity("act 1","this is act 1");
		Date dat = new Date();

		assertEquals(act.getStartDate(), dat);
		
		act.setIfRunning(true);
		act.setNomHours(15);
		
		assertTrue(act.getName().equals("act 1"));
		assertTrue(act.getDescription().equals("this is act 1"));
		assertTrue(act.getNomHours() == 15);

		
		act.setName("act 2");
		assertTrue(act.getName().equals("act 2"));
		
		act.setNomHours(37);
		assertTrue(act.getNomHours() == 37);
		
		act.setDescription("new des");
		assertTrue(act.getDescription().equals("new des"));
	}
	
	
	@Test
	public void addActivityToActivity()	{
		
		Activity act = new Activity("act 3","this is act 3");
		
		Activity condi1 = new Activity("condition 1","this is SPARTA");
		Activity condi2 = new Activity("condition 2","this is SPARTA again");
		
		assertTrue(act.getPreconditions().size() == 0);
		
		act.addCondition(condi1);
		act.addCondition(condi2);
		
		assertTrue(act.getPreconditions().size() == 2);
		
		act.removeCondition(condi1);
		
		assertTrue(act.getPreconditions().size() == 1);
	
		
		
	}
	
	@Test
	public void addTaskToActivity()	{
		
		Activity act = new Activity("act 4","this is act 4");
		
		WorkerTask task1 = new WorkerTask(new User("1","Jens"),37);
		WorkerTask task2 = new WorkerTask(new User("2","Hans"),15);
		
		assertTrue(act.getWorkerTask().size() == 0);
		
		act.addWorkerTask(task1);
		act.addWorkerTask(task2);
		
		assertTrue(act.getWorkerTask().size() == 2);
		
		act.addWorkerTask(task1);
		
		assertTrue(act.getWorkerTask().size() == 1);
	
		
		
	}
	
	

}
