package Netmeds_PageClass;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Netmeds_Testbase.Netmeds_Testbase;

public class Beauty_Page extends Netmeds_Testbase{

	public ExtentTest test;
	public ExtentReports extent;
	
	public void x() {
		extent=new ExtentReports("C:\\Users\\gukaur\\.jenkins\\workspace\\Beauty\\TestExecutionReport_Beauty.html",true);	
	}

	public void y() {
		extent.endTest(test);
		extent.flush();
	}
	
	//Constructor
	public Beauty_Page() {
		PageFactory.initElements(driver, this);
	}
	//Locators
	//Beauty AD
	@FindBy(xpath="//section[@class='beauty-main-banner']")
	WebElement BeautyAd;
	//-----------------------------------------------------------
	//Beauty
	@FindBy(xpath="//span[text()='Beauty']")
	WebElement Beauty;
	
	//in the spotlight
	@FindBy(xpath="//section[@id='in_the_spotlight']")
	WebElement in_the_spotlight;
	
	//INS banner
	@FindBy(xpath="//img[@class='banner_img swiper-lazy']")
	WebElement inTheSpotlightBanner;
	//-------------------------------------------------------------
	//Featured brands
	@FindBy(xpath="//section[@id='featured_brands']")
	WebElement Featured_brands;
	
	//Maybelline
	@FindBy(xpath="//img[@alt='maybelline']")
	WebElement Maybelline;
	
	//Garnier
	@FindBy(xpath="//img[@alt='garnier']")
	WebElement Garnier;
	
	//Myglamm
	@FindBy(xpath="//img[@alt='myglamm']")
	WebElement Myglamm;
	
	//Colorbar
	@FindBy(xpath="//img[@alt='colorbar']")
	WebElement Colorbar;
	
	//Plum
	@FindBy(xpath="//img[@alt='plum']")
	WebElement Plum;
	//------------------------------------------
	//Top Offers on Brands
	@FindBy(xpath="//section[@class='top_offers_on_brands']")
	WebElement topoffersONbrands;
	
	//First offer
	@FindBy(xpath="(//img[@class='banner_img'])[6]")
	WebElement Offer1;
	
	//Second Offer
	@FindBy(xpath="(//img[@class='banner_img'])[7]")
	WebElement Offer2;
	
	//Third Offer
	@FindBy(xpath="(//img[@class='banner_img'])[8]")
	WebElement Offer3;
	//------------------------------------------------
	//Shop by Category
	@FindBy(xpath="//section[@id='shop_by_category_151']")
	WebElement ShopbyCategory;
	
	//Face Wash & Cleansers
	@FindBy(xpath="(//img[@alt='Face Wash & Cleansers'])[1]")
	WebElement FaceWash;
	
	//Body care
	@FindBy(xpath="//img[@alt='Body Care']")
	WebElement BodyCare;
	
	//Nail Care
	@FindBy(xpath="//img[@alt='Nail Care']")
	WebElement NailCare;
	
	//Skin care
	@FindBy(xpath="//img[@alt='Skin Care']")
	WebElement SkinCare;
	
	//Hair Care
	@FindBy(xpath="//img[@alt='Hair Care']")
	WebElement HairCare;
	//---------------------------------------------
	//Skin Care Essentials
	@FindBy(xpath="//section[@id='shop_by_category_152']")
	WebElement SkinCareEssentials;
	
	//Face Wash & Cleansers
	@FindBy(xpath="(//img[@alt='Face Wash & Cleansers'])[2]")
	WebElement FaceWash2;
	
	//Facial kits
	@FindBy(xpath="//img[@alt='Facial Kits']")
	WebElement FacialKits;
	
	//Face Skin Care
	@FindBy(xpath="//img[@alt='Face Skin Care']")
	WebElement FaceSkinCare;
	
	//Make-up
	@FindBy(xpath="//img[@alt='Make-Up']")
	WebElement MakeUp;
	
	//Day Creme
	@FindBy(xpath="//img[@alt='Day Cream']")
	WebElement DayCreme;
	//------------------------------------------------
	//Hair Care Essentials
	@FindBy(xpath="//section[@id='shop_by_category_153']")
	WebElement HaircareEssentials;
	
	//Hair oils
	@FindBy(xpath="//img[@alt='Hair Oils']")
	WebElement HairOils;
	
	//Hair Treatment
	@FindBy(xpath="//img[@alt='Hair Treatment']")
	WebElement HairTreatment;
	
	//Hair Gels & Waxes
	@FindBy(xpath="(//img[@alt='Hair Gels & Waxes'])[1]")
	WebElement HairGels;
	
	//Hair Perms & Texturizers
	@FindBy(xpath="//img[@alt='Hair Perms & Texturizers']")
	WebElement HairPerms;
	
	//Hair Sprays & Mists
	@FindBy(xpath="//img[@alt='Hair Sprays & Mists']")
	WebElement HairSprays;
	//-----------------------------------------------------------
	//Men's Grooming
	@FindBy(xpath="//section[@id='shop_by_category_154']")
	WebElement MensGrooming;
	
	//Shaving
	@FindBy(xpath="//img[@alt='Shaving']")
	WebElement Shaving;
	
	//Razors & Cartridges
	@FindBy(xpath="//img[@alt='Razors & Cartridges']")
	WebElement Razors;
	
	//Beard Oil
	@FindBy(xpath="//img[@alt='Beard Oil']")
	WebElement BeardOil;
	
	//Beard Wash
	@FindBy(xpath="//img[@alt='Beard Wash']")
	WebElement BeardWash;
	
	//Hair Gels & Waxes
	@FindBy(xpath="(//img[@alt='Hair Gels & Waxes'])[2]")
	WebElement HairGels2;
	//-------------------------------------------------------
	//The Latest in Beauty
	@FindBy(xpath="//div[@class='home-health-library']")
	WebElement TheLatestInBeauty;
	
	//Latest 1
	@FindBy(xpath="(//div[@class='post-ftimg-hld'])[1]")
	WebElement LatestProduct1;
	
	//Latest 2
	@FindBy(xpath="(//div[@class='post-ftimg-hld'])[2]")
	WebElement LatestProduct2;
	
	//Latest 3
	@FindBy(xpath="(//div[@class='post-ftimg-hld'])[3]")
	WebElement LatestProduct3;
	
	//Latest 4
	@FindBy(xpath="(//div[@class='post-ftimg-hld'])[4]")
	WebElement LatestProduct4;
	//--------------------------------------------------------------------------------------------------
	//Methods
	public void Beauty() {
		Beauty.click();

		test=extent.startTest("Verify whether user can click on the Beauty Module Successfully");
		test.log(LogStatus.INFO, "Netmeds page test is intiated");
		test.log(LogStatus.INFO,"Verify Netmeds Page Loads Successfully");
		
		String actual=driver.getCurrentUrl();
		String expected="https://www.netmeds.com/beauty";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "user can click on the Beauty Module");
		}
		else {
			test.log(LogStatus.FAIL, "user cannot click on the Beauty Module");
		}
		Assert.assertEquals(actual, expected);
	}
	
	public void Beauty_ad() {
		BeautyAd.isDisplayed();
		test=extent.startTest("Verify whether Beauty Ad is displayed Successfully");
		test.log(LogStatus.INFO, "Netmeds page test is intiated");
		test.log(LogStatus.INFO,"Verify Netmeds Page Loads Successfully");
		
		String actual=driver.getCurrentUrl();
		String expected="https://www.netmeds.com/beauty";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Beauty Ad is displayed");
		}
		else {
			test.log(LogStatus.FAIL, "Beauty Ad is not displayed");
		}
		Assert.assertEquals(actual, expected);
		
	}
	public void In_The_Spotlight() {
		in_the_spotlight.isDisplayed();
		
		inTheSpotlightBanner.click();
		driver.navigate().back();
		
		test=extent.startTest("Verify whether links in the 'In The spotlight' section are working Successfully");
		test.log(LogStatus.INFO, "Netmeds page test is intiated");
		test.log(LogStatus.INFO,"Verify Netmeds Page Loads Successfully");
		
		String actual=driver.getCurrentUrl();
		String expected="https://www.netmeds.com/beauty";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "links in the 'In The spotlight' section are working");
		}
		else {
			test.log(LogStatus.FAIL, "links in the 'In The spotlight' section are not working");
		}
		Assert.assertEquals(actual, expected);
	}
	
	public void Featured_Brands() {
		Featured_brands.isDisplayed();
		
		Maybelline.click();
		driver.navigate().back();
		
		Garnier.click();
		driver.navigate().back();
		
		Myglamm.click();
		driver.navigate().back();
		
		Colorbar.click();
		driver.navigate().back();
		
		Plum.click();
		driver.navigate().back();
		
		test=extent.startTest("Verify whether links in the 'Featured Brands' section are working Successfully");
		test.log(LogStatus.INFO, "Netmeds page test is intiated");
		test.log(LogStatus.INFO,"Verify Netmeds Page Loads Successfully");
		
		String actual=driver.getCurrentUrl();
		String expected="https://www.netmeds.com/beauty";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "links in the 'Featured Brands' section are working");
		}
		else {
			test.log(LogStatus.FAIL, "links in the 'Featured Brands' section are not working");
		}
		Assert.assertEquals(actual, expected);
	}
	
	public void TopOffers() {
		topoffersONbrands.isDisplayed();
		
		Offer1.click();
		driver.navigate().back();
		
		Offer2.click();
		driver.navigate().back();
		
		Offer3.click();
		driver.navigate().back();
		
		test=extent.startTest("Verify whether links in the 'Top Offers on Brands' section are working Successfully");
		test.log(LogStatus.INFO, "Netmeds page test is intiated");
		test.log(LogStatus.INFO,"Verify Netmeds Page Loads Successfully");
		
		String actual=driver.getCurrentUrl();
		String expected="https://www.netmeds.com/beauty";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "links in the 'Top Offers on Brands' section are working");
		}
		else {
			test.log(LogStatus.FAIL, "links in the 'Top Offers on Brands' section are not working");
		}
		Assert.assertEquals(actual, expected);
	}
	
	public void ShopbyCategory() {
		ShopbyCategory.isDisplayed();
		
		FaceWash.click();
		driver.navigate().back();
		
		BodyCare.click();
		driver.navigate().back();
		
		NailCare.click();
		driver.navigate().back();
		
		SkinCare.click();
		driver.navigate().back();
		
		HairCare.click();
		driver.navigate().back();
		
		test=extent.startTest("Verify whether links in the 'Shop By Category' section are working Successfully");
		test.log(LogStatus.INFO, "Netmeds page test is intiated");
		test.log(LogStatus.INFO,"Verify Netmeds Page Loads Successfully");
		
		String actual=driver.getCurrentUrl();
		String expected="https://www.netmeds.com/beauty";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "links in the 'Shop By Category' section are working");
		}
		else {
			test.log(LogStatus.FAIL, "links in the 'Shop By Category' section are not working");
		}
		Assert.assertEquals(actual, expected);
	}
	
	public void SkinCareEssentials() {
		SkinCareEssentials.isDisplayed();
		
		FaceWash2.click();
		driver.navigate().back();
		
		FacialKits.click();
		driver.navigate().back();
		
		FaceSkinCare.click();
		driver.navigate().back();
		
		MakeUp.click();
		driver.navigate().back();
		
		DayCreme.click();
		driver.navigate().back();
		
		test=extent.startTest("Verify whether links in the 'Skin Care Essentials' are working Successfully");
		test.log(LogStatus.INFO, "Netmeds page test is intiated");
		test.log(LogStatus.INFO,"Verify Netmeds Page Loads Successfully");
		
		String actual=driver.getCurrentUrl();
		String expected="https://www.netmeds.com/beauty";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "links in the 'Skin Care Essentials' section are working");
		}
		else {
			test.log(LogStatus.FAIL, "links in the 'Skin Care Essentials' section are not working");
		}
		Assert.assertEquals(actual, expected);
	}
	
	public void HairCareEssentials() {
		HaircareEssentials.isDisplayed();
		
		HairOils.click();
		driver.navigate().back();
		
		HairTreatment.click();
		driver.navigate().back();
		
		HairGels.click();
		driver.navigate().back();
		
		HairPerms.click();
		driver.navigate().back();
		
		HairSprays.click();
		driver.navigate().back();
		
		test=extent.startTest("Verify whether links in the 'Hair Care Essentials' are working Successfully");
		test.log(LogStatus.INFO, "Netmeds page test is intiated");
		test.log(LogStatus.INFO,"Verify Netmeds Page Loads Successfully");
		
		String actual=driver.getCurrentUrl();
		String expected="https://www.netmeds.com/beauty";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "links in the 'Hair Care Essentials' section are working");
		}
		else {
			test.log(LogStatus.FAIL, "links in the 'Hair Care Essentials' section are not working");
		}
		Assert.assertEquals(actual, expected);
	}
	
	public void MensGrooming() {
		MensGrooming.isDisplayed();
		
		Shaving.click();
		driver.navigate().back();
		
		Razors.click();
		driver.navigate().back();
		
		BeardOil.click();
		driver.navigate().back();
		
		BeardWash.click();
		driver.navigate().back();
		
		HairGels2.click();
		driver.navigate().back();
		
		test=extent.startTest("Verify whether links in the 'Men's Grooming' section are working Successfully");
		test.log(LogStatus.INFO, "Netmeds page test is intiated");
		test.log(LogStatus.INFO,"Verify Netmeds Page Loads Successfully");
		
		String actual=driver.getCurrentUrl();
		String expected="https://www.netmeds.com/beauty";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "links in the 'Men's Grooming' section are working");
		}
		else {
			test.log(LogStatus.FAIL, "links in the 'Men's Grooming' section are not working");
		}
		Assert.assertEquals(actual, expected);
	}
	
	public void TheLatestInBeauty() {
		TheLatestInBeauty.isDisplayed();
		
		LatestProduct1.click();
		driver.navigate().back();
		
		LatestProduct2.click();
		driver.navigate().back();
		
		LatestProduct3.click();
		driver.navigate().back();
		
		LatestProduct4.click();
		driver.navigate().back();
		
		test=extent.startTest("Verify whether links in the 'The Latest In Beauty' section are working Successfully");
		test.log(LogStatus.INFO, "Netmeds page test is intiated");
		test.log(LogStatus.INFO,"Verify Netmeds Page Loads Successfully");
		
		String actual=driver.getCurrentUrl();
		String expected="https://www.netmeds.com/beauty";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "links in the 'The Latest In Beauty' section are working");
		}
		else {
			test.log(LogStatus.FAIL, "links in the 'The Latest In Beauty' section are not working");
		}
		Assert.assertEquals(actual, expected);
	}
}
