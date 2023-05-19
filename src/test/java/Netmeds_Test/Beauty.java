package Netmeds_Test;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Netmeds_PageClass.Beauty_Page;
import Netmeds_Testbase.Netmeds_Testbase;


public class Beauty extends Netmeds_Testbase{
			//Object of Page Class
			Beauty_Page beauty_page;
			
			//Invoking Browser
			@BeforeClass
			public void launchWebsite() throws IOException {
				initialize();
				beauty_page =  new Beauty_Page();
				beauty_page.x();
			}

			@AfterTest
			public void reportEnd() {
				beauty_page.y();
			}
			
			@Test(priority=1)
			public void Beauty_link() {
				
				beauty_page.Beauty();
			
			}
			
			@Test(priority=2)
			public void Beauty_Ad() {
				
				beauty_page.Beauty_ad();
			
			}
			
			@Test(priority=3)
			public void In_the_Spotlight() {
				
				beauty_page.In_The_Spotlight();
			
			}
			
			@Test(priority=4)
			public void Featured_Brands() {
				
				beauty_page.Featured_Brands();
				
			}
			
			@Test(priority=5)
			public void Top_Offers_onBrands() {
				
				beauty_page.TopOffers();
				
			}
			
			@Test(priority=6)
			public void Shop_By_Category() {
				
				beauty_page.ShopbyCategory();
				
			}
			
			@Test(priority=7)
			public void Skin_Care_Essentials() {
				
				beauty_page.SkinCareEssentials();
				
			}
			
			@Test(priority=8)
			public void Hair_Care_Essentials() {
				
				beauty_page.HairCareEssentials();
				
			}
			
			@Test(priority=9)
			public void Mens_Grooming() {
				
				beauty_page.MensGrooming();
				
			}
			
			@Test(priority=10)
			public void The_Latest_In_Beauty() {
				
				beauty_page.TheLatestInBeauty();
				
			}
			
			//Closing the browser
  			@AfterClass
  			public void terminate() {
  				close();
  			}
}
