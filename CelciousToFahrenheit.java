public class CelciousToFahrenheit {
    public static void main(String[] args) {
        int fahrenheit = Integer.parseInt(args[0]);
        int celsius = ((fahrenheit-32)*5)/9;
        System.out.println("Fahrenheit : "+fahrenheit);
        System.out.println("Celcius : "+celsius);
    }
}
