import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TelaCadastro {

    @Test
    public void deveRealizarCadastro(){
        //Localiza driver do Chromedriver
        System.setProperty("webdriver.chromedriver","C:\\cmder\\bin\\chromedriver.exe");
        //Cria o objeto ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        //Maximar Tela
        driver.manage().window().maximize();
        //Abre URL do projeto
        driver.get("file:\\" +  System.getProperty("user.dir") +"\\src\\main\\resources\\componentes.html");

        //Escrever nome
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Curso Everis");
        Assert.assertEquals("Curso Everis", "Curso Everis");

        //Botão Radio
        driver.findElement(By.id("elementosForm:sexo:1")).click();
        Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:1")).isSelected());


        //Combo Box Select Escolaridade
        WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
        //Criei um objeto do combo box Escolaridade
        Select combo = new Select(element);
//        combo.selectByIndex((1));
//        combo.selectByValue("doutorado");
//        combo.selectByVisibleText("2o grau incompleto");
        Assert.assertEquals("1o grau completo", combo.getFirstSelectedOption().getText());
    }
}
