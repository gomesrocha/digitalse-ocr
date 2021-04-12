package org.digitalse.model;
/**
 * DigitalSE-OCR
 * TokenExtract.java
 * Propósito: Tokenização de texto.
 *
 * @author Fabio Gomes Rocha
 * @version 0.0.1 12/04/2021
 */
import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.WhitespaceTokenizer;

public class TokenExtract {
	public static String[] token(String text) {

		String result[];

		Tokenizer tk = WhitespaceTokenizer.INSTANCE;
		result = tk.tokenize(text);
		return result;
		/*
		 * InputStream mi; TokenizerModel model = null; try { mi = new
		 * FileInputStream("data/pt-token.bin"); model = new TokenizerModel(mi); } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); } TokenizerME tokenizer = new TokenizerME(model);
		 * String tokens[] = tokenizer.tokenize(te.extract(imageFile, "por")); double
		 * tokenProbs[] = tokenizer.getTokenProbabilities();
		 * System.out.println("Token\t: Probability\n-------------------------------");
		 * for(int i=0;i<tokens.length;i++){
		 * System.out.println(tokens[i]+"\t: "+tokenProbs[i]); }
		 * System.out.println("\nTokem sem espaço em branco\n"); Tokenizer tk =
		 * WhitespaceTokenizer.INSTANCE; String tks[] =
		 * tk.tokenize(te.extract(imageFile, "por"));
		 * 
		 * System.out.println("Token\n----------------"); for(int i=0;i<tks.length;i++){
		 * System.out.println(tks[i]); } //System.out.println(te.extract(imageFile,
		 * "por"));
		 * 
		 */
	}
}
