// NIM - Your Name
// NIM - Your Name
import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String judulbuku;
        double jumlahbuku;
        
        jumlahbuku = 0;
        double hargabuku;
        
        hargabuku = 0;
        double minimumprice;
        
        minimumprice = 1000;
        do {
            hargabuku = Double.parseDouble(input.nextLine());
            if (hargabuku == 0) {
            } else {
                if (minimumprice < hargabuku) {
                } else {
                    minimumprice = hargabuku;
                }
                jumlahbuku = jumlahbuku + hargabuku;
            }
        } while (hargabuku != 0);
        if (jumlahbuku >= 100) {
            jumlahbuku = jumlahbuku - minimumprice;
        } else {
            jumlahbuku = jumlahbuku;
        }
        System.out.println(toFixed(jumlahbuku,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
