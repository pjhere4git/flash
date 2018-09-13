package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framehandling {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver  d= new FirefoxDriver();
		d.get("http://toolsqa.com/iframe-practice-page/");
		 	d.switchTo().frame("iframe1");
		 	Thread.sleep(4000);
		 	d.findElement(By.xpath("//div[@class='entry-content']/div/div/p/a/img")).click();
		 	d.switchTo().defaultContent();
		 	d.findElement(By.xpath("//div[@class='menu-box']/ul/li[2]/a/span/span/span[text()='Tutorial']")).click();

	}

}
