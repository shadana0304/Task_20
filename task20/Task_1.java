package com.task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1 {

	public static void main(String[] args) throws InterruptedException {
		      //browser launch
			WebDriver driver = new ChromeDriver();
				
		     //launch url
			driver.get("https://jqueryui.com/datepicker/");
				
			//maximize window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			//switch iframe
			WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			driver.switchTo().frame(frame);
				
			driver.findElement(By.id("datepicker")).click();
			
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			Thread.sleep(1000);
			 driver.findElement(By.xpath("(//a[@aria-current='false'])[22]")).click();
			 
		WebElement date=driver.findElement(By.xpath("//input[@class='hasDatepicker']"));
			System.out.println(date);
			
			//driver.close
				
	}

}
