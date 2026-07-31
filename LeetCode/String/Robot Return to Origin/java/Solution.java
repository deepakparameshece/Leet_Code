class Solution {
    public boolean judgeCircle(String moves) {
        int l=0;
        int x=0;
        int y=0;
        int u=0;
        int d=0;
        int r=0;
        for(int i=0;i<moves.length();i++){
            char a= moves.charAt(i);
            if(a=='U') {
               u=1;
               x++;
            }
            else if(a=='D'){
                d=-1;
                x--;
            }
            else if(a=='L'){
                l=-1;
                y--;
            }
            else if(a=='R'){
                r=1;
                y++;
            }
        }
        return x==0 && y==0;
        
    }
}