class CheckDiagonals {

    static Integer checkDiagonals (String[][] squareNumbers) {
        Integer valueDiagonal;
        int valueDiagonalFirst = 0; //To assign the value of the first type of diagonal
        int valueDiagonalSecond = 0; //To assign the value of the second type of diagonal

        //Iterates through each diagonal value of squareNumbers[][] and assigns the total to the valueDiagonalFirst
        for(int i=0; i<3; i++) {
            valueDiagonalFirst += Integer.parseInt(squareNumbers[i][i]);
        }

        //Iterates through each diagonal value of squareNumbers[][] and assigns the total to the valueDiagonalSecond
        for (int i=0, j=2; (i<3 && j>=0) ; i++, j--){
            valueDiagonalSecond += Integer.parseInt(squareNumbers[i][j]);
        }

        //Checks if the diagonal values are equal
        if(valueDiagonalFirst == valueDiagonalSecond){
            valueDiagonal = valueDiagonalFirst;
        }
        else {
            valueDiagonal = null;
        }
        return valueDiagonal; //Returns null if not equal, returns the value if equal
    }
}
