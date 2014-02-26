package br.org.cesar.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.org.cesar.common.HomePage;

/**
 * Classe de testes com cenários relacionados a página inicial
 */
public class HomePageValidation extends BaseTestcase{

	@Before
	public void before() throws Exception {
	}


	/**
	 * Objective: Open home screen and verify title
	 * 
	 * Steps: Navigate to home screen and assert title text
	 * 
	 * Expected Results: Home screen title is correct
	 */
	@Test
	public void assertHomeScreenTitle() {
		HomePage.clickHomeMenuItem();
		HomePage.isTitleCorrect("Classe de Testes | Testes e Qualidade de Software");
	}
	
	
	/**
	 * Objective: Navigates to Curso Selenium Page and verify displayed title
	 * 
	 * Steps: Navigate to  Curso Selenium Page and assert displayed title text
	 * 
	 * Expected Results: Curso Selenium Page  title is correct
	 */
	@Test
	public void navigateToCursoSeleniumPage() {
		HomePage.clickSeleniumMenuItem();
		HomePage.clicksubMenuItem("Curso Selenium");
		HomePage.isHeaderTitleCorrect("Curso Selenium");
	}
	
	
	/**
	 * Objective: Navigates to Formulario Simples Pageand verify displayed title
	 * 
	 * Steps: Navigate to  Formulario Simples Page and assert displayed title text
	 * 
	 * Expected Results: Formulario Simples Page title is correct
	 */
	@Test
	public void navigateToFormularioSimplesPage() {
		HomePage.clickSeleniumMenuItem();
		HomePage.clicksubMenuItem("Formulário Simples");
		HomePage.isHeaderTitleCorrect("Formulário Simples");
	}
	
	
	/**
	 * Objetivo: Página de resultados da busca é exibida corretamente
	 * 
	 * Passos: Realiza busca com texto fixo e verifica o título da página de resultados
	 * 
	 * Resultado Esperado: Título da página de resultados está correto
	 */
	@Test
	public void performSimpleSearch() {
		HomePage.showHiddenOptions();
		HomePage.performSearch("teste");
		HomePage.clickSearchButton();
		HomePage.isSearchResultCorrect("Resultados da pesquisa por: teste");
	}

	
	@After
	public void after() throws Exception {
	}
}
