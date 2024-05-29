import java.util.Scanner;

public class Ejercicio2
{
    public static void main( String[ ] args ) {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Introduce el primer número: " );
        int n1 = sc.nextInt( );

        System.out.println( "Introduce el segundo número: " );
        int n2 = sc.nextInt( );

        System.out.println( "Introduce el tercer número: " );
        int n3 = sc.nextInt( );

        System.out.println( maximo3( n1, n2, n3 ) );

        sc.close( );
    }

    static int maximo3( int num1, int num2, int num3 ) {
            return num1 > num2 ? num1 : num2 > num3 ? num2 : num3;
    }
}
