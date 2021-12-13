package com.crm.sample;

import org.testng.annotations.Test;

public class ReadDataFromcmdTest {
  @Test
  public void read() {
	  System.out.println("reading data from cmd line");
	  String URL = System.getProperty("url");
	  String Browser = System.getProperty("browser");
	  String UserName=System.getProperty("username");
	  String Password=System.getProperty("password");
	  System.out.println(URL);
	  System.out.println(Browser);
	  System.out.println(UserName);
	  System.out.println(Password);
	  
	  
  }
}
