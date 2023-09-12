package principal;

import javax.swing.JOptionPane;

import conversorDivisas.Function;

public class Principal {
	public static void main(String[] args) {

		Function monedas = new Function();

		while (true) {	

			String opciones = (JOptionPane.showInputDialog(null, "Opción de conversión ", "Menu",
					JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Conversor de divisas"}, "Seleccion")).toString();

			switch (opciones) {
			case "Conversor de divisas":
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
				if (ValidarNumero(input) == true) {
					double Minput = Double.parseDouble(input);
					monedas.ConvertirDivisas(Minput);

					int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opción Afirmativa");
					} else if (JOptionPane.NO_OPTION == respuesta) {
						JOptionPane.showMessageDialog(null, "Programa terminado");
						throw new NullPointerException("Programa terminado");
					} 

				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
			}
		}
	}

	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if (x >= 0 || x < 0)
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
