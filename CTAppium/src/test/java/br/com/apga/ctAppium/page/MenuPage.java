package br.com.apga.ctAppium.page;

import br.com.apga.ctAppium.core.BasePage;
import br.com.apga.ctAppium.core.DriverFactory;

public class MenuPage extends BasePage {

	public void acessarFormulario() {
		DriverFactory.getDriver();
		clicarTexto("Formulário");
	}

}
