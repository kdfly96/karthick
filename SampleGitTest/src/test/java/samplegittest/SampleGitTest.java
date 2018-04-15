package samplegittest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleGitTest {

	@Test
	public void loginTest() throws IOException {

		WebDriver wd = new FirefoxDriver();
		// wd.get("https://www.Google.co.in");
		wd.get("https://www.Flipkart.com");

		File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);// apache
		FileUtils.copyFile(src, new File("D:\\JAVA\\PROJECT\\SampleGitTest\\Screenshot\\Flipkart.jpg"));

	}
}
