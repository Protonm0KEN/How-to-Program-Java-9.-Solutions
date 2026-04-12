package Exercise6_35;

import java.util.Random;
import java.util.Scanner;

public class CAI {
    private static final Random random = new Random();
    public static String getQuestion(int a, int b, String operator){
        return String.format("How much is %d %s %d?", a,operator, b);
    }
    public static int getRandomDigit(){
        return 1+random.nextInt(9);
    }
    public static String getRandomPositiveMessage(){
        int messageNumber = 1+random.nextInt(4);

        return switch (messageNumber) {
            case 1 -> "Very good!";
            case 2 -> "Excellent!";
            case 3 -> "Nice work!";
            case 4 -> "Keep up the good work!";
            default -> "Something went wrong with the system";
        };
    }
    public static String getRandomNegativeMessage(){
        int messageNumber = 1+random.nextInt(4);

        return switch (messageNumber) {
            case 1 -> "No. Please try again.";
            case 2 -> "Wrong. Try once more.";
            case 3 -> "Don't give up!";
            case 4 -> "No. Keep trying.";
            default -> "Something went wrong with the system";
        };
    }
    public static String getOperator(int type){
        int randomOperator = 1+random.nextInt(4);
        switch(type){
            case 1:
                return "+";
            case 2:
                return "-";
            case 3:
                return "*";
            case 4:
                return "/";
            case 5:
                switch (randomOperator) {
                    case 1:
                        return "+";
                    case 2:
                        return "-";
                    case 3:
                        return "*";
                    case 4:
                        return "/";
                }
            default:
                return "Something went wrong with the system";
        }
    }
    public static int getRandomNumber(int a){
        return 1+random.nextInt((int) Math.pow(10,a));
    }


    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Hi my brilliant, today we are going to practice some problems!");
        System.out.print("Choose difficulty level (1-1 digit numbers, 2-2digits...): ");

        int difficultyLevel = input.nextInt();

        System.out.println("Choose type of problems (1 means addition problems only,\n 2 means subtraction problems only,\n 3 means multiplication problems only,\n4 means division problems only and \n5 means a random mixture of all these types: ");

        int type  = input.nextInt();
        if(type == 5 || type == 4){
            System.out.println("Be sure to write answer without rounding up to 2 decimal points only!, thanks!");
        }

        int counterCorrectSolved = 0;
        int counterIncorrectSolved = 0;

        int numberAttempts = 0;

        do{


            int number1 = getRandomNumber(difficultyLevel);
            int number2 = getRandomNumber(difficultyLevel);
            String operator = getOperator(type);
            System.out.println(getQuestion(number1, number2, operator));

            System.out.print("Write the answer: ");

            double correctAnswer;

            switch(operator){
                case "+":
                    correctAnswer = number1+number2;
                    break;
                case "-":
                    correctAnswer = number1-number2;
                    break;
                case "*":
                    correctAnswer = number1*number2;
                    break;
                case "/":
                    correctAnswer = (double) number1 /number2;
                    break;
                default:
                    correctAnswer = 0;
            }


            double answerByUser = input.nextDouble();
            numberAttempts++;

            while (Math.abs(correctAnswer - answerByUser) > 0.01) {
                counterIncorrectSolved++;
                System.out.println(getRandomNegativeMessage());
                System.out.println(getQuestion(number1, number2, operator));
                System.out.print("Write the answer: ");

                answerByUser = input.nextDouble();
                numberAttempts++;
            }

            System.out.println(getRandomPositiveMessage());
            counterCorrectSolved++;


            if(numberAttempts%10 == 0){
                System.out.print("Do you want to continue? (1-yes, 0-no) ");
                int response = input.nextInt();
                if(response == 0){
                    break;
                }
            }
            counterCorrectSolved++;
            numberAttempts++;


        }while(true);

        if((double) counterCorrectSolved /numberAttempts  < 0.75){
            System.out.println("Please ask your teacher for extra help.");
        }else{
            System.out.println("Congratulations, you are ready to go to the next level!");
        }

    }
}
