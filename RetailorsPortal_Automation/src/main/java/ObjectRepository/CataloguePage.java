package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CataloguePage {

	WebDriver driver;
	   
	   public CataloguePage(WebDriver driver) {
		   this.driver = driver;
		   PageFactory.initElements(driver, this);
	   }
	      
		@FindBy(xpath="//ancestor::div[@class='v-input__control']/descendant::*[local-name()='svg']")
		private WebElement selectStoreIdDrpdwn;

		
		@FindBy(xpath="//div[contains(text(),'92793-Suma test store')]")
		private WebElement storeOption;

		public WebElement getStoreOption() {
		    return storeOption;
		}

		
		@FindBy(xpath="//span[.=' Add Product']")
		private WebElement addProductBtn;

		public WebElement getSelectStoreIdDrpdwn() {
			return selectStoreIdDrpdwn;
		}

		public WebElement getAddProductBtn() {
			return addProductBtn;
		}		
}
