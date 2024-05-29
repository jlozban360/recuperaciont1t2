import java.util.Scanner;

public class Ejercicio7
{
    public static void main( String[ ] args ) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt( );

        Integer[ ][ ] arrayInteger = new Integer[ n ][ 2 ];

        //Limpiar buffer
        sc.nextLine( );


        int i = 0;
        while( i < n ) {
            String datoFecha = sc.nextLine( );
            String[ ] auxArray = datoFecha.split( " " );

            int dia = Integer.parseInt( auxArray[ 0 ] );
            int mes = Integer.parseInt( auxArray[ 1 ] );

            arrayInteger[ i ][ 0 ] = dia;
            arrayInteger[ i ][ 1 ] = mes;

            i++;
        }

        int j = 0;
        while( j < n ) {
            System.out.println( diasHasta( arrayInteger[ j ][ 0 ], arrayInteger[ j ][ 1 ] ) );
            j++;
        }

        sc.close( );
    }

    static int diasHasta( int dia, int mes ) {
        int numdias = 0;

        switch( mes ) {
            case 1: numdias += 31;
            case 2: numdias += 28;
            case 3: numdias += 31;
            case 4: numdias += 30;
            case 5: numdias += 31;
            case 6: numdias += 30;
            case 7: numdias += 31;
            case 8: numdias += 31;
            case 9: numdias += 30;
            case 10: numdias += 30;
            case 11: numdias += 31;
            case 12: numdias += 30;
        }

        numdias = numdias - dia + 1;

        return numdias;
    }
}
