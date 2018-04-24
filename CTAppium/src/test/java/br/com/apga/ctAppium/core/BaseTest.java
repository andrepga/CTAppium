package br.com.apga.ctAppium.core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseTest {

	public void gerarScreenShot() {
		File imagem = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(imagem, new File("target/screenshots/" +testName.getMethodName()+ ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Rule
	public TestName testName = new TestName();

	@After
	public void tearDown() throws Exception {
		// DriverFactory.killDriver();
		gerarScreenShot();
		DriverFactory.getDriver().resetApp();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		DriverFactory.killDriver();
	}
	
	public void esperar(long tempo){
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
