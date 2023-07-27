package Monedas;

import javax.swing.*;

public class function {

    ConvertirMonedas monedas = new ConvertirMonedas();
    ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();

    public void ConvertirMonedas(double Minput) {
        String[] opciones = {
                "De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras",
                "De Pesos a Yen", "De Pesos a Won Coreano",
                "De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos",
                "De Yen a Pesos", "De Won Coreano a Pesos"
        };

        String opcion = (String) JOptionPane.showInputDialog(
                null, "Elije la moneda a la que deseas convertir tu dinero", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]
        );

        if (opcion != null) {
            if (opcion.startsWith("De Pesos")) {
                switch (opcion) {
                    case "De Pesos a Dólar":
                        monedas.ConvertirPesosADolares(Minput);
                        break;
                    case "De Pesos a Euro":
                        monedas.ConvertirPesosAEuros(Minput);
                        break;
                    case "De Pesos a Libras":
                        monedas.ConvertirPesosALibras(Minput);
                        break;
                    case "De Pesos a Yen":
                        monedas.ConvertirPesosAYen(Minput);
                        break;
                    case "De Pesos a Won Coreano":
                        monedas.ConvertirPesosAWon(Minput);
                        break;
                }
            } else if (opcion.startsWith("De ")) {
                pesos.ConvertirMonedasAPesos(opcion, Minput);
            }
        }
    }
}