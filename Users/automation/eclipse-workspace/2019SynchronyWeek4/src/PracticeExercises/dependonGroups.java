package PracticeExercises;

import org.testng.annotations.Test;

public class dependonGroups {
  
	
	@Test (dependsOnGroups = { "Numbers*" }) 
	public void testOne() {
	  System.out.println("Test Method One");
  }
  
	@Test (groups = { "Numbers" })
  public void testTwo() { 
	  System.out.println("Test Method Two");
  }
  
	@Test (groups = { "Numbers" })
  public void testThree() {
	  System.out.println("Test Method Three");
  }
  
  
  
}
