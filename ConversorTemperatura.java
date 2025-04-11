public class ConversorTemperatura {

    public double converter(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double converterFahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public int converter(double celsius, double ajuste, boolean arredondar) {
        double resultado = (celsius * 9 / 5) + 32 + ajuste;
        return arredondar ? (int) Math.round(resultado) : (int) resultado;
    }
}
