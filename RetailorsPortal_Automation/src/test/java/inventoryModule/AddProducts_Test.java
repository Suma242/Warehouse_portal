package inventoryModule;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import ObjectRepository.AddProducts_Page;
import ObjectRepository.CataloguePage;
import ObjectRepository.HomePage;
import ObjectRepository.InventoryMenu_Page;
import WebDriverUtility.WebDriverUtility;

public class AddProducts_Test extends BaseClass{
	
	WebDriverUtility wu= new WebDriverUtility();
	
		@Test
		public void addproducts() throws Throwable {
			wu.waitForPageLoad(driver);
			
			// Step 1: Navigate to Inventory
			HomePage hp = new HomePage(driver);
			hp.getInventoryDrpdwn().click();
			
			// Step 2: Click on Catalogue module
			InventoryMenu_Page ip = new InventoryMenu_Page(driver);
			ip.getCatalogueMdl().click();
			
			// Step 3: Click dropdown and select store
			CataloguePage cp = new CataloguePage(driver);
			wu.waitForElementtobeClickable(driver, cp.getSelectStoreIdDrpdwn());
			cp.getSelectStoreIdDrpdwn().click();
			
			wu.waitForElementPresent(driver, cp.getStoreOption());
			cp.getStoreOption().click();
			
			//Step 4: Add products
			AddProducts_Page ap= new AddProducts_Page(driver);
			
			

		
	}


}
