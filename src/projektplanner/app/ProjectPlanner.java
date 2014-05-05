package projektplanner.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProjectPlanner {

	private boolean superUserLoggedIn = false;
	
	// List of elements in system
	private List<SuperUser> superUsers = new ArrayList<SuperUser>();
	private List<User> users = new ArrayList<User>();
	private List<Project> projects = new ArrayList<Project>();
	private DateServer dateServer = new DateServer();
	
	// Following methods are checking loggedin condition
	public boolean superUserLoggedIn() {
		return superUserLoggedIn;
	}
	
	public boolean superUserLogin(String password) {
		return superUserLoggedIn = "supersuper".equals(password);
	}
	
	// Methods used to get list of user etc.
	public List<User> getUsers() {
		return Collections.unmodifiableList(users);
	}
	
	public List<Project> getProjects() {
		return Collections.unmodifiableList(projects);
	}
	
	// Following are the main methods
	
	// register different users
	public void registerUser(User user) throws OperationNotAllowedException {
		if (!superUserLoggedIn)
			throw new OperationNotAllowedException("Register user");
		user.setProjectPlanner(this);
		users.add(user);
	}
	
	public void registerProject(Project project) throws OperationNotAllowedException {
		if (!superUserLoggedIn)
			throw new OperationNotAllowedException("Register project");
		project.setProjectPlanner(this);
		projects.add(project);
	}
	
	public void removeUser(User user) throws OperationNotAllowedException {
		if (!superUserLoggedIn)
			throw new OperationNotAllowedException("Register user");
		users.remove(user);
	}
	
	public void removeProject(Project project) throws OperationNotAllowedException {
		if (!superUserLoggedIn)
			throw new OperationNotAllowedException("Register user");
		projects.remove(project);
	}
	
	public int getNewProjectId(){
		if(projects.isEmpty())
			return 1;
		
		int max = 0;
		for(Project project : projects){
			if(project.getId() > max)
				max = project.getId();
		}
		return max + 1;
	}
	
	// Following are for searching for superuser, user and project
	public List<User> searchForUser(String name) {
		List<User> list = new ArrayList<User>();
		for (User user : users) {
			if (name.contains(user.getName())) {
				list.add(user);
			}
		}
		
		return list;
	}
	public List<Project> searchForProject (String name){
		List<Project> list = new ArrayList<Project>();
		for (Project project : projects) {
			if (name.contains(project.getName())) {
				list.add(project);
			}
		}
		return list;
	}
}