package Keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeysTests extends BaseTests {
    @Test
    public void testBackSpace(){
        var keyPage=homePage.clickKeyPresses();
        keyPage.enterText("A"+ Keys.BACK_SPACE);
        assertEquals(keyPage.getText(),"You entered: BACK_SPACE");
    }
    @Test
    public void testPi(){
        var keyPage=homePage.clickKeyPresses();
        keyPage.enterPi();
    }



}
