package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Manager;

public class ManagerTest {

	@Test
	public void testCovered() {
		Manager manager = new Manager();
		
		int result = manager.Covered();
		
		assertTrue(result == 1);
	}

}
