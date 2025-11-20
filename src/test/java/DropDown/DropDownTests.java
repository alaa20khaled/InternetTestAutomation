package DropDown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTests {
    @Test
    public void testSelectedOption(){
        var dropDownPage= homePage.clickDropDownButton();
        String option="Option 1";
        dropDownPage.selectOption(option);
        var selectedOptions=dropDownPage.getSelectedOption();
        assertEquals(selectedOptions.size(),1,"Incorrect number of selection options");
        assertTrue(selectedOptions.contains(option),"option not selected");
    }

}
