package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	public static WebDriver driver=null;
  @Test
  public void TC_1() {
	  
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
  	
      String baseUrl = "http://demo.guru99.com/test/newtours/";
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = "";

      // launch Fire fox and direct it to the Base URL
      driver.get(baseUrl);

      // get the actual value of the title
      actualTitle = driver.getTitle();

      /*
       * compare the actual title of the page with the expected one and print
       * the result as "Passed" or "Failed"
       */
      if (actualTitle.contentEquals(expectedTitle)){
          System.out.println("Test Passed!");
      } else {
          System.out.println("Test Failed");
      }
     
      
  }

  }

