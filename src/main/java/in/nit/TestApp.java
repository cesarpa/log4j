package in.nit;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;

public class TestApp {

	private static Logger log = Logger.getLogger(TestApp.class);
	
	public static void main(String[] args) {
		// I have the patter layout on resources/imagfes/PatternLayout
		
		// Layout layout = new HTMLLayout();
		// Layout layout = new XMLLayout();
	/*	Layout layout = new PatternLayout("%d{dd-MM-yy hh:mm} %p --- [%M]:| %C %L %m %n"); 
		Appender app = new ConsoleAppender(layout, "C:/mylogs/data.log");
		
		// lin appender to logger
		log.addAppender(app); */
		
		log.info("FROM INFO");
		log.debug("FROM DEBUG");
		log.fatal("FROM FATAL");
		log.error("FROM ERROR");
		log.warn("FROM WARNING");
		
	}
}
