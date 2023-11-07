package ar.edu.unq.po2.tp11;

public class EncriptacionNumero implements IEncriptacion{

	@Override
	public String encriptar(String texto) {
		// TODO Auto-generated method stub
	
		StringBuilder resultado = new StringBuilder();
		
		for (int i = 0; i < texto.length(); i++) {
			
			char c = texto.charAt(i);
			
			if (Character.isLetter(c)) {
				int offset = Character.isUpperCase(c) ? 'A' : 'a';
				int valorNumerico = c - offset + 1;
				resultado.append(valorNumerico);
				
			}else {
				
				resultado.append(c);
				
			}
			
			
		}
		
		
		return resultado.toString();
	}

	@Override
	public String desencriptar(String texto) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
