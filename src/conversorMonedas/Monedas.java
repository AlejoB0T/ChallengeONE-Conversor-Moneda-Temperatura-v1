package conversorMonedas;

import javax.swing.JOptionPane;

public class Monedas {
	
	public void PesosADolares(double valor) {
		double monedaDolar = valor / 3905.50;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
	}
	
	public void PesosAEuros(double valor) {
		double monedaEuro = valor / 4294.47;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
	}
	
	public void PesosALibras(double valor) {
		double monedaLibra = valor / 5012.53;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Libras Esterlinas");
	}
	
	public void PesosAYen(double valor) {
		double monedaYen = valor / 27.45;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yuanes");
	}
	
	public void PesosAWon(double valor) {
		double monedaWon = valor / 3.06;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Wons");
	}

}
