# language: pt

@tag
Funcionalidade: Extração de dados de imagem
	Como pesquisador
	Eu quero inserir uma imagem
	Para que eu possa extrair o texto

@tag1
Cenario: Extraindo dados de arquivo de imageme
	Dado que eu insira uma imagem <image>
	Quando eu selecionar o idioma <lang>
	Então o sistema extrair o texto retornando <textreturn>
	Exemplos:
	 | image      | lang 		 | textreturn  			 |
   | "ocr1.png" |    "por" | "O OCR funcionou" |
	 | "ocr2.png" |    "por" | "laboratorio de engenharia" |
