package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    @Test
    public void loginSuccess() {
        //open login form
        //  WebElement loginItem =wd.findElement(By.xpath("//*[text()=' Log in ']"));
        //  loginItem.click();
        click(By.xpath("//*[text()=' Log in ']"));
        //fill email
        type(By.cssSelector("#email"), "yanalanda@gmail.com");
        // WebElement emailInput = wd.findElement(By.cssSelector("#email"));
        //  emailInput.click();
        //  emailInput.clear();
        //emailInput.sendKeys("yanalanda@gmail.com");
        type(By.cssSelector("#password"), "Yana1234$");
        //  WebElement passwordInput2 = wd.findElement(By.cssSelector("#password"));
        //  passwordInput2.click();
        // passwordInput2.clear();
        // passwordInput2.sendKeys("Yana1234$");
        //click y'alla button
        click(By.xpath("//*[text()='Y’alla!']"));
        //   wd.findElement(By.xpath("//*[text()='Y’alla!']")).click();


    }
}