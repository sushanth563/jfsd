package klh.edu;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class Assert {
	@Test
	public void testAssert() {
		String str=new String("Klu");
		String str1=new String("Klu");
		String str2=null;
		String str3="CSE";
		String str4="CSE";
		int val=5;
		int val1=7;
		String[] expectedArray= {"one","two","three"};
		String[] resultArray= {"one","two","three"};
		// AssertEquals
		assertEquals(str,str1);
		//assertTrue: check whether condition is true
		assertTrue(val<val1);
		//assertFalse:check whether the condition is false
		assertFalse(val>val1); 
		//assertNull:check object is null
		assertNull(str2);
		//assertNotNull:checks object is not null
		assertNotNull(str);
		//assertSaame:checks whether two object references are pointing same object
		assertSame(str3,str4);
		//assertArrayEquals:it similar to the assert equals,whether two array are  equal are not
		assertArrayEquals(expectedArray,resultArray);	}

	
	}


