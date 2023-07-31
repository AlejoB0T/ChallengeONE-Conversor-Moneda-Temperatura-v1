package conversorTemperaturas;

import javax.swing.JOptionPane;

public class Temperaturas {
	
	public double CelciusAFarenheit(double valor) {
		double farenheit = valor * 1.8 + 32;
    	farenheit = (double) Math.round(farenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " +farenheit+ " Grados Farenheit ");
		return farenheit;
	}
	
	public void CelciusAKelvin(double valor){
		double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " +kelvin+ " Kelvin");
	}
	
	public void FarenheitACelcius(double valor) {
		double celcius = (valor - 32) / 1.8;
        celcius = (double) Math.round(celcius *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Farenheit son " +celcius+ " Celcius");
	}
	
	public double KelvinACelcius(double valor) {
		 double kelvinCelcius = valor - 273.15;
         kelvinCelcius = (double) Math.round(kelvinCelcius *100d)/100;
         JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinCelcius+ " Celcius");
         return kelvinCelcius;
	}
	
	public void KelvinAFarenheit(double valor) {
		double kelvinFarenheit = (valor - 273.15) * 9/5 + 32;
		kelvinFarenheit	= (double) Math.round(kelvinFarenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinFarenheit+ " Farenheit");
	}
	
	public void FarenheitAKelivin(double valor) {
		double farenheitKelvin = (valor - 32) * 5/9 + 273.15;
		farenheitKelvin	= (double) Math.round(farenheitKelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Farenheit son " +farenheitKelvin+ " Kelvin");
	}


}
