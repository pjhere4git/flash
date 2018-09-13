package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileattac {

	public static void main(String[] args) {
    
		WebDriver d= new FirefoxDriver();
		d.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		d.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		d.findElement(By.id("identifierId")).sendKeys("hellopersi17");
		d.findElement(By.xpath("//span[text()='Next']")).click();
		d.findElement(By.name("password")).sendKeys("9431359313");
		
		d.findElement(By.xpath("//span[text()='Next']")).click();
		
		
		
		
	}

}
