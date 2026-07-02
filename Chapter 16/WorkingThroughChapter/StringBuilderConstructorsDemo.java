public class StringBuilderConstructorsDemo {
    public static void main(String[] args){
        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder(10);
        StringBuilder string3 = new StringBuilder("hello");

        System.out.printf( "s1 = %s\ns2 = %s\ns3 = %s\n\n", string1, string2, string3);
    }
}
