package projektplanner.app;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class ActivityTest {
	
	@Test
	public void createAndChangeActivity()	{
		
		Activity act = new Activity("act 1","this is act 1");
		
		//test date
		Date dat = new Date();

		assertEquals(act.getStartDate(), dat);
		
		act.setStartDate(dat);
		
		assertEquals(dat,act.getStartDate());
		
		act.setEndDate(dat);
		
		assertEquals(act.getEndDate(),act.getStartDate());
		
		
		//tjek other fields
		act.setIfRunning(true);
		act.setNomHours(15);
		
		
		assertTrue(act.getName().equals("act 1"));
		assertTrue(act.getDescription().equals("this is act 1"));
		assertTrue(act.getNomHours() == 15);
		assertTrue(act.getIfRunning() == true);
		
		//make changes
		
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
		
		WorkerTask task1 = new WorkerTask(new User("1","jens"),37);
		WorkerTask task2 = new WorkerTask(new User("1","lars"),37);
		
		assertTrue(act.getWorkerTask().size() == 0);
		
		act.addWorkerTask(task1);
		act.addWorkerTask(task2);
		
		assertTrue(act.getWorkerTask().size() == 2);
		
		act.removeWorkerTask(task1);
		
		assertTrue(act.getWorkerTask().size() == 1);
	
		
		
	}
	
	@Test
	public void addProjectToActivity()	{
		
		Activity act = new Activity("act 5","this is act 5");
		Project project1 = new Project(new ProjectPlanner(), "røvhul");
		
		assertEquals(act.getOwner(),null);
		
		act.setOwner(project1);
		
		assertEquals(act.getOwner(),project1);
	
		
	}
	
@Test
public void workAndConditionsContainedInActivity()	{
		
		Activity act = new Activity("act 6","this is act 6");
		
		WorkerTask task3 = new WorkerTask(new User("1","jens"),37);
		Activity condi3 = new Activity("condition 2","this is SPARTA");
		
		assertTrue(act.getPreconditions().size() == 0);
		assertTrue(act.getWorkerTask().size() == 0);
		
		assertFalse(act.containsTask(task3));
		assertFalse(act.containsConditions(condi3));
		
		act.addCondition(condi3);
		act.addWorkerTask(task3);
		
		assertTrue(act.getPreconditions().size() == 1);
		assertTrue(act.getWorkerTask().size() == 1);
		
		assertTrue(act.containsTask(task3));
		assertTrue(act.containsConditions(condi3));
		
		
	}
	
	

}
