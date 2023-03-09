package automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice_01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        1. Launch browser

//        2. Navigate to url 'http://automationexercise.com'

//        3. Verify that home page is visible successfully

//        4. Click on 'Signup / Login' button

//        5. Verify 'New User Signup!' is visible

//        6. Enter name and email address

//        7. Click 'Signup' button
//        8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
//        9. Fill details: Title, Name, Email, Password, Date of birth
//        10. Select checkbox 'Sign up for our newsletter!'
//        11. Select checkbox 'Receive special offers from our partners!'
//        12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//        13. Click 'Create Account button'
//        14. Verify that 'ACCOUNT CREATED!' is visible

    }
}
