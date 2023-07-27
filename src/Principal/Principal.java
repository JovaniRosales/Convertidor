package Principal;

import Monedas.function;
import Temperatura.functionTemperatura;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        function monedas = new function();
        functionTemperatura temperatura = new functionTemperatura();

        while (true) {
            String opciones = (String) JOptionPane.showInputDialog(
                    null, "Seleccione una opción de conversión", "Menu", JOptionPane.QUESTION_MESSAGE,
                    null, new Object[]{"Conversor de Moneda", "Conversor de Temperatura"}, "Conversor de Moneda"
            );

            if (opciones == null) {
                JOptionPane.showMessageDialog(null, "Programa terminado");
                break;
            }

            switch (opciones) {
                case "Conversor de Moneda":
                    double Minput = obtenerNumeroValidado("Ingresa la cantidad de dinero que deseas convertir: ");
                    if (Minput != -1) {
                        monedas.ConvertirMonedas(Minput);
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;

                case "Conversor de Temperatura":
                    double Tinput = obtenerNumeroValidado("Ingresa el valor de la temperatura que deseas convertir: ");
                    if (Tinput != -1) {
                        temperatura.ConvertirTemperatura(Tinput);
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;
            }
        }
    }

    public static double obtenerNumeroValidado(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}