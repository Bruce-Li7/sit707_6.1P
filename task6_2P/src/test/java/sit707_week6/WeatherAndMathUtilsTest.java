package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "221105067";
		Assert.assertNotNull("Student ID is ", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Jiaqi Li";
		Assert.assertNotNull("Student name is ", studentName);
	}
	
	@Test
	public void testFalseNumberIsEven() {
		Assert.assertFalse("Number is not even", WeatherAndMathUtils.isEven(3));
	}
	
	@Test
	public void testTrueNumberIsEven() {
		Assert.assertTrue("Number is even", WeatherAndMathUtils.isEven(4));
	}
	
	@Test
	public void testPrimeNumber() {
		Assert.assertTrue("Number is prime", WeatherAndMathUtils.isPrime(7));
	}
	
	@Test
	public void testNonPrimeNumber() {
		Assert.assertFalse("Number is not prime", WeatherAndMathUtils.isPrime(8));
	}
	
	@Test
	public void testPrimeNumber_one() {
		Assert.assertTrue("1 is prime", WeatherAndMathUtils.isPrime(1));
	}
	
	
	
    @Test
    public void testCancelWeatherAdvice() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(0.0, 6.1));
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(45.1, 4.1));
    }
    
    @Test
    public void testWarnWeatherAdvice() {
    	Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(70.0, 0.0)); //Boundary value
    	Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(0.0, 6.0));	//Boundary value
    }
    
    @Test
    public void testAllClearWeatherAdvice() {
    	
    	Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(45.0, 4.0)); //Boundary value
    }
    
   
    
    
}
