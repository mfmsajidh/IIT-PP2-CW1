public class Main {

    public static void main(String[] args) {
        boolean repeat = false; //Variable to initiate the while loop for the repeatAgain method

        do {
            //Calls the getValues method and returns the multidimensional array
            String[][] squareNumbers = GetValues.getValues();

            //Displays the input values in a square
            DisplaySquare.displaySquare(squareNumbers);

            //Calls the checkRows method
            Integer valueRow = CheckRows.checkRows(squareNumbers);

            //Calls the checkColumns method
            Integer valueColumn = CheckColumns.checkColumns(squareNumbers);

            //Calls the CheckDiagonals method
            Integer valueDiagonal = CheckDiagonals.checkDiagonals(squareNumbers);

            //Calls the magicSquare method
            boolean isValid = MagicSquare.magicSquare(valueRow, valueColumn, valueDiagonal);

            //Calls the singleArray method to convert the Multi Dimensional Array
            String[] singleSquareNumbers = SingleArray.singleArray(squareNumbers);

            //Calls the checkRange method
            boolean inRange = CheckRange.checkRange(singleSquareNumbers);

            //Calls the checkDuplicates method
            boolean noDuplicates = CheckDuplicates.checkDuplicates(singleSquareNumbers);

            //Calls the loShuSquare method
            LoShuSquare.loShuSquare(isValid, inRange, noDuplicates);

            //Calls the repeatAgain method
            repeat = RepeatAgain.repeatAgain(repeat);

        } while (repeat); //Repeats until user enters (n) or (N) from the repeatAgain method
    }























}
