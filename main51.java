public class Main {
    public static void main(String[] args) {
        double temperaturaC = 25;
        double temperaturaF = celsiusNaFahrenheit(temperaturaC);
        System.out.println(temperaturaC + " stopni Celsjusza to " + temperaturaF + " stopni Fahrenheita.");
    }

    public static double celsiusNaFahrenheit(double temperaturaC) {
        double temperaturaF = (temperaturaC * 9/5) + 32;
        return temperaturaF;
    }
}
