class CheckColumns {

    static Integer checkColumns (String[][] squareNumbers) {
        Integer valueColumn;
        int[] valueColumns = new int[3]; //Array to assign the value of each column

        //Iterates through each column value of squareNumbers[][] and assigns the total to the valueColumns[]
        for(int i=0; i<3; i++) {
            int value=0;
            for(int j=0; j<3; j++) {
                value += Integer.parseInt(squareNumbers[j][i]);
            }
            valueColumns[i] = value;
        }

        //Checks if the column values are equal
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
        return valueColumn; //Returns null if not equal, returns the value if equal
    }

}
