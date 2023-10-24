package Tests;

import Base.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TextBoxTest extends BaseTest {
    String fullname = "Tamara";
    String email = "tamara.devet@gmail.com";
    String permanentAddress = "Address Knez Mihajlova";
    String currentAddress = "Address Knez Mihajlova";

    @BeforeEach
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void userCanSubmitTextBox() {
        homePage.clickOnElementsCard();
        //homePage.clickOnCard("Elements");
        sidebarPage.clickOnSidebarButton("Text Box");
        textboxPage.inputFullname(fullname);
        textboxPage.inputEmail(email);
        textboxPage.inputPermanentAddress(permanentAddress);
        textboxPage.inputCurrentAddress(currentAddress);
        textboxPage.clickOnSubmit();

        /*assertTrue(textboxPage.getResultName().isDisplayed());
        assertTrue(textboxPage.getResultEmail().isDisplayed());
        assertTrue(textboxPage.getResultCurrentAddress().isDisplayed());
        assertTrue(textboxPage.getResultPermanentAddress().isDisplayed());*/

        assertTrue(textboxPage.getOutput().isDisplayed());
        assertEquals(textboxPage.outputText(), "Name:"+fullname+"\n" +
                "Email:"+email+"\n" +
                "Current Address :"+currentAddress+"\n" +
                "Permananet Address :"+permanentAddress);
    }
}
