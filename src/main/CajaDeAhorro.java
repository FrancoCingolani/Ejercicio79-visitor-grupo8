package main;

public class CajaDeAhorro implements Visitable{

	private double monto;

	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}
	
	public double getMonto() {
		return monto;
	}
	
	public void setMonto(double monto) {
		this.monto = monto;
	}
	

}
