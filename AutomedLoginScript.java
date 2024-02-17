import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatedLogin {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://example.com/login");

        // Find the username input field and enter the username
        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys("your_username");

        // Find the password input field and enter the password
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("your_password");

        // Find the login button and click it
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // Wait for the login process to complete (you may need to add explicit waits here)
        
        // Verify successful login - you can check for elements present on the dashboard or profile page
        if (driver.getCurrentUrl().equals("https://example.com/dashboard")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

        // Close the browser
        driver.quit();
    }
}
