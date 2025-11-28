package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
  private WebDriver driver;
  
  private By emailtxtbox=By.id("Email");
  private By passwordtxtbox=By.id("Password");
  private By loginbtn=By.xpath("//button[@class='button-1 login-button']");
  
  public LoginPage(WebDriver driver)
  {
	this.driver=driver;
  }
  
  public void enteremailtxtbox(String email)
  {
	  driver.findElement(emailtxtbox).clear();
	  driver.findElement(emailtxtbox).sendKeys(email);
  }
  
  public void enterpassword(String pwd) 
	{
	  driver.findElement(passwordtxtbox).clear();
	  driver.findElement(passwordtxtbox).sendKeys(pwd);
	}
  
  public void clickonlogin() 
  {
	driver.findElement(loginbtn).click();
  }
  
}
