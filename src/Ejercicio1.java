import java.util.Scanner;

public class Ejercicio1
{
    public static void main( String[ ] args ) {
        Scanner sc = new Scanner( System.in );

        System.out.println( "Precio del regalo: " );
        int valorPrecio = sc.nextInt( );

        System.out.println( "IVA aplicado: " );
        int valorIva = sc.nextInt( );

        double valorTotal = valorPrecio + ( ( double ) ( valorPrecio * valorIva ) / 100 );
        System.out.println( "Una vez sumado el IVA el precio final es: " + valorTotal  );

        System.out.println( "Número de amigos que van a participar en la compra del regalo: " );
        int numAmigos = sc.nextInt( );

        double aportacion = valorTotal / numAmigos;
        System.out.println( "Cada amigo tiene que aportar: " + aportacion );

        sc.close( );
    }
}
