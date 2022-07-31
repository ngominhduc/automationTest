package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps {

    WebDriver driver = null;

    @Given("trinh duyet duoc mo")
    public void trinh_duyet_duoc_mo() {

        System.out.println("trinh duyet duoc mo");
        String projectPath = System.getProperty("user.dir");

        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        driver.manage().window().maximize();

    }

    @Given("user dang o trang login")
    public void user_dang_o_trang_login() {

        System.out.println("user dang o trang login");

        driver.navigate().to("https://example.testproject.io/web/");

    }

    @When("^user nhap (.*) va (.*)$")
    public void user_nhap_username_va_password(String username, String password) throws InterruptedException {

        System.out.printf("user nhap ten dang nhap va mat khau");
        driver.findElement(By.id("name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(2000);

    }

    @When("user click vao nut dang nhap")
    public void user_click_vao_nut_dang_nhap() throws InterruptedException {

        driver.findElement(By.id("login")).click();
        Thread.sleep(2000);
    }

    @Then("user den trang chu")
    public void user_den_trang_chu() {

        driver.findElement(By.id("logout")).isDisplayed();

        driver.close();
        driver.quit();
    }

}
