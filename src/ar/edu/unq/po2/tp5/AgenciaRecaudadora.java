package ar.edu.unq.po2.tp5;

import java.util.List;

public class AgenciaRecaudadora implements Agencia{

	
	@Override
	public void registrarPago(Factura factura) {
		// TODO Auto-generated method stub
		
		System.out.print("Costo: " + factura.getPrecioFactura());
		
	}
	
	
}
