class Solution {
    public String convert(String s, int numRows) {
    if(numRows == 1 || s.length()<= numRows) return s;
    String[] rows = new String [numRows];
    for(int i=0; i<numRows;i++){
        rows[i]= "";
    }
    int currentRow = 0;
    boolean goingDown=false;
    for(char ch:s.toCharArray()){
        rows[currentRow] += ch;
        if(currentRow ==0 || currentRow == numRows-1){
            goingDown = !goingDown;
        }
        currentRow +=goingDown ? 1:-1;}
    String result ="";
    for (String row : rows){
        result += row;
    }
    result row;
    }
    }
}