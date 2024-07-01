package com.sauce_demo.connection;

import com.sauce_demo.connection.driver.*;
public class DriverStrategyExecution {

	public static DriverStrategy chooseStrategy(String strategy) {
		
		switch (strategy) {
		case Constants.CHROME:
			return new Chrome();
		case Constants.FIREFOX:
			return new Firefox();
		case Constants.EDGE:
			return new Edge();
		case Constants.SAFARI:
			return new Safari();
		case Constants.IE:
			return new InternetExplorer();
			case Constants.OPERA:
				return new Opera();
		default:
			return null;
		}
	}
}