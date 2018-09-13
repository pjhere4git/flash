package sele;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mutiwebeleme {

	public static void main(String[] args) {
	
		WebDriver d= new FirefoxDriver();
		d.get("https://in.yahoo.com/?p=us");
		
       List<WebElement> lst= d.findElements(By.xpath("//a"));
       
       System.out.println(lst.size());
       
       for(int i=0;i<=lst.size();i++)
       {
    	   System.out.println(lst.get(i).getText());
       }
	}

}
