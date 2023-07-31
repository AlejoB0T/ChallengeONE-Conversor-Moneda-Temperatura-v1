package conversorMonedas;

import javax.swing.JOptionPane;

public class MonedasAPesos {
	
	public void DolaresAPesos(double valor) {
		double monedaDolar = valor * 3905.50;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Colombianos");
	}
	
	public void EurosAPesos(double valor) {
		double monedaEuro = valor * 4294.47;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Colombianos");
	}
	
	public void LibrasAPesos(double valor) {
		double monedaLibra = valor * 5012.53;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Colombianos");
	}
	
	public void YenAPesos(double valor) {
		double monedaYen = valor * 27.45;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Colombianos");
	}
	
	public void WonAPesos(double valor) {
		double monedaWon = valor * 3.06;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Colombianos");
	}

}
