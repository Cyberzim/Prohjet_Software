package projektplanner.app;

import static org.junit.Assert.*;
import org.junit.*;

public class ProjectTest {
	
	ProjectPlanner projectPlanner;
	
	@Before
	public void setUp(){
		projectPlanner = new ProjectPlanner();
	}
	
	@Test
	public void addNewProject(){
		Project project = new Project(projectPlanner, "Project1");
		
		assertEquals("Project1", project.getName());
		assertEquals(1, project.getId());
		assertEquals(1, projectPlanner.getProjects().size());	
	}
	
	@Test
	public void addSameProjectTwice(){
		
	}
	
	
}
