import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMain {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RVasilev\\Desktop\\AutoTest Tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://192.168.7.54/test");
    }
}