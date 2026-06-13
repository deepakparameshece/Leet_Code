import java.util.*;
public class Solution{
    public boolean isValid(String str){
        while(str.length() !=0){
            if(str.contains("()"))
                str=str.replace("()","");
            else if(str.contains("[]"))
                str=str.replace("[]","");
            else if(str.contains("{}"))
                str=str.replace("{}","");
            else
                return false;
            
        }
        return true;
    }
}