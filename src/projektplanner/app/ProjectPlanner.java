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
		// project.setProjectPlanner(this);
		projects.add(project);
	}
	
	// Following are for searching for superuser, user and project
//	public Object search(String string) {
//		for (SuperUser superUser : superUsers) {
//			if (string.equals(superUser.getName())) {
//				return superUser;
//			}
//		}
//		for (User user : users) {
//			if (string.equals(user.getName())) {
//				return user;
//			}
//		}
//		for (Project project : projects) {
//			if (string.equals(project.getName())) {
//				return project;
//			}
//		}
//		return null;
//	}
}