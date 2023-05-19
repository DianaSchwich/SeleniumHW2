package homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//HW  (only use XPATH)
//navigate to fb.com
//click on create new account
//fill up all the textboxes
//close the popup
//close the browser
public class task1 {
    public static void main(String[] args) throws InterruptedException {


    WebDriver driver= new ChromeDriver();
    driver.get("https://www.facebook.com/login/");
    driver.manage().window().maximize();

     WebElement createAccount =driver.findElement(By.xpath("//a[text()='Create new account']"));
     createAccount.click();
        Thread.sleep(1000);

      WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Diana");



       WebElement lastName= driver.findElement(By.xpath("//input[@name='lastname']"));
       lastName.sendKeys("Schwichtenberg");

      WebElement email= driver.findElement(By.xpath("//input[@name='reg_email__']"));
      email.sendKeys("djdfhfd@hotmail.com");


        WebElement confirmEmail= driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        confirmEmail.sendKeys("djdfhfd@hotmail.com");

        WebElement password =driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        password.sendKeys("hhjjkk");


        WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
        month.sendKeys("October");

        WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
       day.sendKeys("22");

       WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
       year.sendKeys("2003");

       WebElement gender= driver.findElement(By.xpath("//label[text()='Female']"));
       gender.click();
       Thread.sleep(5000);
        driver.quit();














    }}
