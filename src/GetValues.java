import java.util.Scanner;

class GetValues {

    static String[][] getValues() {
        Scanner scanner = new Scanner(System.in); //Imports the Scanner utility as scanner

        String[][] squareNumbers = new String[3][3]; //Declaring and initiating a multidimensional array
        int count = 1; //Variable to count the number of inputs

        for (int i=0; i<3 ; i++) {
            for (int j=0; j<3; j++) {
                boolean notValid; //Variable to validate the inputs from the user

                // Do-While repeats until the user inputs a valid integer
                do {
                    System.out.print("Enter number " + (count) + ": ");
                    String squareNumber = scanner.nextLine();

                    //Exceptions to handle the integer check
                    try{
                        Integer.parseInt(squareNumber); //Checks whether the input is an integer
                        notValid = false;
                        squareNumbers[i][j] = squareNumber; //If validated without an error, assigns the input into the multidimensional array
                        count++;

                    }
                    //NumberFormatException occurs while converting a String to a numeric value
                    catch(NumberFormatException ex){
                        System.out.println("Sorry, I can't accept that." + "\n" + "It's not a valid number!!!" + "\n");
                        notValid = true;
                    }
                } while (notValid); //Exits if notValid is false
            }
        }
        return squareNumbers; //returns the values
    }

}
