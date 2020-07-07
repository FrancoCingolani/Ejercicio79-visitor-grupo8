package main;

public interface Visitor {
	
	public double visit(TarjetaDeCredito tarjetaCredito);
	public double visit(CajaDeAhorro cajaAhorro);

}
