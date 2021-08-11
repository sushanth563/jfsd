package klh.edu;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

 class DemoAssert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Result rs=JUnitCore.runClasses(Assert.class);
		  for(Failure failure:rs.getFailures()) {
			  System.out.println(failure.toString());
			  
		  }
		    
	}
	}
