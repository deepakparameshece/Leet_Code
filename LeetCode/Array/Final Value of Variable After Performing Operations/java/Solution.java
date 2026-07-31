class Solution {
    public int finalValueAfterOperations(String[] str) {
        int x=0;
        for(String i:str){
            if(i.equals("--X") || i.equals("X--")) x--;
            else if (i.equals("++X") || i.equals("X++")) x++;
        }
        return x;
    }
}