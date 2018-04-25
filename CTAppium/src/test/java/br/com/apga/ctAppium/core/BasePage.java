package br.com.apga.ctAppium.core;

import static br.com.apga.ctAppium.core.DriverFactory.getDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidKeyCode;

public class BasePage {

	public void clicarTexto(String texto) {
		getDriver().findElement(By.xpath("//*[@text='" + texto + "']")).click();
	}

	public void escreverCampo(By by, String texto) {
		getDriver().findElement(by).sendKeys(texto);
		getDriver().pressKeyCode(AndroidKeyCode.ENTER);

	}

	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}

	public void clicarElemento(By by) {
		getDriver().findElement(by).click();
	}

	public void selecionaOpcaoCombo(By by, String valor) {
		clicarElemento(by);
		clicarTexto(valor);
	}

	public boolean isChecked(By by) {
		if (getDriver().findElement(by).getAttribute("checked").equals("true"))
			return true;
		return false;

	}

	public boolean exiteElementoPorTexto(String texto) {
		List<MobileElement> elementos = getDriver().findElements(By.xpath("//*[@text='" + texto + "']"));
		return elementos.size() > 0;
	}

	public void aguardarSplashSumir() {
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='Splash!']")));

	}
	

}
