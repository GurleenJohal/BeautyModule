package Netmeds_Test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Netmeds_PageClass.Filters_Page;
import Netmeds_Testbase.Netmeds_Testbase;

public class Filters extends Netmeds_Testbase{
	//Object of Page Class
	Filters_Page filters_page;
	
	//Invoking Browser
	@BeforeClass
	public void launchWebsite() throws IOException {
		initialize();
		filters_page =  new Filters_Page();
		filters_page.x();
	}

	@AfterTest
	public void reportEnd() {
		filters_page.y();
	}
	
	  @Test(priority=1)
	  public void searchProduct() {
		  
		  filters_page.searchProduct();
		  
	  }
	  
	  @Test(priority=2)
	  public void selectBrand() {
		  
		  filters_page.selectBrand();
		  
	  }
	  
	  @Test(priority=3)
	  public void selectManufacturers() {
		  
		  filters_page.selManufacturers();
		  
	  }
	  
	  @Test(priority=4)
	  public void selectCategories() {
		  
		  filters_page.selCategory();
		  
	  }
	  
	  @Test(priority=5)
	  public void adjustPrice() {
		  
		  filters_page.adjustPrice();
		  
	  }
	  
	  @Test(priority=5)
	  public void adjustDiscount() {
		  
		  filters_page.adjustDiscount();
		  
	  }
	  
	  //Close the Browser
	  @AfterClass
	  public void terminate() {
		  close();
	  }
}
