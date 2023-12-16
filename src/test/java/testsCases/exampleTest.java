package testsCases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;

public class exampleTest {

    @Test
    public void testGoogleSearch() {
        // Configurar WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Crear instancia del WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navegar a Google
            driver.get("https://www.google.com");

            // Ingresar "hola mundo" en el buscador y enviar la búsqueda
            driver.findElement(By.name("q")).sendKeys("hola mundo");
            driver.findElement(By.name("q")).submit();

            // Espera opcional para visualizar el resultado
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Cerrar el navegador
            driver.quit();
        }
    }
}
