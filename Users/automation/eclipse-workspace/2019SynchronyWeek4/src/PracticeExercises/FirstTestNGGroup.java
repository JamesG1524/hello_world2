package PracticeExercises;

import org.testng.annotations.Test;

public class FirstTestNGGroup {
 
	@Test (groups = { "CAR" })
    public void Car1() {
		System.out.println("Group Car - Test car 1 ");
    }
	
	@Test (groups = { "CAR" })
    public void Car2() {
		System.out.println("Group Car - Test car 2 ");
	}
	
	@Test (groups = { "SCOOTER" })
    public void Scooter1() {
		System.out.println("Group Scooter - Test scooter 1 ");
	}
	
	@Test (groups = { "SCOOTER" })
    public void Scoter2() {
		System.out.println("Group Scooter - Test scooter 1 ");
	}
	
	@Test (groups = { "CAR", "SEDAN CAR" })
    public void Sedan() {
		System.out.println("Group Sedan - Test sedan ");
    }
	

}
