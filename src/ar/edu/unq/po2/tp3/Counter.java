package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {


	private ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
	
	
	

	public void agregarNumero(Integer numero) {
	
		listaDeNumeros.add(numero);
	
	}


	public int cantidadDePares() {
		
		int cantidadPares = 0;
		
		for (Integer numero : listaDeNumeros) {
			
			if (numero%2 == 0) {
				cantidadPares++;
			}
		}
		
		return cantidadPares;
		
		
	}
	
	
	
	
	
	
	
}
