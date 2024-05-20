package sit707_week6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Assert;
import org.junit.Test;


public class ConditionalLoopsTest {

	@Test
	public void testSumEvenNumbers() {
	    // All numbers are even
	    assertEquals(4, ConditionalLoops.sumEvenNumbers(new int[]{2, 4, 6, 8}));
	    //Three odd number
	    assertEquals(0, ConditionalLoops.sumEvenNumbers(new int[]{1,3,7}));

	    // All numbers are odd
	    assertEquals(0, ConditionalLoops.sumEvenNumbers(new int[]{1, 3, 5, 7}));
	    //negative number and positive number
	    assertEquals(1, ConditionalLoops.sumEvenNumbers(new int[]{-1, 3, 5, 7,-2}));
	    //positive number
	    assertEquals(3, ConditionalLoops.sumEvenNumbers(new int[]{1,2,3,4,5,6,7}));
	    //mixed order
	    assertEquals(4, ConditionalLoops.sumEvenNumbers(new int[]{2,1,4,8,20,3,7}));
	    //test for 0
	    assertEquals(1, ConditionalLoops.sumEvenNumbers(new int[]{0}));
	    //test max value
	    assertEquals(0, ConditionalLoops.sumEvenNumbers(new int[]{Integer.MAX_VALUE}));
	    
	    //test lowest value
	    assertEquals(1, ConditionalLoops.sumEvenNumbers(new int[]{Integer.MIN_VALUE}));
	    
	    assertEquals(3, ConditionalLoops.sumEvenNumbers(new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE,0,1,-3,4}));
	    //test repeat number
	    assertEquals(0, ConditionalLoops.sumEvenNumbers(new int[]{1,1,1,1,1,1}));
	    assertEquals(5, ConditionalLoops.sumEvenNumbers(new int[]{2,2,2,2,2}));
	    assertEquals(0, ConditionalLoops.sumEvenNumbers(new int[]{-1,-1,-1}));
	    assertEquals(3, ConditionalLoops.sumEvenNumbers(new int[]{-2,-2,-2}));
	    

	    // No numbers, so no evens
	    assertEquals(0, ConditionalLoops.sumEvenNumbers(new int[]{}));

	    // Negative number for even
	    assertEquals(1, ConditionalLoops.sumEvenNumbers(new int[]{-2}));
	    assertEquals(4, ConditionalLoops.sumEvenNumbers(new int[]{-2,-4,-6,-8}));

	    // Large number for even
	    assertEquals(1, ConditionalLoops.sumEvenNumbers(new int[]{1000000,1000005}));
	    assertEquals(1, ConditionalLoops.sumEvenNumbers(new int[]{-1000000,1000005}));
	    //Large number for odd
	    assertEquals(0, ConditionalLoops.sumEvenNumbers(new int[]{1000001,1000007,104837443,1028947821}));
	    assertEquals(0, ConditionalLoops.sumEvenNumbers(new int[]{-1000001,-1000007}));

	    // Mixed positive and negative number for even
	    assertEquals(3, ConditionalLoops.sumEvenNumbers(new int[]{-2, 2, -3, 4, -5}));

	    // Mixed order for even
	    assertEquals(2, ConditionalLoops.sumEvenNumbers(new int[]{5, 4, 3, 2, 1}));
	    assertEquals(3, ConditionalLoops.sumEvenNumbers(new int[]{2,8,1,5,8}));
	    assertEquals(4, ConditionalLoops.sumEvenNumbers(new int[]{-1,-1,-3,-4,-2,-16,-20}));

	    // Single even number
	    assertEquals(1, ConditionalLoops.sumEvenNumbers(new int[]{2}));

	    // Single odd number
	    assertEquals(0, ConditionalLoops.sumEvenNumbers(new int[]{1}));
	    assertEquals(0, ConditionalLoops.sumEvenNumbers(new int[]{-1}));
	    assertEquals(0, ConditionalLoops.sumEvenNumbers(new int[]{-7}));
	    assertEquals(0, ConditionalLoops.sumEvenNumbers(new int[]{7}));
	    
	}
	@Test
	public void testContainsPrime() {
	    // All numbers are prime
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{2, 3, 5, 7, 11}));
	    //mixed order
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{2,1,6,9,4,5,11}));
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{3,2,11,5,7}));

	    // No prime numbers
	    assertEquals(false, ConditionalLoops.containsPrime(new int[]{4, 6, 8, 10}));
	    assertEquals(false, ConditionalLoops.containsPrime(new int[]{6,4,10,8}));

	    // No numbers
	    assertEquals(false, ConditionalLoops.containsPrime(new int[]{}));

	    // Negative numbers (there should no prime.however, however,in the isPrime() there will return true.)
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{-2, -3, -5, -7}));
	    //mixed order
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{-2,6,-16,29,-7,5}));

	    // Large prime number
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{1000003,1000000}));
	    //large negative number
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{-1000003,-1000000}));
	    //mixed large number
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{-1000003,-1000000,100000,100003}));

	    // Mixed positive and negative numbers
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{-2, 2, -3, 5, -7}));

	    // Single prime number
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{2}));
	    //single negative number
	 
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{-2}));

	    // Single non-prime number
	    assertEquals(false, ConditionalLoops.containsPrime(new int[]{4}));
	    //Mixed large and small numbers
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE,0,2,-2,-10}));
	    //test for largest number and lowest number
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{Integer.MAX_VALUE}));
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{Integer.MIN_VALUE}));
	    //mixed number
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{2,3,4,6,8,13}));
	    //repeat number
	    assertEquals(false, ConditionalLoops.containsPrime(new int[]{4,4,4,4,4}));
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{2,2,2,2,2,2}));
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{0,0,0,0,0,0}));
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{1,1,1,1,1,1}));
	    //negative should not be prime. isPrime() should return false.
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{-2,-2,-2}));
	    //test for 0
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{0}));
	    //mixed number for prime
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{2,4,3,6}));
	    //test for 1
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{1}));
	    //mixed with 1
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{1,1,1,0}));
	    assertEquals(true, ConditionalLoops.containsPrime(new int[]{1,0,-2,5}));
	    
	    
	}
	
	
	
}

   
