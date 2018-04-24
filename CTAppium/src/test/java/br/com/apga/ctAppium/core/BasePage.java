package br.com.apga.ctAppium.core;

import static br.com.apga.ctAppium.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidKeyCode;




public class BasePage {

	public void clicarTexto(String texto) {
		getDriver().findElement(By.xpath("//*[@text='"+texto+"']")).click();
	}
	
	public void escreverCampo(By by, String texto){
		getDriver().findElement(by).sendKeys(texto);
		getDriver().pressKeyCode(AndroidKeyCode.ENTER);
		
	}
	
	public String obterTexto(By by){
		return getDriver().findElement(by).getText();
	}
	
	public void clicarElemento(By by){
		getDriver().findElement(by).click();
	}
	
	public void selecionaOpcaoCombo (By by, String valor){
		clicarElemento (by);
		clicarTexto(valor);	
	}
	
	public boolean isChecked(By by){
		if (getDriver().findElement(by).getAttribute("checked").equals("true"))
			return true;
		return false;
		
	}

}
