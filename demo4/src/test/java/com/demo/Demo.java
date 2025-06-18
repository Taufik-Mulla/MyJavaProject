package com.demo;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.config.Configuration;

public class Demo {

	private WebDriver driver = Configuration.getConfiguration();

	@Test
	public void testLogin() {

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String title = driver.getCurrentUrl();

		assertEquals("https://www.saucedemo.com/v1/inventory.html", title);

	}
}