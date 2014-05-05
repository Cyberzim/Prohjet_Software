package sourcecode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Activity {
	//fields
	String name;
	String description;
	Date startDate;
	Date endDate;
	int nomHours;
	boolean bRunning;
	Project owner;
	
	//lists

	List<Activity> conditionList;
	List<WorkerTask> taskList;
	
	
	//constructor
	public Activity (String name, String description) {
		this.name = name;
		this description = description;
		startDate = new Date();
		
		conditionList = new ArrayList<Activity>();
		taskList = new ArrayList<WorkerTask>();
	}
	
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setStartDate(Date date) {
		this.startDate = date;
	}
	
	public void setEndDate(Date date) {
		this.endDate = date;
	}
	
	public void setNomHours(int hours) {
		this.nomHours = hours;
	}
	
	public void setIfRunning(boolean run) {
		this.bRunning = run;
	}

	public void setOwner(Project owner) {
		this.owner = owner;
	}

	
	//list adders
	public void addCondition(Activity act) {
		conditionList.add(act);
	}

	public void addWorkerTask(WorkerTask task) {
		taskList.add(task);
	}


	//getters
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public Date getStartDate() {
		return this.startDate;
	}
	
	public Date getEndDate() {
		return this.endDate;
	}
	
	public int getNomHours() {
		return this.nomHours;
	}
	
	public boolean getIfRunning() {
		return this.bRunning;
	}

	public Project getOwner() {
		return this.owner;
	}

	//list getters
	public List<Activity> getPreconditions() {
		return conditionList;
	}

	public List<WorkerTask> getWorkerTask() { 
		return taskList;
	}


}
