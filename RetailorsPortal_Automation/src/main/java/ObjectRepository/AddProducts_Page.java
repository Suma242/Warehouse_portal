package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebDriverUtility.WebDriverUtility;

public class AddProducts_Page {

	WebDriver driver;

	WebDriverUtility wu = new WebDriverUtility();

	public AddProducts_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='input-188']")
	private WebElement barcodeTxtBox;

	@FindBy(xpath = "//input[@id='input-224']")
	private WebElement mrpTxtBox;

	@FindBy(xpath = "//input[@id='input-190']")
	private WebElement productNameTxtBox;

	@FindBy(xpath = "//input[@id='input-226']")
	private WebElement purchasePriceTxtBox;

	@FindBy(xpath = "//input[@id='input-192']")
	private WebElement uomDropDown;

	@FindBy(xpath = "//input[@id='input-228']")
	private WebElement SP1TxtBox;

	@FindBy(xpath = "//input[@id='input-195']")
	private WebElement qtyTxtBox;

	@FindBy(xpath = "//input[@id='input-197']")
	private WebElement gstDropDown;

	@FindBy(xpath = "//input[@id='input-200']")
	private WebElement categoryDropDown;

	@FindBy(xpath = "//input[@id='input-234']")
	private WebElement subCatDropDown;

	@FindBy(xpath = "//span[text()='Add ']")
	private WebElement addBtn;

	@FindBy(xpath = "//span[text()='Cancel ']")
	private WebElement cancelBtn;

	public WebElement getBarcodeTxtBox() {
		return barcodeTxtBox;
	}

	public WebElement getMrpTxtBox() {
		return mrpTxtBox;
	}

	public WebElement getProductNameTxtBox() {
		return productNameTxtBox;
	}

	public WebElement getPurchasePriceTxtBox() {
		return purchasePriceTxtBox;
	}

	public WebElement getUomDropDown() {
		return uomDropDown;
	}

	public WebElement getSP1TxtBox() {
		return SP1TxtBox;
	}

	public WebElement getQtyTxtBox() {
		return qtyTxtBox;
	}

	public WebElement getGstDropDown() {
		return gstDropDown;
	}

	public WebElement getCategoryDropDown() {
		return categoryDropDown;
	}

	public WebElement getSubCatDropDown() {
		return subCatDropDown;
	}

	public WebElement getAddBtn() {
		return addBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	// Action
	public void addProduct(String barcode, String mrp, String prodName, String purPrice, String uom, String SP1,
			String qty, String gst, String catogory, String subCat) {
		getBarcodeTxtBox().clear();
		getBarcodeTxtBox().sendKeys(barcode);

		getMrpTxtBox().clear();
		getMrpTxtBox().sendKeys(mrp);

		getProductNameTxtBox().clear();
		getProductNameTxtBox().sendKeys(prodName);

		getPurchasePriceTxtBox().clear();
		getPurchasePriceTxtBox().sendKeys(purPrice);

		wu.dropdown(getUomDropDown());
		getUomDropDown().clear();
		getUomDropDown().sendKeys(uom);

		getSP1TxtBox().clear();
		getSP1TxtBox().sendKeys(SP1);

		getQtyTxtBox().clear();
		getQtyTxtBox().sendKeys(qty);

		wu.dropdown(getGstDropDown());
		getGstDropDown().clear();
		getGstDropDown().sendKeys(uom);

		wu.dropdown(getCategoryDropDown());
		getCategoryDropDown().clear();
		getCategoryDropDown().sendKeys(catogory);

		wu.dropdown(getSubCatDropDown());
		getSubCatDropDown().clear();
		getSubCatDropDown().sendKeys(subCat);

		getAddBtn().click();

	}

}
