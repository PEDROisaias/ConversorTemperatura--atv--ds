public class Main {
    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperatura();

        double celsius = 30;
        double resultadoF = conversor.converter(celsius);
        System.out.println(celsius + "°C em Fahrenheit: " + resultadoF);

        double fahrenheit = 86;
        double resultadoC = conversor.converterFahrenheitParaCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F em Celsius: " + resultadoC);

        int resultadoAjustado = conversor.converter(celsius, 2, true);
        System.out.println(celsius + "°C em Fahrenheit com ajuste de 2 e arredondamento: " + resultadoAjustado);
}
}
