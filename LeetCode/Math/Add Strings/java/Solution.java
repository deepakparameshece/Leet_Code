class Solution 
{
    public String addStrings(String num1, String num2) 
    {
        int sum = 0,carry = 0;
        int x=0,y=0;
        int i = num1.length()-1, j = num2.length()-1;
        StringBuilder res = new StringBuilder();
        while(i>=0 || j>=0 ||carry!=0)
        {
            x = i>=0?num1.charAt(i)-'0':0;
            y = j>=0?num2.charAt(j)-'0':0;
            sum = x+y+carry;
            carry = sum/10;
            res.append(sum%10);
            i--; j--;
        }

        return res.reverse().toString();
    }
}