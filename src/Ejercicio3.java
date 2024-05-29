import java.util.Scanner;

public class Ejercicio3
{
    public static void main( String[ ] args ) {
        Scanner sc = new Scanner( System.in );

        double x1 = sc.nextDouble( );
        double y1 = sc.nextDouble( );
        double x2 = sc.nextDouble( );
        double y2 = sc.nextDouble( );

        System.out.printf( "%.02f", distancia( x1, y1, x2, y2 ) );

        sc.close( );
    }

    public static double distancia( double x1, double y1, double x2, double y2 ) {
        return Math.sqrt( Math.pow( x1 - x2 , 2 ) + Math.pow( y1 - y2 , 2 ) );
    }
}
