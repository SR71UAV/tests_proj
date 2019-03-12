package ru.danielDefo;

import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class FirstTest {
    ChromeDriver driver;

   @Before
   public void before_test(){
       System.setProperty("webdriver.chrome.driver", "/test/chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       System.out.println("test started");
   }

    @After
    public void after_test() {
        driver.close();
        System.out.println("test ended");
    }


    @Test
    public void test_number_1() {
        driver.get("https://danieldefo.ru");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("MALADEC IGORYAN"));
    }

    @Test
    public void test_number_2() {
        driver.get("https://danieldefo.ru");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("MALADEC IGORYAN"));
    }

}
