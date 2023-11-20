package com.task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_2 {

	public static void main(String[] args) throws InterruptedException {
		//browser launch
				WebDriver driver = new ChromeDriver();
				
				//launch url
				driver.get("https://www.guvi.in/");
				
				//maximize window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//filled filled with required details
              driver.findElement(By.linkText("Sign up")).click();
              driver.findElement(By.id("name")).sendKeys("Redmi");
              driver.findElement(By.id("email")).sendKeys("User3606@gmail.com");
              driver.findElement(By.id("password")).sendKeys("Ragu@123");
              driver.findElement(By.id("mobileNumber")).sendKeys("9564678957");
              
              //click on signup button & submit the form
              driver.findElement(By.linkText("Sign Up")).click();
              Thread.sleep(1000);
              
              String smsg = driver.findElement(By.className("sub-head")).getText();
              
              //registration verify
      		if(smsg.contains("account has been created")) {
      			
      			System.out.println("Registration Success");
      		}else {
      			System.out.println("Registration Unsuccess");
      		}
             driver.navigate().refresh();
             driver.findElement(By.linkText("Login")).click();
             driver.findElement(By.id("email")).sendKeys("User3606@@gmail.com");
     		 driver.findElement(By.id("password")).sendKeys("Ragu@123");
     		 driver.findElement(By.id("login-btn")).click();
     		
     		
     		//driver.close();
      		
              
        /* to validate login page by using refresh()
         * login button didn't work by using dummy id & password so can't able to verify login successfull or not
         * 
         *   
         *   
         *   
         *   
         */
              
	}

}
