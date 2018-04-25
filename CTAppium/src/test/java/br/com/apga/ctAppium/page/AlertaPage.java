package br.com.apga.ctAppium.page;

import org.openqa.selenium.By;

import br.com.apga.ctAppium.core.BasePage;

public class AlertaPage extends BasePage {

	public void clicarAlertaConfirm() {
		clicarTexto("ALERTA CONFIRM");
	}

	public String obterTituloAlerta() {
		return obterTexto(By.id("android:id/alertTitle"));
	}

	public String obterTextoAlerta() {
		return obterTexto(By.id("android:id/message"));
	}
	
	public void clicarConfirma(){
		clicarTexto("Confirmar");
	}
	
	public void clicarSair(){
		clicarTexto("Sair");
	}

}
