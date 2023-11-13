import java.text.DecimalFormat;

public class CalculoDiarias {

    public static String calculo(int dias,int km, double diaria){

        DecimalFormat formato = new DecimalFormat("#.##");
        double total;
        String totalFormatado;

        if (km <= 100) {
            total = dias * diaria;
            return totalFormatado = formato.format(total);
        } else {
            total = dias * (diaria + diaria);
            return totalFormatado = formato.format(total);
        }
    }
}
