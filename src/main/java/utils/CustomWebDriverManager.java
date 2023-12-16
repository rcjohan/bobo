package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWebDriverManager  {

    public static WebDriver setupChromeDriver() {
        // Configurar WebDriverManager para Chrome
        WebDriverManager.chromedriver().setup();

        // Crear y retornar la instancia del WebDriver
        return new ChromeDriver();
    }
}
