package com.sauce_demo.connection.driver;

import com.sauce_demo.connection.DriverStrategy;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

	public class Edge implements DriverStrategy {
		@Override
		public WebDriver setStrategy() {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			return driver;
		}
	}