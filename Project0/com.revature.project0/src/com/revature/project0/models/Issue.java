package com.revature.project0.models;

/**
 * This is a class used to model coding issues
 * @author nicka
 *
 */
public class Issue {
// The class: the template
	// The members: fields/attributes, methods, constructors
	
// Fields:
	// used to define characteristics of a class
	// used to define dependencies of the class
	
	private String title;
	private String description;
	private int id;
	
// Constructors:
	// special methods that are used to initialize properties of a class
	// if you don't put in a constructor, that's fine, a default constructor will be created for you
	// No Args Constructor
	public Issue() {
		this("No title", "No description", 0);
	}
	// Parameterized Constructor:
	public Issue (String title, String description) {
		// the this keyword pertains to the particular instance's title and description properties
		// the title attribute of the object I'm constructing will have the value of the title parameter I am passing
		this.title = title;
		this.description = description;
	}
	public Issue(String title, String description, int id)
	{
		// calling an existing constructor of the same class
		this(title, description);
		this.id = id;
	}
	
// Methods:
	// describe behavior and introduce logic to a class
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	// format of object when converted to string
	@Override
	public String toString() {
		return "Issue [title=" + title + ", description=" + description + ", id=" + id + "]";
	}

}
