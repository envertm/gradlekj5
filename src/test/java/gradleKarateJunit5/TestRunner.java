package gradleKarateJunit5;

import com.intuit.karate.junit5.Karate;

public class TestRunner {

	  @Karate.Test
	    Karate testSample() {
	        return Karate.run("peticionesNuevo").relativeTo(getClass());
	    }	  
}