package Netmeds_PageClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Netmeds_Testbase.Netmeds_Testbase;

public class Filters_Page extends Netmeds_Testbase{
	public ExtentTest test;
	public ExtentReports extent;
	
	public void x() {
		extent=new ExtentReports("C:\\Users\\gukaur\\.jenkins\\workspace\\Filters\\TestExecutionReport_Filters.html",true);	
	}

	public void y() {
		extent.endTest(test);
		extent.flush();
	}
	
		//Constructor
		public Filters_Page() {
			PageFactory.initElements(driver, this);
		}
		
		//SEARCH 
		@FindBy(xpath="//input[@id='search']")
		WebElement search;
		
		//Filters
		@FindBy(xpath="//div[@class='filter']")
		WebElement filters;
		
		//Brands
		@FindBy(xpath="//h2[text()='Brands']")
		WebElement brands;
		
		//Allen Brand
		@FindBy(xpath="//input[@value='Allen']")
		WebElement allen;
		
		//Refinements
		@FindBy(xpath="//span[@id='current_refinements']")
		WebElement refinements;
		
		//Manufacturers 
		@FindBy(xpath="//h2[text()='Manufacturers']")
		WebElement manufacturer;
		
		//Manufacturers filter
		@FindBy(xpath="//input[@value='Allen Homoeo & Herbal Products Ltd']")
		WebElement manufacturerfilter;
		
		//Categories 
		@FindBy(xpath="//h2[text()='Manufacturers']")
		WebElement categories;
				
		//Category filter
		@FindBy(xpath="//input[@value='Non-Prescription']")
		WebElement categoryfilter;
		
		//Price
		@FindBy(xpath="//h2[text()='Price']")
		WebElement price;
		
		//Price Slider
		@FindBy(xpath="//div[@class='ais-RangeSlider']")
		WebElement priceSlider;
		
		//Discount
		@FindBy(xpath="//h2[text()='Discount']")
		WebElement discount;
		
		//Discount Slider
		@FindBy(xpath="//div[@id='alg_discount_filter']")
		WebElement discountSlider;
		//---------------------------------------------------------------------------------------------------
		//Methods
		public void searchProduct() {
			search.sendKeys(prop.getProperty("Product"));
			search.sendKeys(Keys.ENTER);
			
			filters.isDisplayed();
			
			test=extent.startTest("Verify Whether Filters are displayed after searching the product Successfully");
			test.log(LogStatus.INFO, "Netmeds page test is intiated");
			test.log(LogStatus.INFO,"Verify Netmeds Page Loads Successfully");
			
			String actual=driver.getCurrentUrl();
			String expected="https://www.netmeds.com/catalogsearch/result/plum/all";
			if(actual.equals(expected)) {
				test.log(LogStatus.PASS, "Filters are displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Filters are not displayed");
			}
			Assert.assertEquals(actual, expected);
		}
		
		public void selectBrand() {
			brands.isDisplayed();
			
			allen.click();
			
			test=extent.startTest("Verify Whether Brand can be selected from the filters Successfully");
			test.log(LogStatus.INFO, "Netmeds page test is intiated");
			test.log(LogStatus.INFO,"Verify Netmeds Page Loads Successfully");
			
			String actual=driver.getCurrentUrl();
			String expected="https://www.netmeds.com/catalogsearch/result/plum/all";
			if(actual.equals(expected)) {
				test.log(LogStatus.PASS, "Brand is selected");
			}
			else {
				test.log(LogStatus.FAIL, "Brand is not selected");
			}
			Assert.assertEquals(actual, expected);
		}
		
		public void selManufacturers() {
			manufacturer.isDisplayed();
			
			manufacturerfilter.click();
			
			test=extent.startTest("Verify Whether Manufacturer can be selected from the filters Successfully");
			test.log(LogStatus.INFO, "Netmeds page test is intiated");
			test.log(LogStatus.INFO,"Verify Netmeds Page Loads Successfully");
			
			String actual=driver.getCurrentUrl();
			String expected="https://www.netmeds.com/catalogsearch/result/plum/all";
			if(actual.equals(expected)) {
				test.log(LogStatus.PASS, "Manufacturer is selected");
			}
			else {
				test.log(LogStatus.FAIL, "Manufacturer is not selected");
			}
			Assert.assertEquals(actual, expected);
		}
		
		public void selCategory() {
			categories.isDisplayed();
			
			categoryfilter.click();
			
			System.out.println(refinements.getText());
			
			test=extent.startTest("Verify Whether Category can be selected from the filters Successfully");
			test.log(LogStatus.INFO, "Netmeds page test is intiated");
			test.log(LogStatus.INFO,"Verify Netmeds Page Loads Successfully");
			
			String actual=driver.getCurrentUrl();
			String expected="https://www.netmeds.com/catalogsearch/result/plum/all";
			if(actual.equals(expected)) {
				test.log(LogStatus.PASS, "Category is selected");
			}
			else {
				test.log(LogStatus.FAIL, "Category is not selected");
			}
			Assert.assertEquals(actual, expected);
		}
		
		public void adjustPrice() {
			price.isDisplayed();
			
			Actions act = new Actions(driver);
			act.moveToElement(priceSlider).dragAndDropBy(priceSlider, 200, 0).build().perform();
			
			test=extent.startTest("Verify Whether Price is adjusted from the filters Successfully");
			test.log(LogStatus.INFO, "Netmeds page test is intiated");
			test.log(LogStatus.INFO,"Verify Netmeds Page Loads Successfully");
			
			String actual=driver.getTitle();
			String expected="Search Results – Netmeds.com";
			if(actual.equals(expected)) {
				test.log(LogStatus.PASS, "Price is adjusted");
			}
			else {
				test.log(LogStatus.FAIL, "Price is not adjusted");
			}
			Assert.assertEquals(actual, expected);
		}
		
		public void adjustDiscount() {
			discount.isDisplayed();
			
			Actions act = new Actions(driver);
			act.moveToElement(discountSlider).dragAndDropBy(discountSlider, 10, 10).build().perform();
		}
}
