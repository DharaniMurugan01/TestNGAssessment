package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class Loginpage {
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement user;
    @FindBy(xpath = "//input[@id='password']")
    WebElement pass;
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement submit;
    @FindBy(xpath="//h3[@data-test='error']")
    WebElement wpass;
    @FindBy(xpath="//div[@class='product_label']")
    WebElement prod;
    @FindBy(xpath="(//button[text()='ADD TO CART'])[1]")
    WebElement cart;
    @FindBy(xpath="//button[@class='btn_secondary btn_inventory']")
    WebElement veradd;
    @FindBy(xpath="//a[@href='./cart.html']")
    WebElement conshop;
    @FindBy(xpath="//a[@class='btn_secondary']")
    WebElement clicon;
    @FindBy(xpath="(//button[@class='btn_primary btn_inventory'])[2]")
    WebElement cart1;
    @FindBy(xpath="//a[@class='btn_action checkout_button']")
    WebElement checkout;
    @FindBy(xpath="//button[text()='REMOVE']")
    WebElement lastassert;
  
    public Loginpage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void login(String username, String password) {
        user.sendKeys(username);
        pass.sendKeys(password);
        submit.click();
        
    }
    public String last() {
    	return lastassert.getText();
    }
    public String text() {
    	return wpass.getText();
    }
    public String prodtext() {
    	return prod.getText();
    }
    public void add() {
    	cart.click();
    }
    public void add1() {
    	cart1.click();
    }
    public String carditem() {
    	return veradd.getText();
    }
    public void tes() {
    	veradd.click();
    }
    public void concli() {
    	conshop.click();
    }
    public void cliconn() {
    	clicon.click();
    }
    public void checkoutt() {
    	checkout.click();
    }
}
