package com.careerhack.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.careerhack.common.MajesticMayGoogleBase;
import com.careerhack.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MajesticMayGoogleSearch extends MajesticMayGoogleBase {
	


	@Given("I am on google homepage")
	public void i_am_on_google_homepage() {
		
		launchBrowser();
	   
	}

	@When("I enter the search {string}")
	public void i_enter_the_search(String string) {
		
		//Step1: locate
		//1.id 2.name 3.class 4.html tag 5.link text 6.partial link text
		//7.css 8.xpath
		HomePage hp =new HomePage(driver);
		hp.enterSearch(string);
		
		//WebElement searchBox = driver.findElement(By.name("q"));
	    //searchBox.sendKeys(string);
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		//WebElement searchButton = driver.findElement(By.name("btnK"));
		//searchButton.submit();
		
		HomePage hp =new HomePage(driver);
		hp.clickSearch();
	  
	}

	@Then("I received related search result")
	public void i_received_related_search_result() {
		WebElement searchResult = driver.findElement(By.id("result-stats"));
		String results  = searchResult.getText(); // declaring serchResult in results
		System.out.println("=================");
		System.out.println(results);
		System.out.println("=================");
	    closeBrowser();
	}
	
	

}
