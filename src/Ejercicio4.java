import java.util.Random;

public class Ejercicio4
{
    public static void main( String[ ] args ) {
        Random r = new Random( );

        int valorRandom = 0;
        int counter = 0;
        while( valorRandom < 15 ) {
            valorRandom = r.nextInt( 40 ) - 20;

            if( esMultiplo3( valorRandom ) ) {
                System.out.println( valorRandom );
                counter++;
            }
        }


        if( counter == 0 )
            System.out.println( "NINGUNO" );
    }

    static boolean esMultiplo3( int valorRandom ) {
        return valorRandom % 3 == 0;
    }

}
