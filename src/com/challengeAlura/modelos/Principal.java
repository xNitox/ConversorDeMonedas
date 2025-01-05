package com.challengeAlura.modelos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Buscador lectura = new Buscador();
        SolicitudValores solicitarValor = new SolicitudValores();

        // Predefinir el valor que necesitas para la solicitud
        String valorPredefinido = "USD"; // Por ejemplo, USD

        Conversor valor = solicitarValor.buscaValores(valorPredefinido);
        String menuMensaje ="*********************************************************"
                    + "\nBienvenido/a al Conversor de Monedas :)"
                    + "\nSeleccione la Divisa que desea convertir."
                    + "\n1)Dólar ==> Peso Argentino"
                    + "\n2)Peso Argentino ==> Dólar"
                    + "\n3)Dólar ==> Real Brasileño"
                    + "\n4)Real Brasileño ==> Dólar"
                    + "\n5)Dólar ==> Peso Colombiano"
                    + "\n6)Peso Colombiano ==> Dólar"
                    + "\n7)Salir"
                    + "\nSeleccione una opción:"
                    + "\n********************************************************";


        try (Scanner scanner = new Scanner(System.in)) {
            double cantidad = 0;
            int menu = 0;

            while (menu != 7) {
                System.out.println(menuMensaje);
                menu = scanner.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("Ingrese el valor que desea convertir");
                        cantidad = scanner.nextDouble();
                        System.out.println("Tasa de conversión Dólar a Peso Argentino: "
                                + valor.getConversionRate("ARS") * cantidad);
                        break;
                    case 2:
                        System.out.println("Ingrese el valor que desea convertir");
                        cantidad = scanner.nextDouble();
                        System.out.println("Tasa de conversión Peso Argentino a Dólar: "
                                + cantidad / valor.getConversionRate("ARS"));
                        break;
                    case 3:
                        System.out.println("Ingrese el valor que desea convertir");
                        cantidad = scanner.nextDouble();
                        System.out.println("Tasa de conversión Dólar a Real Brasileño: "
                                + valor.getConversionRate("BRL") * cantidad);
                        break;
                    case 4:
                        System.out.println("Ingrese el valor que desea convertir");
                        cantidad = scanner.nextDouble();
                        System.out.println("Tasa de conversión Real Brasileño a Dólar: "
                                + cantidad / valor.getConversionRate("BRL"));
                        break;
                    case 5:
                        System.out.println("Ingrese el valor que desea convertir");
                        cantidad = scanner.nextDouble();
                        System.out.println("Tasa de conversión Dólar a Peso Colombiano: "
                                + valor.getConversionRate("COP") * cantidad);
                        break;
                    case 6:
                        System.out.println("Ingrese el valor que desea convertir");
                        cantidad = scanner.nextDouble();
                        System.out.println("Tasa de conversión Peso Colombiano a Dólar: "
                                + cantidad / valor.getConversionRate("COP"));
                        break;
                    case 7:
                        System.out.println("Saliendo del conversor. ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor seleccione una opción del 1 al 7.");
                }
            }
        }
    }
}
