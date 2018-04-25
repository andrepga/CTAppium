package br.com.apga.ctAppium.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.apga.ctAppium.page.AlertaPage;
import br.com.apga.ctAppium.page.MenuPage;

public class AlertaTest {
	
	private MenuPage menu = new MenuPage();
	private AlertaPage page = new AlertaPage();
	
	@Before
	public void setUp() throws Exception {
		menu.acessarAlert();
	}
	
	@Test
	public void deveConfirmarAlerta(){
		page.clicarAlertaConfirm();
		assertEquals("Info", page.obterTituloAlerta());
		assertEquals("Confirma a operação?", page.obterTextoAlerta());
		page.clicarConfirma();
		assertEquals("Info", page.obterTituloAlerta());
		assertEquals("Confirmado", page.obterTextoAlerta());
		page.clicarSair();
	}
	

}
