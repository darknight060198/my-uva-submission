
import java.math.BigInteger;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DarKnight98
 */
public class p763 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger[] f = new BigInteger[110];
        f[ 0 ] = BigInteger.ONE;
        f[ 1 ] = BigInteger.valueOf( 2 );
        for (int i=2; i<110; i++)
            f[ i ] = f[ i-1 ].add( f[i-2] );
        boolean space = false;
        while ( input.hasNext() )
        {
            String n = input.next();
            BigInteger N = BigInteger.ZERO;
            for (int i=0; i<n.length(); i++)
                if ( n.charAt( i ) == '1' )
                    N = N.add( f[ n.length() - i - 1 ] );
            
            n = input.next();
            for (int i=0; i<n.length(); i++)
                if ( n.charAt( i ) == '1' )
                    N = N.add( f[ n.length() - i - 1 ] );
            
            if ( space ) System.out.println();
            space = true;
            
            if ( N.compareTo( BigInteger.ZERO ) == 0 )
            {
                System.out.println("0");
                continue;
            }
            
            boolean flag = false;
            for (int i=109; i>=0; i--)
            {
                if ( N.compareTo( f[i] ) >= 0 )
                {
                    System.out.print("1");
                    N = N.subtract( f[i] );
                    flag = true;
                }
                else if ( flag ) System.out.print("0");
            }
            System.out.println();
        }
    }
    
}
