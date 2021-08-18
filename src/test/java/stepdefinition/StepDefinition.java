package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition {
	WebDriver driver;
	
	//Drop Down
	
	@Given("Login into webpage")
	public void login_into_webpage() {
	    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	}

	@When("user handling dropdown list box and implicitly wait in 5seconds")
	public void user_handling_dropdown_list_box_and_implicitly_wait_in_5seconds() {
		
		Select sel=new Select(driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button")));
		sel.selectByIndex(3);
		sel.selectByIndex(4);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    	}

	@Then("Exit into webpage")
	public void exit_into_webpage() {
		driver.close();
	    	}

	//Drag and Drop
	
	@Given("Login into webpage2")
	public void login_into_webpage2() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://jqueryui.com/droppable/");
		
	} 

	@When("user handling drag and drop in webpage")
	public void user_handling_drag_and_drop_in_webpage() {
	    driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
	    
	    WebElement source=driver.findElement(By.id("draggable"));
	    WebElement desigination=driver.findElement(By.id("droppable"));
	    
	    Actions act=new Actions(driver);
	    act.dragAndDrop(source, desigination).perform();
	}

	@Then("Exit into webpage2")
	public void exit_into_webpage2() {
	   driver.quit();
	   driver.close();
	}

	//Popup Window
	
	@Given("Login into webpage3")
	public void login_into_webpage3() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.shawchicago.org/");
	    
	}

	@When("user handling popup windows in webpage")
	public void user_handling_popup_windows_in_webpage() {
	    
		driver.manage().window().maximize();
		driver.findElement(By.name("Google Translate")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}

	@Then("Exit into webpage3")
	public void exit_into_webpage3() {
	    
		driver.quit();
		driver.close();
	}

}
