import org.openqa.selenium.By;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;  
public class First {  
  
    public static void main(String[] args) {  
        
    // declaration and instantiation of objects/variables  
    System.setProperty("webdriver.chrome.driver", "/Users/rrajagopalan/Downloads/chromedriver");  
    WebDriver driver=new ChromeDriver();  
      
// Launch website  
    driver.navigate().to("http://www.google.com/");  
          
    // Click on the search text box and send value  
    driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");  
          
    // Click on the search button  
    driver.findElement(By.name("btnK")).click();  
      
    }  
  
}  