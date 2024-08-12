package WBAsssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class NewUser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
driver.get(" https://rahulshettyacademy.com/client");
driver.manage().window().maximize();
  WebElement   register=driver.findElement(By.cssSelector("body > app-root > app-login > div.banner > section:nth-child(2) > div > div.login-wrapper.my-auto.p-5 > p > a"));
  register.click(); 
  
  Thread.sleep(2000);
 WebElement  Fname= driver.findElement(By.id("firstName"));
 Fname.sendKeys("Pramod");
 WebElement  Lname= driver.findElement(By.id("lastName"));
 Lname.sendKeys("Basangoudar");
 Thread.sleep(2000);
 WebElement  email= driver.findElement(By.id("userEmail"));
 email.sendKeys("pramodrb2017@gmail.com");
 WebElement  Mnumber= driver.findElement(By.id("userMobile"));
 Mnumber.sendKeys("8152836194");
 Thread.sleep(2000);
 
 
  WebElement optionstab= driver.findElement(By.cssSelector("body > app-root > app-register > div.banner > section:nth-child(2) > div > div.login-wrapper.my-auto.p-5 > form > div:nth-child(3) > div:nth-child(1) > select"));
 
   Select sel1= new Select(optionstab);
   sel1.selectByIndex(3);
   WebElement male= driver.findElement(By.cssSelector("body > app-root > app-register > div.banner > section:nth-child(2) > div > div.login-wrapper.my-auto.p-5 > form > div:nth-child(3) > div:nth-child(2) > label:nth-child(2) > input"));
   male.click();
   
   Thread.sleep(3000);
   WebElement pwd = driver.findElement(By.id("userPassword"));
   pwd.sendKeys("Pramod@6194");
   
   WebElement CNpwd = driver.findElement(By.id("confirmPassword"));
   CNpwd.sendKeys("Pramod@6194");
   
   WebElement ageradio = driver.findElement(By.cssSelector("body > app-root > app-register > div.banner > section:nth-child(2) > div > div.login-wrapper.my-auto.p-5 > form > div:nth-child(5) > div.col-md-1 > input"));
   ageradio.click();
  WebElement   Register= driver.findElement(By.name("login"));
  Register.click();
   //WebElement alreadyhaveaccount= driver.findElement(By.linkText("Already have an account?"));
   //alreadyhaveaccount.click();
    driver.navigate().back();
    
   Thread.sleep(3000);
   WebElement  emailfeild =driver.findElement(By.id("userEmail"));
   emailfeild.sendKeys("pramodrb2017@gmail.com");
   Thread.sleep(2000);
   
   WebElement  pwdfeild =driver.findElement(By.id("userPassword"));
  pwdfeild.sendKeys("Pramod@6194");
  
  
  WebElement LoginButton = driver.findElement(By.name("login"));
  LoginButton.click();
  Thread.sleep(3000);
  
  WebElement AddtoCart = driver.findElement(By.cssSelector("#products > div.container > div.row > div:nth-child(2) > div > div > button.btn.w-10.rounded"));
   AddtoCart.click();
   
   Thread.sleep(5000);
 WebElement   clicktocart= driver.findElement(By.xpath("/html/body/app-root/app-dashboard/app-sidebar/nav/ul/li[4]/button"));
     clicktocart.click();
     
     System.out.println(" Iteam add to cart sucessfully ");
	}

}
