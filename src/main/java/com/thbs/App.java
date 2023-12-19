package com.thbs;

/**
 * Hello world!
 *
 */
public class App 
{

    public boolean testmethod(String str){
        if(str.length()<2){
        return false;
        }
        else if(str.length()==2){
         return true;
        }
        else if(str.length()>2){
            String str1=str.substring(0,2);
            String str2=str.substring(str.length()-2);
            return str1.equals(str2);        }
       
        else{
            return false;
        }
        






    }
}
