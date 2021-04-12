package org.digitalse.model;
/**
 * DigitalSE-OCR
 * TextExtractOCR.java
 * Propósito: Extração de texto de imagens.
 *
 * @author Fabio Gomes Rocha
 * @version 0.0.1 12/04/2021
 */
import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TextExtractOCR {
	String lang, imagem;

	public void setLang(String lang) {
		this.lang = lang;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public String extractInformation() {
		File imageFile = new File("data/"+imagem);
        Tesseract tess4j = new Tesseract();
        tess4j.setTessVariable("user_defined_dpi", "300");
        //tess4j.setTessVariable("debug_file", "/dev/null");
        tess4j.setDatapath("data/");
        tess4j.setLanguage(lang);
        String result = "";
        try {
            result = tess4j.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
        return result;
	}

}
