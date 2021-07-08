package ccom.cucu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;



public class SearchHotel {
	public static WebDriver driver;
	
//	@Before
//	public void Browser() {
//	  WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://adactinhotelapp.com/");
//		driver.findElement(By.id("username")).sendKeys("rameshadepu");
//		driver.findElement(By.id("password")).sendKeys("ramesh11");
//		driver.findElement(By.id("login")).click();
//	}
	
//	@After
//	public void CloseBrowser() {
//		driver.close();
//	}
	
	 @Then ("^Select location$")
	 public void Location() {
		Select location = new Select(driver.findElement(By.xpath("//select[@id='location']")));
		location.selectByVisibleText("Melbourne");
	 }
	 @And ("^Select no Of rooms$")
	 public void noofromms() {
		 
		Select noOfRooms = new Select(driver.findElement(By.id("room_nos")));
		noOfRooms.selectByValue("2");
	 }
	 @And ("^Select between dates$")
	 public void dates() {
		driver.findElement(By.id("datepick_in")).sendKeys("17/06/2021");
		driver.findElement(By.id("datepick_out")).sendKeys("20/06/2021");
	 }
	 @Then ("^Adults Per Room$")
	 public void Adultsperroom() {
		 
		Select adultsPerRoom = new Select(driver.findElement(By.id("adult_room")));
		adultsPerRoom.selectByValue("2");
	 }
	 @Then ("^Submit$")
	 public void submit() {
		
		driver.findElement(By.id("Submit")).submit();
	 }
	}
	
	


