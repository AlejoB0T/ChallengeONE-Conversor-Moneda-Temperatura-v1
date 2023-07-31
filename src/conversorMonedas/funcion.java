package conversorMonedas;

import javax.swing.JOptionPane;

public class funcion {
	
	Monedas monedas = new Monedas();
	MonedasAPesos pesos = new MonedasAPesos();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Pesos a Dólar":
        	monedas.PesosADolares(Minput);
        	break;
        case "De Pesos a Euro":
        	monedas.PesosAEuros(Minput);
        	break;
        case "De Pesos a Libras":
        	monedas.PesosALibras(Minput);
        	break;
        case "De Pesos a Yen":
        	monedas.PesosAYen(Minput);
        	break;
        case "De Pesos a Won Coreano":
        	monedas.PesosAWon(Minput);
        	break;    	    	                          
        case "De Dólar a Pesos":
        	pesos.DolaresAPesos(Minput);
        	break;
        case "De Euro a Pesos":
        	pesos.EurosAPesos(Minput);
        	break;
        case "De Libras a Pesos":
        	pesos.LibrasAPesos(Minput);
        	break;
        case "De Yen a Pesos":
        	pesos.YenAPesos(Minput);
        	break;
        case "De Won Coreano a Pesos":
            pesos.WonAPesos(Minput);
            break;
        }      
    }

}
