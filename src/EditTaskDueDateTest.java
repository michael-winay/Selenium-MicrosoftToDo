import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditTaskDueDateTest {
    private WebDriver driver;
    public void setUp() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("-inprivate");
        driver = new EdgeDriver(edgeOptions);
    }
    public void tearDown() {
        driver.quit();
    }
    public boolean editTaskDueDate() {
        driver.get("https://login.microsoftonline.com/common/oauth2/v2.0/authorize?client_id=3ff8e6ba-7dc3-4e9e-ba40-ee12b60d6d48&scope=openid%20profile%20email%20offline_access&redirect_uri=https%3A%2F%2Ftodo.microsoft.com%2Fauth%2Fcallback&client-request-id=9aaf9a1f-b934-4ac0-ab0d-889b53e8e66b&response_mode=fragment&response_type=code&x-client-SKU=msal.js.browser&x-client-VER=2.14.1&x-client-OS=&x-client-CPU=&client_info=1&code_challenge=udx_CgPIvudNfQlyyRvIqTzD3HyExtqcb6dDwsmtbb4&code_challenge_method=S256&prompt=select_account&nonce=bf4602e1-e523-49da-913b-4c74a715db14&state=eyJpZCI6Ijk5OGMyYWI1LThkODQtNGFmNS1hMDNhLWMwZDRiYjMwYzMxZSIsIm1ldGEiOnsiaW50ZXJhY3Rpb25UeXBlIjoicmVkaXJlY3QifX0%3D");
        driver.manage().window().setSize(new Dimension(1670, 881));
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='email']")));
        }
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("junkemail00684@gmail.com");
        driver.findElement(By.id("idSIButton9")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='password']")));
        }
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Ma*6KGFpbw^@");
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
        }
        driver.findElement(By.id("idSIButton9")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.id("idBtn_Back")));
        }
        driver.findElement(By.id("idBtn_Back")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.id("newSessionLink")));
        }
        driver.findElement(By.id("newSessionLink")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Tasks'])[1]")));
        }
        driver.findElement(By.xpath("(//span[text()='Tasks'])[1]")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[aria-label='Add a task']")));
        }
        driver.findElement(By.cssSelector("button[aria-label='Add a task']")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#baseAddInput-addTask")));
        }
        driver.findElement(By.cssSelector("#baseAddInput-addTask")).sendKeys("Test");
        driver.findElement(By.id("baseAddInput-addTask")).sendKeys(Keys.ENTER);
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.taskItem-titleWrapper")));
        }
        driver.findElement(By.cssSelector("button.taskItem-titleWrapper")).click();
        driver.findElement(By.xpath("//span[text()='Add due date']")).click();
        driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Tomorrow'])[2]")));
        }
        driver.findElement(By.xpath("(//span[text()='Tomorrow'])[2]")).click();
        driver.findElement(By.xpath("//span[text()='Next week']")).click();

        return true;
    }
}
