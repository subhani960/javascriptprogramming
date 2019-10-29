package mavenproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import junit.framework.Assert;

public class Seliniumgrid {
	WebDriver driver;
	String baseur1,nodeur1;
	public void setup() {
		/* baseur1 is an  application ur1*/
		baseur1 ="http://www.facebook.com";
		/*nodeur1 is an client register ur1 contains client port number*/
		nodeur1 =" http://192.168.174.1:1983/wd/hub";
		/* browser capability initialization using capability class*/
		DesiredCapabilities subhani = DesiredCapabilities.chrome();
		subhani.setBrowserName("chrome");
		subhani.setPlatform(Platform.WINDOWS);
		try {
			driver = new RemoteWebDriver(new URL(nodeur1), subhani);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
			
		}
	      public void simpletest() {
	    	  driver.get(baseur1);
	    	  Assert.assertEquals("Facebook – log in or sign up",driver.getTitle());
	      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Seliniumgrid s=new Seliniumgrid();
        s.setup();
        s.simpletest();
	}

}
