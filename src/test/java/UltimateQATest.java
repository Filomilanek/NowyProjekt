import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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


}
