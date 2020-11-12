package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class MainPage {
	
public  MainPage() {
		
		PageFactory.initElements(Driver.getDriver(), this); 
		 
	}
	
        
        
        
        @FindBy (id = "run-button")
        public WebElement runButton;
        
        @FindBy (xpath = "//div[@id='output']")
        public WebElement outputText;
        
        @FindBy (xpath = "//button[@id='Share']")
        public WebElement shareButton;
        
        @FindBy (xpath = "//input[@id='ShareLink']")
        public WebElement shareFieldInput;  
        

}
