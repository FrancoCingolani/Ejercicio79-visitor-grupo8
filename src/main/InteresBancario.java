package main;

public class InteresBancario implements Visitor{
	
	private final double interesTarjetaDeCredito = 1.05;
	private final double interesCajaDeAhorro = 0.99;
	
	@Override
	public double visit(TarjetaDeCredito tarjetaCredito) {
		return tarjetaCredito.getMonto() * this.interesTarjetaDeCredito;
	}
	@Override
	public double visit(CajaDeAhorro cajaAhorro) {
		return cajaAhorro.getMonto() * this.interesCajaDeAhorro;
	}

}
