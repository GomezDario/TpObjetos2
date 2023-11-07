package ar.edu.unq.po2.tp11;

import java.util.Map;


public class EncriptacionVocal implements IEncriptacion{

	@Override
	public String encriptar(String texto) {
		// TODO Auto-generated method stub
		
	/*Pensar otra solucion con un Map para no anidar else-if*/
		
		String resultado = "";
		
		for (int i = 0; i < texto.length(); i++) {
			
			if (texto.charAt(i) == 'a') {
				resultado += 'e';
			} else if (texto.charAt(i) == 'e') {
				resultado += 'i';
			} else if (texto.charAt(i) == 'i') {
				resultado += 'o';
			} else if (texto.charAt(i) == 'o') {
				resultado += 'u';
			} else if (texto.charAt(i) == 'o') {
				resultado += 'a';
			} else {
				resultado += texto.charAt(i);
			}
			
		}

		
		return resultado;
	}

	@Override
	public String desencriptar(String texto) {
		// TODO Auto-generated method stub
		String resultado = "";
		
		for (int i = 0; i < texto.length(); i++) {
			
			if (texto.charAt(i) == 'e') {
				resultado += 'a';
			} else if (texto.charAt(i) == 'i') {
				resultado += 'e';
			} else if (texto.charAt(i) == 'o') {
				resultado += 'i';
			} else if (texto.charAt(i) == 'u') {
				resultado += 'o';
			} else if (texto.charAt(i) == 'a') {
				resultado += 'o';
			} else {
				resultado += texto.charAt(i);
			}
			
		}

		
		return resultado;
	}

	
	
	
}
