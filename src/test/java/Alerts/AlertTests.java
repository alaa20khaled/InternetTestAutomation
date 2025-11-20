package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertPage=homePage.clickJavaScriptAlert();
        alertPage.triggerAlert();
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResults(),
                "You successfully clicked an alert","result text incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertPage= homePage.clickJavaScriptAlert();
        alertPage.triggerConfirm();
        String text= alertPage.alert_getText();
        alertPage.alert_clickToDismiss();
        assertEquals(text,"I am a JS Confirm","Alert incorrect");

    }
    @Test
    public void testSetInputInAlert(){
        var alertPage=homePage.clickJavaScriptAlert();
        alertPage.triggerPrompt();
        String text ="hello everybody";
        alertPage.setInput(text);
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResults(),"You entered: "+text,"Results text incorrect");
    }
}
