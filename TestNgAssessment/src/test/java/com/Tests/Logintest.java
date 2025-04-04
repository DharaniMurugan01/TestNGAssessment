package com.Tests;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.pages.Loginpage;
@Listeners(com.utilities.ExtentListeners.class)
public class Logintest extends Basetest{
	public static final Logger log=LogManager.getLogger(Logintest.class);
    @Test(dataProvider="exceldata",dataProviderClass=com.utilities.DP.class)
    public void testLogin(String username,String password){
    	log.info("welcome");
        Loginpage lp=new Loginpage(driver);
        lp.login(username,password);
        if(driver.getCurrentUrl().equals("https://www.saucedemo.com/v1/inventory.html")) {
        	Assert.assertEquals(lp.prodtext(),"Products");
        	System.out.println("login successfull");
        	lp.add();
        	String k=lp.carditem();
        	Assert.assertEquals(k,"REMOVE");
        	System.out.println("item added successfully");
        	lp.tes();
        	System.out.println("item removed");
        	String h=lp.Removever();
        	Assert.assertEquals(h,"ADD TO CART");
        	System.out.println("remove Asserted successfully");
        	lp.concli();
        	lp.cliconn();
        	lp.add1();
        	String x=lp.last();
        	String y="REMOVE";
        	Assert.assertEquals(x,y);
        	System.out.println("Order is successfull");
        	lp.concli();     
        	lp.checkoutt();
        	lp.send();
        }
    	String ac=lp.text();
    	if(ac.contains("Password is required")) {
        	String ex="Password is required";
        	Assert.assertTrue(ac.contains(ex));
        	System.out.println("required password");
        }
        else if(ac.contains("Username is required")) {
        	Assert.assertTrue(ac.contains("Username is required"));
        	System.out.println("username required");
        }
        else if(ac.contains("Username and password do not match any user in this service")) {
        	Assert.assertTrue(ac.contains("Username and password do not match any user in this service"));
            System.out.println("both are not valid");
        }
    }
}