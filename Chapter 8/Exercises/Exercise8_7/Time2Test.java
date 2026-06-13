package Exercise8_7;

// Fig. 8.6: Time2Test.java
// Overloaded constructors used to initialize Time2 objects.

public class Time2Test
{
    public static void main( String[] args )
    {
        Time2 t4 = new Time2( 23, 59, 59 ); // 12:25:42

        System.out.println( "t4: hour, minute and second specified" );
        System.out.printf( " %s\n", t4.toUniversalString() );
        System.out.printf( " %s\n", t4.toString() );
//
//        t4.tick();
//        System.out.println( "t4: hour, minute and second specified" );
//        System.out.printf( " %s\n", t4.toUniversalString() );
//        System.out.printf( " %s\n", t4.toString() );
//
//        t4.incrementMinute();
//        System.out.println( "t4: hour, minute and second specified" );
//        System.out.printf( " %s\n", t4.toUniversalString() );
//        System.out.printf( " %s\n", t4.toString() );

        t4.incrementHour();
        System.out.println( "t4: hour, minute and second specified" );
        System.out.printf( " %s\n", t4.toUniversalString() );
        System.out.printf( " %s\n", t4.toString() );
    } // end main
} // end class Time2Test