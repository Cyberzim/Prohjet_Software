package projektplanner.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	
	//Setters & Getters
	public setRunning(boolean flag){
		ifrunning = flag;
	}
	
	//Checks if user is project leader or super user
	public isProjectLeader(User user){
		if(projectLeaders.contains(user) ||
				user.isSuperUser())
			return true;
		else
			return false;
	}
	
	
	
}
