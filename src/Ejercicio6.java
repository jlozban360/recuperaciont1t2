import javax.swing.*;
import java.util.Scanner;

public class Ejercicio6
{
    public static void main( String[ ] args ) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt( );

        if( n >= 2 && n % 2 == 0 )
            imprimirTablero( n );
        else
            System.out.println( "ERROR" );

        sc.close( );
    }

    static void imprimirTablero( int n ) {
        for( int i = 0; i < n; i++ ) {
            for( int j = 0; j < n; j++) {
                if( i % 2 == 0 )
                    System.out.print( "*." );
                else
                    System.out.print( ".*" );
            }

            System.out.println( );
        }
    }
}
