package org.launchcode.blogz.models;

public abstract class Entity {
	
	private static int x = 0;
	private final int uid;
	
	public int getUID() {
		return this.uid;
	}

	public Entity() {
		this.uid = x + 1;
		x++;
	}
	
	public static void main(String[] args) {

	}

}
