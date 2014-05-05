package projektplanner.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


public class Project {
	
	private int id;
	private ProjectPlanner projectPlanner;
	private boolean running;
	private List<Activity> activities;
	private List<User> users;
	private List<User> projectLeaders;
	
	private String name;
	private String description;
	private Date startDate;
	private Date endDate;
	
	//Constructor
	public Project(ProjectPlanner projectPlanner, String name){
		this.id = projectPlanner.getNewProjectId();
		this.projectPlanner = projectPlanner;
		this.name = name;
		
		this.running = true;
		this.activities = new ArrayList<Activity>();
		this.users = new ArrayList<User>();
		this.projectLeaders = new ArrayList<User>();
		this.startDate = new Date();
	}
	
	//Setters
	public void setRunning(boolean flag){ running = flag; }
	public void setName(String name){ this.name = name; }
	public void setDescription(String description){ this.description = description; }
	public void setStartDate(Date startDate){ this.startDate = startDate; }
	public void setEndDate(Date endDate){ this.endDate = endDate; }
	
	//Getters
	public int getId(){ return id; }
	public boolean isRunning(){ return running; }
	public List<Activity> getActivities(){ return Collections.unmodifiableList(activities); }
	public List<User> getUsers(){ return Collections.unmodifiableList(users); }
	public List<User> getProjectLeaders(){ return Collections.unmodifiableList(projectLeaders); }
	public String getName(){ return new String(name); }
	public String getDescription(){ return new String(description); }
	public Date getStartDate(){ return new Date(startDate.getTime()); }
	public Date getEndDate(){ return new Date(endDate.getTime()); }
	
	//Add user to project
	public void addUser(User user){
		if(!users.contains(user))
			users.add(user);
	}
	
	//Add projectleader
	public void addProjectLeader(User user){
		if(!users.contains(user))
			users.add(user);
		if(!projectLeaders.contains(user))
			projectLeaders.add(user);
	}
	
	//Add activity
	public void addActivity(Activity activity){
		if(!activities.contains(activity))
			activities.add(activity);
	}
	
	public void setProjectPlanner (ProjectPlanner pp){
		projectPlanner = pp;
	}
		
	//Checks if user is project leader or super user
	public boolean isProjectLeader(User user){
		if(projectLeaders.contains(user) ||
				user.isSuperUser())
			return true;
		else
			return false;
	}
	
	
	
}
