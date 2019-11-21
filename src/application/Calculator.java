package application;

/**
 * Berechnet das Formelrad
 * @author Merlin Stocker + Luca Fahrni
 * @version 21.11.2019
 */
public class Calculator {
	private double leistung;
	private double spannung;
	private double strom;
	private double widerstand;
	
	public Calculator(double leistung, double spannung, double strom, double widerstand) {
		super();
		this.leistung = leistung;
		this.spannung = spannung;
		this.strom = strom;
		this.widerstand = widerstand;
	}
	
	public double getLeistung() {
		return leistung;
	}
	
	public double getSpannung() {
		return spannung;
	}

	public double getStrom() {
		return strom;
	}

	public double getWiderstand() {
		return widerstand;
	}

	@Override
	public String toString() {
		return "Calculator [leistung=" + leistung + 
				", spannung=" + spannung + 
				", strom=" + strom + 
				", widerstand="	+ widerstand + "]";
	}

	public void calculate() {
		this.leistung = pAusUundI(spannung, strom);
		this.leistung = pAusRUndI(widerstand, strom);
		this.leistung = pAusUUndR(spannung, widerstand);
	}


	public double pAusUundI(double u, double i) {
		double p = u*i;
		return p;
	}

	public double pAusRUndI(double r, double i) {
		double p = i * i * r;
		return p;
	}

	public double pAusUUndR(double u, double r) {
		double p = u * u / r;
		return p;
	}


}
