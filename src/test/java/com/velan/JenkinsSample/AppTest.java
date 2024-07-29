package com.velan.JenkinsSample;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {
    
	private Calculator calculator;
	
	 @BeforeEach
	    public void setUp() {
	        calculator = new Calculator(); // This method will run before each test method
	    }

	@Test
	void testAdd() {
		int result = calculator.add(2, 3);
      assertEquals(5, result);
		
	}

	@Test
	void testSubtract() {
		 int result = calculator.subtract(5, 3);
	     assertEquals(2, result);
		         
	}
}
