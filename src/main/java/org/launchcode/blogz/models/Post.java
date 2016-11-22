package org.launchcode.blogz.models;

import java.util.Date;

import org.launchcode.blogz.models.Entity;

public class Post extends Entity {
	
	private String title;
	private String body;
	private String author;
	//private final Date created;
	private Date lastEdited;
	
	public Post(String title, String body, String author) {
		super();
		this.title = title;
		this.body = body;
		this.author = author;
	}

	public static void main(String[] args) {

	}

}
