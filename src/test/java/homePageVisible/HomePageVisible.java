package homePageVisible;

import base.baseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class HomePageVisible extends baseTests {
    @Test
    public void HomepageVisibleSuccessfully(){
        assertEquals(driver.getTitle(),"Automation Exercise","Home page is not visible");
    }


}
