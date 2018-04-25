package br.com.apga.ctAppium.page;

import org.openqa.selenium.By;

import br.com.apga.ctAppium.core.BasePage;
import io.appium.java_client.MobileBy;

public class FormularioPage extends BasePage {

	public void escreveNome(String texto) {
		escreverCampo(MobileBy.AccessibilityId("nome"), texto);
	}

	public String obterNome() {
		return obterTexto(MobileBy.AccessibilityId("nome"));
	}

	public void selecionaCombo(String valor) {
		selecionaOpcaoCombo(MobileBy.AccessibilityId("console"), valor);
	}

	public String obterValorCombo() {
		return obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
	}

	public void clicarCheckBox() {
		clicarElemento(MobileBy.AccessibilityId("check"));
	}

	public boolean isCheckBoxMarcado() {
		return isChecked(MobileBy.AccessibilityId("check"));
	}

	public void clicarSwitch() {
		clicarElemento(MobileBy.AccessibilityId("switch"));
	}

	public boolean isSwitchMarcado() {
		return isChecked(MobileBy.AccessibilityId("switch"));
	}

	public void clicarSalvar() {
		clicarElemento(MobileBy.AccessibilityId("save"));
	}
	
	public String obterNomeSalvo(){
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Nome:')]"));
	}
	
	public String obterConsoleSalvo(){
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Console:')]"));
	}
	
	public String obterSliderSalvo(){
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Slider:')]"));
	}
	
	public void clicarSalvarDemorado(){
		clicarElemento(By.xpath("//android.widget.TextView[@text='SALVAR DEMORADO']"));
	}
}
