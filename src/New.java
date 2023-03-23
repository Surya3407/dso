import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class New {
    
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Chrome\\Chromedriver.exe");

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.youtube.com/");
        
    }
}
