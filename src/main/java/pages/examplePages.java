package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class examplePages {

    private WebDriver driver;

    // Localizadores
    private By searchBox = By.name("q");

    public examplePages(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.google.com");
    }

    public void searchFor(String text) {
        WebElement element = driver.findElement(searchBox);
        element.sendKeys(text);
        element.submit();
    }
}
