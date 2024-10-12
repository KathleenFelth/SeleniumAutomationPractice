import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutoTest {

    WebDriver driver;

    WebDriverWait wait;
    Duration timeout = Duration.ofSeconds(50);

        @BeforeMethod
                public void setup(){

            WebDriverManager.chromedriver().driverVersion("126.0.6478.126 ").setup();


            driver = new ChromeDriver();
            Duration timeout = Duration.ofSeconds(10);
            wait = new WebDriverWait(driver, timeout);
        }


          @Test
                public void Interaction(){

              driver.get("https://testautomationpractice.blogspot.com/");

              WebElement textbox1 = driver.findElement(By.id("name"));
              textbox1.sendKeys("Kathleen");

              WebElement textbox2 = driver.findElement(By.id("email"));
              textbox2.sendKeys("Kathy@gmail.com");

              WebElement textbox3 = driver.findElement(By.id("phone"));
              textbox3.sendKeys("0763749885");

              WebElement textbox4 = driver.findElement(By.id("textarea"));
              textbox4.sendKeys("elms road, Stanford");

              WebElement radio1 = driver.findElement(By.id("female"));
              radio1.click();


              WebElement checkbox1 = driver.findElement(By.id("sunday"));
              checkbox1.click();

              WebElement checkbox2 = driver.findElement(By.id("monday"));
              checkbox2.click();

              WebElement checkbox3 = driver.findElement(By.id("friday"));
              checkbox3.click();

              WebElement checkbox4 = driver.findElement(By.id("thursday"));
              checkbox4.click();


              WebElement dropdown = driver.findElement(By.id("country"));

              Select select = new Select(dropdown);
              select.selectByValue("japan");


              WebElement testBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("colors")));
              Select colorSelect = new Select(testBox);

              // Iterate through the options and select "white"
              for (WebElement option : colorSelect.getOptions()) {
                  if (option.getText().equalsIgnoreCase("white")) {
                      option.click();
                      break;

                  }}

              WebElement datepickersel1 = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
              datepickersel1.click();
              WebElement datepicker1 = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[3]"));
              datepicker1.click();

              WebElement datepickersel2 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/p[2]/input"));
              datepickersel2.click();
              WebElement datepicker2 = driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr[3]/td[5]/a"));
              datepicker2.click();


              WebElement bookname = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[2]/div[1]/table/tbody/tr[5]/td[1]")));
              String name = bookname.getText();

              WebElement bookauthor = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[2]/div[1]/table/tbody/tr[5]/td[2]")));
              String book = bookauthor.getText();

              WebElement booksubject = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[2]/div[1]/table/tbody/tr[5]/td[3]")));
              String subject = booksubject.getText();

              WebElement bookprice = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[2]/div[1]/table/tbody/tr[5]/td[4]")));
              String price = bookprice.getText();


              System.out.println("The book's details are as follows; " + name + "," + book + "," + subject + "," + price );

              WebElement dynamicTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("taskTable")));
              List<WebElement> rows = dynamicTab.findElements(By.tagName("tr"));

              for (WebElement row : rows){
                  List<WebElement> cells = row.findElements(By.tagName("td"));
                  for (WebElement cell : cells){
                      System.out.println(cell.getText());
                  }
              }

              WebElement checkbox5 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[4]/div[1]/div/table/tbody/tr[1]/td[4]/input")));
              checkbox5.click();

              WebElement checkbox6 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[4]/div[1]/div/table/tbody/tr[4]/td[4]/input")));
              checkbox6.click();

              WebElement pagebutton = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[4]/div[1]/div/ul/li[3]/a"));
              pagebutton.click();

              WebElement checkbox7 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[4]/div[1]/div/table/tbody/tr[3]/td[4]/input"));
              checkbox7.click();

              WebElement pagebutton1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[4]/div[1]/div/ul/li[4]/a")));
              pagebutton1.click();

              WebElement checkbox8 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[4]/div[1]/div/table/tbody/tr[4]/td[4]/input"));
              checkbox8.click();


              WebElement paragraph = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/footer/div/div[2]/div[2]/table/tbody/tr/td[1]/div/div/div[1]/div/div[1]/input")));
              paragraph.sendKeys("This is a paragraph in Section 1");

              WebElement parabutton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/footer/div/div[2]/div[2]/table/tbody/tr/td[1]/div/div/div[1]/div/div[1]/button")));
              parabutton.click();

              WebElement paragraph2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/footer/div/div[2]/div[2]/table/tbody/tr/td[1]/div/div/div[1]/div/div[2]/input")));
              paragraph2.sendKeys("This is a paragraph in Section 2");

              WebElement parabutton2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/footer/div/div[2]/div[2]/table/tbody/tr/td[1]/div/div/div[1]/div/div[1]/button")));
              parabutton2.click();

              WebElement paragraph3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/footer/div/div[2]/div[2]/table/tbody/tr/td[1]/div/div/div[1]/div/div[3]/input")));
              paragraph3.sendKeys("This is a paragraph in Section 3");

              WebElement parabutton3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/footer/div/div[2]/div[2]/table/tbody/tr/td[1]/div/div/div[1]/div/div[3]/button")));
              parabutton3.click();

              WebElement search = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[1]/div[1]/form/div/span[2]/span[1]/input")));
              search.sendKeys("Dogs");

              WebElement searchbutton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[1]/div[1]/form/div/span[2]/span[2]/input")));
              searchbutton.click();

              WebElement result = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[1]/div[1]/div[2]/div[2]/a")));
              result.click();

              String originalTab = driver.getWindowHandle();

              Set<String> windowHandles = driver.getWindowHandles();
              List<String> windowList = new ArrayList<>(windowHandles);

              for (String window : windowList) {
                  if (!window.equals(originalTab)) {
                      // Switch to the new tab
                      driver.switchTo().window(window);

                      WebElement note = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/div[3]/main/div[3]/div[3]/div[1]/p[2]")));
                      String notes = note.getText();

                      System.out.println(notes);
                      break; // Exit the loop
                  }
              }

              driver.switchTo().window(originalTab);

              WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[2]/div[1]/button")));
              button.click();


              WebElement alertbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[4]/div[1]/button[1]")));
              alertbutton.click();

              Alert alert = wait.until(ExpectedConditions.alertIsPresent());
              alert.accept();

              WebElement alrtconfirm = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[4]/div[1]/button[2]")));
              alrtconfirm.click();

              Alert alert1 = wait.until(ExpectedConditions.alertIsPresent());
              alert1.dismiss();

              WebElement prompt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[4]/div[1]/button[3]")));
              prompt.click();

              Alert promtalert = wait.until(ExpectedConditions.alertIsPresent());
              promtalert.sendKeys("Harry Davis");
              promtalert.accept();

              WebElement popup = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[5]/div[1]/div/div/button")));
              popup.click();

              Set<String> allWindows = driver.getWindowHandles();

              for (String windowHandle : allWindows) {
                  if (!windowHandle.equals(originalTab)) {

                      driver.switchTo().window(windowHandle);

                      driver.close();

                  }
              }


              driver.switchTo().window(originalTab);

              WebElement doubclick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[6]/div[1]/button")));

              Actions doub = new Actions(driver);
              doub.doubleClick(doubclick).perform();

              WebElement draggable = wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
              WebElement droppable = wait.until(ExpectedConditions.elementToBeClickable(By.id("droppable")));
              Actions drag = new Actions(driver);
              drag.dragAndDrop(draggable, droppable).perform();

              WebElement slider = wait.until(ExpectedConditions.elementToBeClickable((By.id("slider"))));
              Actions slide = new Actions(driver);
              slide.dragAndDropBy(slider, 67, 0).perform();

              WebElement resize = wait.until(ExpectedConditions.elementToBeClickable((By.id("resizable"))));
              Actions re = new Actions(driver);
              re.dragAndDropBy(resize, 80,30).perform();

          }

    @AfterMethod
    public void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }




}



