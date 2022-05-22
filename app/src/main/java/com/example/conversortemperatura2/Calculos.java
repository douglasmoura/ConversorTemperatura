package com.example.conversortemperatura2;

public class Calculos {
    public static String conversor(Double temperatura, int pageAtual){
       int index = pageAtual+1;
       String stringConversao = null;

        switch (index) {
            case 1:
                //celsius
                double celsiusFahrenheit = (temperatura * 1.80) + 32.0;
                double celsiusKelvin = (temperatura + 273.15);
                double celsiusRankine = (temperatura + 273.15) * 1.80;
                    stringConversao=("\nFahrenheit: " + format(celsiusFahrenheit) + "º" +
                            "\nKelvin: " + format(celsiusKelvin) + "º" +
                            "\nRankine: " + format(celsiusRankine) + "º"
                    );
                break;
            case 2:
                //fahrenheit
                double fahrenheitCelsius = (temperatura - 32.0) / 1.80;
                double fahrenheitKelvin = ((temperatura - 32.0)/ 1.80) + 273.15;
                double fahrenheitRankine = temperatura + 459.67;
                stringConversao = ("\nCelsius: " +  format(fahrenheitCelsius) + "º" +
                            "\nKelvin: " + format(fahrenheitKelvin) + "º" +
                            "\nRankine: " + format(fahrenheitRankine) + "º"
                    );

                break;
            case 3:
                //kelvin
                double kelvinCelsius = temperatura - 273.15;
                double kelvinFahrenheit = ((temperatura - 273.15)*1.80) +32.0;
                double kelvinRankine = temperatura * 1.80;
                stringConversao = ("\nCelsius: " + format(kelvinCelsius) + "º" +
                            "\nFahrenheit: " + format(kelvinFahrenheit) + "º" +
                            "\nRankine: " + format(kelvinRankine) + "º"
                    );
                break;
            case 4:
                //Rankine
                double rankineCelsius = (temperatura - 491.67) / 1.80;
                double rankineFahrenheit = temperatura - 459.67;
                double rankineKelvin = temperatura / 1.80;
                    stringConversao = ("\nCelsius: " + format(rankineCelsius) + "º" +
                            "\nFahrenheit: " + format(rankineFahrenheit) + "º" +
                            "\nKelvin: " + format(rankineKelvin) + "º"
                    );
                break;
        }

       return stringConversao;
    }
    public static String format(double d){
       return String.format("%.2f", d);
    }

}
