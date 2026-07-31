class Solution {
    public boolean isHappy(int n) {
        int rem=0;
        while(n>=7){
            int sum=0;
       while(n!=0){
        rem=n%10;
        sum+=(rem*rem);
        n/=10;
       }
       n=sum;
       }
       if(n==1){
        return true;
       }
 else return false;
}
}