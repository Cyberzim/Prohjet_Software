package projektplanner.app;

import java.util.*;

public class Event {

	// Fields
	String name;
	String description;
	Date startDate;
	Date endDate;
	List<User> users;

	// Constructor
	public Event(String name, String description, Date startDate, Date endDate) 
	{
		users = new ArrayList<User>();
		this.startDate = startDate;
		this.endDate = endDate;
		this.name = name;
		this.description = description;
	}

	// Setters : Main methods for general descriptions
	public void setName(String name) { this.name = name; }
	
	public void setDesription(String description) { this.description = description; }

	public void setStartDate(Date date) { startDate = date; }

	public void setEndDate(Date date) { endDate = date; }
	
	// Handle users
	public void addUser(User user) { users.add(user); }
	
	public void removeUser (User user) { users.remove(user); }
	
	// getters
	public List<User> getUsers() { return Collections.unmodifiableList(users); }

	public String getName() { return new String(name); }

	public String getDesription() { return new String(description); }

	public Date getStartDate() { return new Date(startDate.getTime()); }

	public Date getEndDate() { return new Date(endDate.getTime()); }

	@Override
	public String toString() {
		return "Name: " + this.getName() + "Startdate: "
				+ this.getStartDate() + "and Enddate: " + this.getEndDate()
				+ "\n" + "Description: " + description;
	}
}
