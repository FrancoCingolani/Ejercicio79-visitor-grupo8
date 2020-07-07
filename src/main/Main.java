package main;

public class Main {
	
	public static void main(String[] args) {
		
		TarjetaDeCredito tarjetaCredito1 = new TarjetaDeCredito();
		tarjetaCredito1.setMonto(100);
		CajaDeAhorro cajaAhorro2 = new CajaDeAhorro();
		cajaAhorro2.setMonto(5000);
		
		InteresBancario interesBancario = new InteresBancario();
		double resultado1 = tarjetaCredito1.accept(interesBancario);
		double resultado2 = cajaAhorro2.accept(interesBancario);
		
		System.out.println("El nuevo interés de la tarjeta de crédito es: " + resultado1);
		System.out.println("El monto de la caja de ahorro menos el interés es: "+ resultado2);
		
	}
	
	

}
