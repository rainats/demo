package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {
	

	  private DemoApplication demoObject =new DemoApplication();
	 
	 	@BeforeClass		
	    public static void setUpBeforeClass()  throws Exception{							
	        System.out.println("Using @BeforeClass , executed before all test cases ");					
	    }
	 	

	 	@Before
	    public void setUp()  throws Exception{
		 
		 demoObject = new DemoApplication();
		 System.out.println("IT IS FROM SETUP:::demoObject::"+demoObject);
	    }
	
	
	 	@Test
	    public void testConcatName_WithSuccess() {
	       
		 String concatName = demoObject.concatName("MM", "RR");
		 System.out.println("Running testConcatName_WithSuccess");
		 
		 assertEquals("MMRR",concatName);  
	    }
	 
	 
	 @Test
	    public void testConcatName_WithFailure() {
	       
		 String concatName = demoObject.concatName("MMM", "RR");
		 System.out.println("Running testConcatName_WithFailure");
		 assertNotEquals("MMRR",concatName);  
	    }
	 
	  
	 @Test
	  public void testAddNum_WithSuccess() {

		 int result = demoObject.addNum(100, 2);
		 System.out.println("Running testAddNum_WithSuccess");
		 assertEquals(result,102);
	 }
	 
	 @Test
	  public void testAddNum_WithFailure() {

		 int result = demoObject.addNum(100, 5);
		 System.out.println("Running testAddNum_WithFailure");
		 assertNotEquals(result,102);
	 }
	 
	  @Test
	   public void tesDivideNumber_WithSuccess()
	   {
		   System.out.println("Running tesDivideNumber_WithSuccess");
		   assertEquals(2,demoObject.divideNum(4, 2)); 
	   }
	 
	  @Test
	   public void tesDivideNumber_WithFailure()
	   {
		   System.out.println("Running tesDivideNumber_WithFailure");
		   assertNotEquals(8,demoObject.divideNum(4, 2)); 
	   }
	  
	  
	  //@Test(expected = ArithmeticException.class)
	    //public void tesDivideNumber_WithArithmeticException() {
	       
		  //demoObject.divideNum(4, 0); 
	   // }
	  
	 // @Test(Assertions.assertThrows(ArithmeticException.class, () -> demoObject.divideNum(4, 0));)
	  
	  	@After
	    public void tearDown()  throws Exception{
		 demoObject = null;
		 System.out.println("IT IS FROM tearDown:::demoObject ::"+demoObject);
	    }
	  
	  @AfterClass		
	    public static void m3() throws Exception{							
	        System.out.println("Using @AfterClass ,executed after all test cases");					
	    }	
	  

}
	

