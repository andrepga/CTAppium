package br.com.apga.ctAppium.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import br.com.apga.ctAppium.core.BaseTest;
import br.com.apga.ctAppium.page.FormularioPage;
import br.com.apga.ctAppium.page.MenuPage;

public class FormularioTest extends BaseTest{

	private MenuPage menu = new MenuPage();
	private FormularioPage page = new FormularioPage();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		menu.acessarFormulario();
	}


	@Test
	public void devePreencherCampoNome() {
		page.escreveNome("Araujo");
		assertEquals("Araujo", page.obterNome( ));
	}
	
	@Test
	public void deveInteragirCombo() {
		page.selecionaCombo("Nintendo Switch");
		assertEquals("Nintendo Switch", page.obterValorCombo( ));
		
	}
	
	@Test
	public void deveInteragirSwitchCheckBox(){
		//Verificar status Elementos
		assertFalse(page.isCheckBoxMarcado());
		assertTrue(page.isSwitchMarcado());
		//Alterar status Elementos
		page.clicarCheckBox();
		page.clicarSwitch();
		//Verificar staus Elementos
		assertTrue(page.isCheckBoxMarcado());
		assertFalse(page.isSwitchMarcado());
	}
	
	@Test
	public void deveRealizarCadastro(){
		page.escreveNome("Andre");
		assertEquals("Andre",page.obterNome());
		page.selecionaCombo("PS4");
		assertEquals("PS4",page.obterValorCombo());
		assertFalse(page.isCheckBoxMarcado());
		assertTrue(page.isSwitchMarcado());
		page.clicarCheckBox();
		page.clicarSwitch();
		assertTrue(page.isCheckBoxMarcado());
		assertFalse(page.isSwitchMarcado());
		page.clicarSalvar();
		assertEquals("Nome: Andre",page.obterNomeSalvo());
		assertEquals("Console: ps4",page.obterConsoleSalvo());
		assertEquals("Slider: 25",page.obterSliderSalvo());
	}
	
	@Test
	public void deveRealizarCadastroDemorado(){
		page.escreveNome("Andre");
		assertEquals("Andre",page.obterNome());
		page.clicarSalvarDemorado();
		assertEquals("Nome: Andre",page.obterNomeSalvo());

	}

}
