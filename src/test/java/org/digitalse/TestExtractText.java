package org.digitalse;
/**
 * DigitalSE-OCR
 * TestExtractText.java
 * Propósito: Teste da Extração de texto de imagens usando BDD.
 *
 * @author Fabio Gomes Rocha
 * @version 0.0.1 12/04/2021
 */

import static org.junit.Assert.assertEquals;

import org.digitalse.model.TextExtractOCR;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class TestExtractText {
	TextExtractOCR txocr = new TextExtractOCR();
	@Dado("que eu insira uma imagem {string}")
	public void que_eu_insira_uma_imagem(String string) {
		txocr.setImagem(string);
		System.out.println(string);
	}

	@Quando("eu selecionar o idioma {string}")
	public void eu_selecionar_o_idioma(String string) {
	    txocr.setLang(string);
	    System.out.println(string);
	}

	@Então("o sistema extrair o texto retornando {string}")
	public void o_sistema_extrair_o_texto_retornando(String string) {
		String retorno = txocr.extractInformation();
		assertEquals("O valor é diferente", string.toString().toLowerCase().trim(), 
				retorno.toString().toLowerCase().trim());
		System.out.println(string);
	}


}
