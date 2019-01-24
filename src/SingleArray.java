class SingleArray {

    static String[] singleArray(String[][] squareNumbers){
        String[] singleSquareNumbers = new String[9];

        //Iterates through squareNumbers[][] to convert it to singleSquareNumbers[] array (from multidimensional array to a single array)
        for(int x=0; x<9;) {
            for (int i=0; i<squareNumbers.length; i++){
                for(int j=0; j<squareNumbers.length; j++) {
                    singleSquareNumbers[x] = squareNumbers[i][j];
                    x++;
                }
            }
        }
        return singleSquareNumbers; //Returns the singleSquareNumbers[] array
    }

}
