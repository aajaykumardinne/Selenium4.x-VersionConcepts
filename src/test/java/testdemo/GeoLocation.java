package testdemo;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class GeoLocation {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		Map<String, Object> coordinatesMap = new HashMap<String, Object>();
		
		coordinatesMap.put("latitude", 34.052235);
		coordinatesMap.put("longitude", -118.243683);
		coordinatesMap.put("accuracy", 1);
		
		
		((ChromeDriver)driver).executeCdpCommand("Emulation.setGeolocationOverride", coordinatesMap);
		
		
		driver.get("https://oldnavy.gap.com/stores");

	}

}
