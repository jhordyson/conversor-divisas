package conversorDivisas;

import javax.swing.JOptionPane;

public class ConvertirASoles {
	
	public void ConvertirDolaresASoles(double valor) {
		double monedaDolar = valor * 3.72;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Soles");
	}

	public void ConvertirEurosASoles(double valor) {
		double monedaEuro = valor * 3.98;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Soles");
	}

	public void ConvertirLibrasASoles(double valor) {
		double monedaLibra = valor * 4.63;
		monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Soles");
	}

	public void ConvertirYenASoles(double valor) {
		double monedaYen = valor * 0.025;
		monedaYen = (double) Math.round(monedaYen * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Soles");
	}

	public void ConvertirWonASoles(double valor) {
		double monedaWon = valor * 0.0028;
		monedaWon = (double) Math.round(monedaWon * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Soles");
	}

}
