import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;  
public class web_command {
	 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/rrajagopalan/Downloads/chromedriver");  
    WebDriver driver=new ChromeDriver();  
    String URL = ("www.google.com");
    driver.get(URL);
    String title = driver.getTitle();  
    int titlelength =driver.getTitle().length();
    
    System.out.println("The Title of the page is " + title);
    System.out.println("The Lenght of the page is " + titlelength);
    String Actualurl = driver.getCurrentUrl();
    if  (Actualurl.contentEquals("www.google.com"))
    {
    	System.out.println("Verification Successful - The correct Url is opened.");
    }
    else 
    {
    	System.out.println("Verification not Successful - The incorrect Url is opened.");
    }
    String PageSource =driver.getPageSource();
    int PageSourceLength = PageSource.length();
    System.out.println("The Page Source is  " + PageSource);
    System.out.println("The Lenght of the page source  is " + PageSourceLength);
    driver.close();
}
}
