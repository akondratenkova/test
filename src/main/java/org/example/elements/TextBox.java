package org.example.elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
    WebDriver driver = new ChromeDriver();

    WebElement userName = driver.findElement(By.id("userName"));
    WebElement userEmail = driver.findElement(By.id("userEmail"));
    WebElement currentAddress = driver.findElement(By.id("currentAddress"));
    WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
    WebElement butSubmit = driver.findElement(By.xpath("//button[text()='Submit']"));

    public void filling(String name, String email, String cAddress, String pAddress){
        userName.sendKeys(name);
        userEmail.sendKeys(email);
        currentAddress.sendKeys(cAddress);
        permanentAddress.sendKeys(pAddress);
        butSubmit.click();

    }
}
