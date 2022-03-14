package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    @Test
    public void loginSuccess() {
//open login form
        WebElement loginItem =wd.findElement(By.xpath("//*[text()=' Log in ']"));
        loginItem.click();
        //fill email
        WebElement emailInput = wd.findElement(By.cssSelector("#email"));
        emailInput.click();
        emailInput.clear();
       emailInput.sendKeys("yanalanda@gmail.com");

        WebElement passwordInput2 = wd.findElement(By.cssSelector("#password"));
        passwordInput2.click();
        passwordInput2.clear();
        passwordInput2.sendKeys("Yana1234$");
        //click y'alla button
        wd.findElement(By.xpath("//*[text()='Y’alla!']")).click();
        Assert.assertTrue(wd.findElements(By.xpath("//*[text()='Y’alla!']")).size() > 0);


    }
}