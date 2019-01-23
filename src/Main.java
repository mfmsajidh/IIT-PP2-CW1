import java.util.Scanner;

public class Main {

    private static String[][] getValues() {
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
                    catch(NumberFormatException ex){
                        System.out.println("Sorry, I can't accept that." + "\n" + "It's not a valid number!!!" + "\n");
                        notValid = true;
                    }
                } while (notValid); //Exits if notValid is false
            }
        }
        return squareNumbers; //returns the values
    }

    private static void displaySquare(String[][] squareNumbers) {
        System.out.println();

        //Displays the user input by looping through the multidimensional array
        for (int i=0; i<squareNumbers.length;i++) {
            for (int j=0; j<3; j++) {
                System.out.print(squareNumbers[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static boolean checkRows(String[][] squareNumbers) {
        int valueRow;
        int[] valueRows = new int[3];
        boolean valueCheckRow;

        for (int i=0; i<3; i++) {
            int value=0;
            for (int j=0; j<3; j++) {
                value += Integer.parseInt(squareNumbers[i][j]);
            }
            valueRows[i] = value;
        }

        if(valueRows[0] == valueRows[1]) {
            valueRow = valueRows[0];
            if (valueRow == valueRows[2]) {
                return valueCheckRow = true;
            }
            else {
                return valueCheckRow = false;
            }
        }
        else {
            return valueCheckRow = false;
        }

    }

    private static boolean checkColumns (String[][] squareNumbers) {
        int valueColumn;
        boolean valueCheckColumn;
        int[] valueColumns = new int[3];

        for(int i=0; i<3; i++) {
            int value=0;
            for(int j=0; j<3; j++) {
                value += Integer.parseInt(squareNumbers[j][i]);
            }
            valueColumns[i] = value;
        }

        if(valueColumns[0] == valueColumns[1]) {
            valueColumn = valueColumns[0];
            if(valueColumn == valueColumns[2]){
                return valueCheckColumn = true;
            }
            else {
                return valueCheckColumn = false;
            }
        }
        else {
            return valueCheckColumn = false;
        }

    }

    private static boolean checkDiagonals (String[][] squareNumbers) {

        int valueDiagonal;
        boolean valueCheckDiagonal;
        int[] valueDiagonals = new int[2];
    }

    public static void main(String[] args) {

        //Calls the getValues method and returns the multidimensional array
        String[][] squareNumbers = getValues();

        //Calls the displaySquare method
        displaySquare(squareNumbers);

        //Calls the checkRows method
        boolean valueCheckRow = checkRows(squareNumbers);

        //Calls the checkColumns method
        boolean valueCheckColumn = checkColumns(squareNumbers);

        //Calls the checkDiagonals method
        boolean valueCheckDiagonal = checkDiagonals(squareNumbers);
        



//        int magicValue = checkRows(squareNumbers);
//        System.out.println(magicValue);
//        checkMagicRows(magicValue, squareNumbers);

//        System.out.println("\n" + "Is Magic Square: "+ checkRows(squareNumbers));
//        System.out.println("Is Lo Shu Square: ");

        System.out.println("\n" + "Thank you for playing the game!");

    }
}
