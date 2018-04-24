package br.com.apga.ctAppium.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.apga.ctAppium.core.BaseTest;
import br.com.apga.ctAppium.page.MenuPage;
import br.com.apga.ctAppium.page.SplashPage;

public class SplashTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private SplashPage page = new SplashPage();

	@Before
	public void setUp() throws Exception {
		menu.acessarSplash();
	}

	@Test
	public void deveAguardarSplashSumir() {
		
		page.isTelaSplashVisivel();
		page.aguardarSplashSumir();
		assertTrue(page.exiteElementoPorTexto("Formulário"));

	}

}
