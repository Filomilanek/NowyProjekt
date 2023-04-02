import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

public class UltimateQATest extends PageSetUp {

    @Test
    public void testOne()
    {
        WebElement buttonUsingID;
        WebElement buttonSuccess;
        buttonUsingID = driver.findElement(By.id("idExample"));
        buttonUsingID.click();

        buttonSuccess = driver.findElement(By.className("entry-title"));
        Assertions.assertEquals( "Button success", buttonSuccess.getText());
    }

   @Test
     public void testTwo()
    {
        WebElement buttonUsingClassname;
        WebElement buttonSuccess;
        buttonUsingClassname = driver.findElement(By.className("buttonClass"));
        buttonUsingClassname.click();

        buttonSuccess = driver.findElement(By.className("entry-title"));
        Assertions.assertEquals( "Button success", buttonSuccess.getText());

    }

    @Test
    public void testThree()
    {
        WebElement buttonUsingName;
        WebElement buttonSuccess;
        buttonUsingName = driver.findElement(By.name("button1"));
        buttonUsingName.click();

        buttonSuccess = driver.findElement(By.className("entry-title"));
        Assertions.assertEquals( "Button success", buttonSuccess.getText());

    }

    @Test
    public void testFour() throws InterruptedException {
        WebElement nameInputID;
        WebElement nameInputemail;
        WebElement enter;
        WebElement buttonSuccess;

        nameInputID = driver.findElement(By.id("et_pb_contact_name_0"));
        nameInputID.sendKeys("Tester");

        nameInputemail = driver.findElement(By.id("et_pb_contact_email_0"));
        nameInputemail.sendKeys("tester@tester.pl");

        Thread.sleep(2000);

        enter = driver.findElement(By.name("et_builder_submit_button"));
        enter.click();

        Thread.sleep(2000);

        buttonSuccess = driver.findElement(By.id("et_pb_contact_form_0"));
        Assertions.assertEquals( "Thanks for contacting us", buttonSuccess.getText());
    }


}
