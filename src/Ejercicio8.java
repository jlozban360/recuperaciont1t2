import java.util.Scanner;

public class Ejercicio8
{
    public static void main( String[ ] args ) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt( );

        Integer[ ] arrayInteger = new Integer[ n ];

        //Limpiar buffer
        sc.nextLine( );

        int i = 0;
        while( i < n ) {
            int datoEntradea = sc.nextInt( );

            arrayInteger[ i ] = datoEntradea;

            i++;
        }

        int j = 0;
        while( j < n ) {
            System.out.println( fotocopiasNeeded( arrayInteger[ j ] ) );
            j++;
        }

        sc.close( );
    }

    static int fotocopiasNeeded( int dato ) {
        int resultado = 0;
        int counter = 0;

        while( resultado < dato ) {
            resultado += 2 * resultado;
            counter++;
        }

        return counter;
    }
}
