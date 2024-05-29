public class Ejercicio5
{
    public static void main( String[ ] args ) {
        for( int i = 2; i <= 10; i+=2 ) {
            System.out.println( i );
        }

        int j = 2;
        while( j <= 10 ) {
            System.out.println( j );
            j += 2;
        }


        int k = 2;
        do {
            System.out.println( k );
            k += 2;
        } while( k <= 10 );
    }
}
