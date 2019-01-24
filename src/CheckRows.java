class CheckRows {

    static Integer checkRows(String[][] squareNumbers) {
        Integer valueRow;
        int[] valueRows = new int[3]; //Array to assign the value of each row

        //Iterates through each row value of squareNumbers[][] and assigns the total to the valueRows[]
        for (int i=0; i<3; i++) {
            int value=0;
            for (int j=0; j<3; j++) {
                value += Integer.parseInt(squareNumbers[i][j]);
            }
            valueRows[i] = value;
        }

        //Checks if the row values are equal
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
        return valueRow; //Returns null if not equal, returns the value if equal
    }

}
