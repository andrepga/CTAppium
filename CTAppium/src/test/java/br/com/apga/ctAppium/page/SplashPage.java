package br.com.apga.ctAppium.page;

import br.com.apga.ctAppium.core.BasePage;

public class SplashPage extends BasePage{
	
	public boolean isTelaSplashVisivel(){
		return exiteElementoPorTexto("Splash!");
		
	}

}
