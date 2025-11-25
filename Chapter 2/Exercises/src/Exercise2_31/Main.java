package Exercise2_31; //package declaration of package Exercise2_31

//Squares and Cubes
//This application prints a table of the squares and cubes of the numbers 0 through 10.

//class declaration of class Main
public class Main { //Beginning of class Main body
    // Method main definition
    static void main(String[] args) { //beginning of method main body
        //Printing the table header, separated by tabs
        System.out.println("number\tsquare\tcube");

        //Row 0: 0^2=0, 0^3=0
        System.out.printf("%d\t\t%d\t\t%d\n", 0, 0, 0);
        //Row 1: 1^2=1, 1^3=1
        System.out.printf("%d\t\t%d\t\t%d\n", 1, 1, 1);
        //Row 2: 2^2=4, 2^3=8
        System.out.printf("%d\t\t%d\t\t%d\n", 2, 4, 8);
        //Row 3: 3^2=9, 3^3=27
        System.out.printf("%d\t\t%d\t\t%d\n", 3, 9, 27);

        //Row 4: 4^2=16, 4^3=64
        System.out.printf("%d\t\t%d\t\t%d\n", 4, 16, 64);
        //Row 5: 5^2=25, 5^3=125
        System.out.printf("%d\t\t%d\t\t%d\n", 5, 25, 125);
        //Row 6: 6^2=36, 6^3=216
        System.out.printf("%d\t\t%d\t\t%d\n", 6, 36, 216);
        //Row 7: 7^2=49, 7^3=343
        System.out.printf("%d\t\t%d\t\t%d\n", 7, 49, 343);
        //Row 8: 8^2=64, 8^3=512
        System.out.printf("%d\t\t%d\t\t%d\n", 8, 64, 512);
        //Row 9: 9^2=81, 9^3=729
        System.out.printf("%d\t\t%d\t\t%d\n", 9, 81, 729);
        //Row 10: 10^2=100, 10^3=1000
        System.out.printf("%d\t\t%d\t\t%d\n", 10, 100, 1000);

    } //end of method main body
} //end of class Main body