//package StepDefinitions;
//
//import PageFactory.HomePage_PF;
//import PageFactory.LoginPage_PF;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import pages.LoginPage;
//
//import java.util.concurrent.TimeUnit;
//
//public class LoginDemoSteps_PF {
//
//    WebDriver driver = null;
//
//    private LoginPage_PF loginPage;
//
//    private HomePage_PF homePage;
//
//    @Given("trinh duyet duoc mo")
//    public void trinh_duyet_duoc_mo() {
//
//        System.out.println("I am inside LoginDemoSteps_PF");
//
//        System.out.println("trinh duyet duoc mo");
//
//        String projectPath = System.getProperty("user.dir");
//
//        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
//
//        driver = new ChromeDriver();
//
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//
//        driver.manage().window().maximize();
//
//    }
//
//    @Given("user dang o trang login")
//    public void user_dang_o_trang_login() {
//
//        System.out.println("user dang o trang login");
//
//        driver.navigate().to("https://example.testproject.io/web/");
//
//    }
//
//    @When("^user nhap (.*) va (.*)$")
//    public void user_nhap_username_va_password(String username, String password) throws InterruptedException {
//
//        System.out.printf("user nhap ten dang nhap va mat khau");
//
//        loginPage = new LoginPage_PF(driver);
//
//        loginPage.enterUsername(username);
//        loginPage.enterPassword(password);
//
//        Thread.sleep(2000);
//
//    }
//
//    @When("user click vao nut dang nhap")
//    public void user_click_vao_nut_dang_nhap() throws InterruptedException {
//
//        loginPage.clickLogin();
//        Thread.sleep(2000);
//    }
//
//    @Then("user den trang chu")
//    public void user_den_trang_chu() throws InterruptedException {
//
//        homePage.checkLogOutIsDisplayed();
//        Thread.sleep(2000);
//
//        driver.close();
//        driver.quit();
//    }
//
//}
