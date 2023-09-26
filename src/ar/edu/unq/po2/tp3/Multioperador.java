package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {

	private ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
	
	
	public void agregarNumero(Integer numero) {
		
		listaDeNumeros.add(numero);
	
	}
	
	public Integer sumaDeTodosLosNumeros() {
		
		Integer sumaTotal = 0;
		
		for (Integer numero : listaDeNumeros) {
			
			sumaTotal += numero;
			
		}
		
		return sumaTotal;
		
	}
	
	
	public Integer restaDeTodosLosNumeros() {
		
		if (listaDeNumeros.isEmpty()) {
            return 0; // Si está vacía, devuelve 0
        }
		
		
		Integer restaTotal = 0;
		
		for (Integer numero : listaDeNumeros) {
			
			restaTotal -= numero;
			
		}
		
		
		return restaTotal;
		
	}
	
	
	public Integer multiplicacionDeTodosLosNumeros() {
		
		Integer total = 1;
		
		for (Integer numero : listaDeNumeros) {
			
			total *= numero;
			
		}
		
		return total;
		
	}
	
	
	
	
	
}
