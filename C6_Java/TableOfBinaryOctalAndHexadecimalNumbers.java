package C6_Java;

public class TableOfBinaryOctalAndHexadecimalNumbers {


    public static final int BIN_BASE = 2 ;
    public static final String HEX_BASE = "Hexa" ;
    public static final int OCT_BASE = 8 ;

    public static void main ( String[] args ) {

        int bin ;

        System.out.println ( "Binary\t\tOctal\t\tHexadecimal" );

        for ( int i = 1 ; i <= 256 ; i++ ){
            bin = convertToBin ( i ) ;
            System.out.printf ( "%10d\t" , bin ) ;
            System.out.printf ( "%10s\t" , convertToBase ( bin , OCT_BASE ) ) ;
            System.out.printf ( "%10s\n" , convertToBase ( bin, HEX_BASE ) ) ;
        }

    }

    public static String convertToBase ( int convert , String base ) {

        String hex = "" ;
        int bin = convert ;

        do {
            hex = switch (bin % 10000) {
                case 0 -> '0' + hex;
                case 1 -> '1' + hex;
                case 10 -> '2' + hex;
                case 11 -> '3' + hex;
                case 100 -> '4' + hex;
                case 101 -> '5' + hex;
                case 110 -> '6' + hex;
                case 111 -> '7' + hex;
                case 1000 -> '8' + hex;
                case 1001 -> '9' + hex;
                case 1010 -> 'A' + hex;
                case 1011 -> 'B' + hex;
                case 1100 -> 'C' + hex;
                case 1101 -> 'D' + hex;
                case 1110 -> 'E' + hex;
                default -> 'F' + hex;
            };

            bin /= 10000 ;

        } while ( bin > 0 ) ;

        return hex ;
    }

    public static int convertToBase ( int convert , int base ){

        int factor = 1 ;
        int bin = convert ;
        int oct = 0 ;

        do {

            switch ( bin % 1000 ) {

                case 0 :
                    break ;
                case 1 :
                    oct += factor;
                    break ;
                case 10 :
                    oct += factor * 2 ;
                    break ;
                case 11 :
                    oct += factor * 3 ;
                    break ;
                case 100 :
                    oct += factor * 4 ;
                    break ;
                case 101 :
                    oct += factor * 5 ;
                    break ;
                case 110 :
                    oct += factor * 6 ;
                    break ;
                default :
                    oct += factor * 7 ;
                    break ;

            }

            bin /= 1000 ;

            factor *= 10 ;

        } while ( bin > 0 ) ;

        return oct ;

    }

    public static int convertToBin ( int original ) {

        int bin = 0 ;
        int sum = 0 ;
        int exponent = 0 ;

        while ( sum < original ){

            sum += Math.pow ( 2 , exponent ) ;
            exponent ++ ;
            bin *= 10 ;
            bin ++ ;

        }

        while ( sum > original && exponent >= 0 ){

            if ( sum - Math.pow ( 2 , exponent ) >=  original ) {

                sum -= Math.pow ( 2 , exponent ) ;
                bin -= Math.pow ( 10 , exponent ) ;

            }

            exponent-- ;

        }

        return bin ;

    }

}
