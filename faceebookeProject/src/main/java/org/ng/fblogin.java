package org.ng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class fblogin extends Baseclass {
	@BeforeClass
	private void launchchromebrowser() {
		launchTheBrowser();

	}
	@BeforeMethod
	private void launchurl() {
		launchUrl("https://en-gb.facebook.com/");
		windowMax();
		Date d = new Date();
		System.out.println(d);
		

	}
	@Parameters("email")
	@Test(priority = 1)
	private void email(String email) {
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys(email);
		
	}
	@Parameters("password")
	@Test(priority = 2)
	private void password(String password) {
		WebElement Pass = driver.findElement(By.name("pass"));
		Pass.sendKeys(password);
		

	}
	@Test(priority = 3)
	private void sogin() {
		WebElement Login = driver.findElement(By.name("login"));
		Login.click();

	}
	@AfterClass
	private void closekthebrowser() {
		closebrowser();

	}
	}
