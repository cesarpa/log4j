package com.nt.jdbc;

import java.sql.Connection;
import java.sql.Statement;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class SelectTest {

	private static Logger logger = Logger.getLogger(SelectTest.class);
	static {
		try {
			SimpleLayout layout = new SimpleLayout();
			ConsoleAppender appender = new ConsoleAppender();
			logger.addAppender(appender);
			logger.setLevel(Level.DEBUG);
			logger.info("SelectTest::Log4j Setup ready");
		} catch (Exception e) {
			e.printStackTrace();
			logger.fatal("SelectTest::Problem while setting up Log4j");
		}
	}

	public static void main(String args[]) {
		logger.debug("SelectTest::start of main(-) method");
		Connection con = null;
		Statement st = null;
	}
}
