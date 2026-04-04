package Exercise7_10;

/*
* 7.10 (Sales Commissions) Use a one-dimensional array to solve the following problem: A company pays its salespeople on a commission basis.
* The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a salesperson who grosses $5000 in sales in a week receives $200 plus 9% of $5000, or a total of $650.
* Write an application (using an array of counters) that determines how many of the salespeople earned salaries in each of the following ranges (assume that each salesperson’s salary is truncated to an integer amount):
a) $200–299
b) $300–399
c) $400–499
d) $500–599
e) $600–699
f) $700–799
g) $800–899
h) $900–999
i) $1000 and over
Summarize the results in tabular format.*/

/*
* I used integer division to get first digit of the commisioned sales such that i can implement ranges logic more easily
*
* */

import java.util.Scanner;

public class SalesCommissions {
    static void main() {

        //Welcoming user to the app
        System.out.println("Hi, and welcome to the app that computes sales commisions");
        Scanner input = new Scanner(System.in);

        //Array that stores frequencies of sales by commissions
        int[] rangesArray = new int[10];
        double userInput; //input variable to store users input

        int personCounter = 1;//to keep track of the person

        do{
            System.out.printf("\nEnter -1 to exit or enter nonnegative value for sales person %d:", personCounter);
            userInput = input.nextDouble();

            if(userInput>=0){
                double computedSalesWithCommission = 200+userInput*0.09;
                int index = (int) (computedSalesWithCommission / 100);
                if (index >= 10) {
                    rangesArray[9]++; // Put $1000 and over in the last slot
                } else if (index >= 2) {
                    rangesArray[index - 1]++; // Shift so $200 is index 1, $300 is index 2...
                }
                personCounter++;
            }
        }while(userInput >=0);



        for(int i = 2; i<=10; i++){
            if(i < 10){
                System.out.printf("%d00-%d99: %d", i, i, rangesArray[i]);
            }else{
                System.out.printf("1000 and over: %d", rangesArray[9]);
            }
            System.out.println();
        }
    }
}
