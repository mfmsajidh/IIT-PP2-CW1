import java.util.Arrays;
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

        System.out.println();
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

    private static String[] singleArray(String[][] squareNumbers){
        String[] singleSquareNumbers = new String[9];

        for(int x=0; x<9;) {
            for (int i=0; i<squareNumbers.length; i++){
                for(int j=0; j<squareNumbers.length; j++) {
                    singleSquareNumbers[x] = squareNumbers[i][j];
                    x++;
                }
            }
        }
        return singleSquareNumbers;
    }

    private static boolean checkRange(String[] singleSquareNumbers) {
        int countRange = 0;

        for(int i=0; i<singleSquareNumbers.length; i++) {
            if(!((Integer.parseInt(singleSquareNumbers[i])>0) && (Integer.parseInt(singleSquareNumbers[i])<10))){
                countRange++;
            }
        }

        if(countRange>0){
            return false;
        }
        else{
            return true;
        }
    }

    private static boolean checkDuplicates(String[] singleSquareNumbers) {
        int countDuplicate = 0;

        for (int i=0; i<singleSquareNumbers.length; i++) {
            for (int j=i+1; j<singleSquareNumbers.length; j++) {
                if(singleSquareNumbers[i].equals(singleSquareNumbers[j])) {
                    countDuplicate++;
                }
            }
        }

        if(countDuplicate>0){
            return false;
        }
        else{
            return true;
        }
    }

    private static void loShuSquare(boolean isValid, boolean inRange, boolean noDuplicates){
        if(isValid && inRange && noDuplicates){
            System.out.println("YEAH!!!! It is a Lo Shu Square also");
        }
        else {
            System.out.println("Oops!!!! Not a Lo Shu Square");
        }

    }

    private static boolean repeatAgain(boolean repeat){

        Scanner scanner = new Scanner(System.in);

        boolean isNotValid = true;

        while(isNotValid){
            System.out.print("\n" + "Do you wish to enter a new square? (y/n): ");

            String reply = scanner.nextLine();

            if(reply.equals("y") || reply.equals("Y")) {
                repeat = true;
                isNotValid = false;
            }
            else if (reply.equals("n") || reply.equals("N")) {
                System.out.println("Thank you for playing the game");
                System.out.println("See you again !!!");
                repeat = false;
                isNotValid = false;
            }
            else {
                System.out.println("Sorry, I can't accept that." + "\n" + "It's not a valid input!!!");
            }
        }

        return repeat;

    }

    public static void main(String[] args) {

        boolean repeat = false;

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

            //Calls the singleArray method to convert the Multi Dimensional Array
            String[] singleSquareNumbers = singleArray(squareNumbers);

            //Calls the checkRange method
            boolean inRange = checkRange(singleSquareNumbers);

            //Calls the checkDuplicates method
            boolean noDuplicates = checkDuplicates(singleSquareNumbers);

            //Calls the loShuSquare method
            loShuSquare(isValid, inRange, noDuplicates);

            //Calls the repeatAgain method
            repeat = repeatAgain(repeat);

        } while (repeat);

    }
}
