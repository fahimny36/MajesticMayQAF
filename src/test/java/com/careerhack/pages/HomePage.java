package com.careerhack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	
	public HomePage(WebDriver driver) {
		
		
		
		
			
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//WebElement searchBox = driver.findElement(By.name("q"));
	@FindBy(name= "q")
	WebElement searchBox;
   // searchBox.sendKeys(string);
	
	public void enterSearch(String string) {
		searchBox.sendKeys(string);
	}
	//WebElement searchButton = driver.findElement(By.name("btnK"));
	@FindBy(name="btnK")
	WebElement searchButton;
	
	
	//searchButton.submit();
	public void clickSearch() {
		searchButton.submit();
	}
	

}
