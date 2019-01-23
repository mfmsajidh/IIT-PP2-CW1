import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("Duplicates")
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

    private static Integer checkRows(String[][] squareNumbers) {
        Integer valueRow;
        int[] valueRows = new int[3];

        for (int i=0; i<3; i++) {
            int value=0;
            for (int j=0; j<3; j++) {
                value += Integer.parseInt(squareNumbers[i][j]);
            }
            valueRows[i] = value;
        }

        if(valueRows[0] == valueRows[1]) {
            if (valueRows[1] == valueRows[2]) {
                valueRow = valueRows[2];
            }
            else {
                valueRow = null;
            }
        }
        else {
            valueRow = null;
        }
        return valueRow;
    }

    private static Integer checkColumns (String[][] squareNumbers) {
        Integer valueColumn;
        int[] valueColumns = new int[3];

        for(int i=0; i<3; i++) {
            int value=0;
            for(int j=0; j<3; j++) {
                value += Integer.parseInt(squareNumbers[j][i]);
            }
            valueColumns[i] = value;
        }

        if(valueColumns[0] == valueColumns[1]) {
            if(valueColumns[1] == valueColumns[2]){
                valueColumn = valueColumns[2];
            }
            else {
                valueColumn = null;
            }
        }
        else {
            valueColumn = null;
        }
        return valueColumn;
    }

    private static Integer checkDiagonals (String[][] squareNumbers) {

        Integer valueDiagonal;
        int valueDiagonalFirst = 0;
        int valueDiagonalSecond = 0;

        for(int i=0; i<3; i++) {
            valueDiagonalFirst += Integer.parseInt(squareNumbers[i][i]);
        }

        for (int i=0, j=2; (i<3 && j>=0) ; i++, j--){
            valueDiagonalSecond += Integer.parseInt(squareNumbers[i][j]);
        }

        if(valueDiagonalFirst == valueDiagonalSecond){
            valueDiagonal = valueDiagonalFirst;
        }
        else {
            valueDiagonal = null;
        }

        return valueDiagonal;
    }

    private static boolean magicSquare(Integer valueRow, Integer valueColumn, Integer valueDiagonal) {

        boolean isValid;

        if(valueRow!=null && valueColumn!=null & valueDiagonal!=null){
            if((valueRow.equals(valueColumn)) && (valueColumn.equals(valueDiagonal))){
                System.out.println("YEAH!!!! It is a Magic Square");
                isValid = true;
            }
            else {
                System.out.println("Oops!!!! Not a Magic Square");
                isValid = false;
            }
        }
        else {
            System.out.println("Oops!!!! Not a Magic Square");
            isValid = false;
        }
        return isValid;
    }

    private static void loShuSquare(String[][] squareNumbers, boolean isValid){

        int[] squareValues = new int[9];
        int countRange = 0;
        int countDuplicate = 0;

        if(isValid){

                int squareValue = 0;
                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        squareValue = Integer.parseInt(squareNumbers[i][j]);
                        if(!(squareValue>0 && squareValue<10)){
                            countRange++;
                        }
                    }
                }
//                squareValues[x] = squareValue;

//            for (int i=0; i<10; i++){
//                for (int j=i+1; j<=squareValues.length; j++){
//                    if(squareValues[i] == squareValues[j]){
//                        countDuplicate++;
//                    }
//                }
//            }
            if(countRange>0 || countDuplicate>0){
                System.out.println("Oops!!!! Not a Lo Shu Square");
            }
        }
        else{
            System.out.println("Oops!!!! Not a Lo Shu Square");
        }
    }

    private static boolean repeatAgain(boolean repeat){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you wish to enter a new square? (y/n): ");

        try {
            char reply = scanner.next(".").charAt(0);
            reply = Character.toLowerCase(reply);

            System.out.println(reply);

//            if(reply=='y'){
//                repeat = true;
//            }
//            else if (reply=='n'){
//                System.out.println("\n" + "Thank you for playing the game!");
//            }
//            else {
//                System.out.println("Invalid Input. Please try again.");
//            }
        }
        catch(Exception e){
            System.out.println("Invalid Input. Please try again.");

        }

        return repeat;
    }

    public static void main(String[] args) {

        boolean repeat=false;

        do {
            //Calls the getValues method and returns the multidimensional array
            String[][] squareNumbers = getValues();

            //Calls the displaySquare method
            displaySquare(squareNumbers);

            //Calls the checkRows method
            Integer valueRow = checkRows(squareNumbers);

            //Calls the checkColumns method
            Integer valueColumn = checkColumns(squareNumbers);

            //Calls the checkDiagonals method
            Integer valueDiagonal = checkDiagonals(squareNumbers);

            //Calls the magicSquare method
            boolean isValid = magicSquare(valueRow, valueColumn, valueDiagonal);

            //Calls the loShuSquare method
            loShuSquare(squareNumbers, isValid);

            //Calls the repeatAgain method
            repeat = repeatAgain(repeat);

        } while (repeat);

    }
}
