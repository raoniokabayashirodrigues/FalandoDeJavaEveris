import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeuPrimeroTest {

    @Test
    public void validarTitulo(){
        //Localiza driver do Chromedriver
        System.setProperty("webdriver.chromedriver","C:\\cmder\\bin\\chromedriver.exe");
        //Cria o objeto ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        //Maximar Tela
        driver.manage().window().maximize();

        //Captura a url e abre o navegador
        driver.get("http://www.google.com.br");

        //Realiza a validação pelo título da página
        Assert.assertEquals("Google", driver.getTitle());

        //Fecha o navegador
        driver.quit();
    }
}
