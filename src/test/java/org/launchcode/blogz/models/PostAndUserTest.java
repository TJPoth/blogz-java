package org.launchcode.blogz.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class PostAndUserTest {

	@Test
	public void testIsValidUsername() {
		boolean isValid = User.isValidUsername("bob12");
		assertTrue(isValid == true);
		isValid = User.isValidUsername("well123is");
		assertTrue(isValid == true);
		isValid = User.isValidUsername("12");
		assertTrue(isValid == false);
		isValid = User.isValidUsername("");
		assertTrue(isValid == false);
		isValid = User.isValidUsername("bobisthebestmanintheworld");
		assertTrue(isValid == false);
	}

}
