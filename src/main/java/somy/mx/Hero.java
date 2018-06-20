package somy.mx;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hero {
	public static void main(String[] args) {
         String a[]=new String[100];
         for(int i=0;i<a.length;i++){
        	 a[i]=randomString(2);
         }
         int z=0;
         for (String ss:a){
        	 System.out.println(ss);
        	 z++;
        	 if(z==10){
        		 System.out.println();
        		 z=0;
     
        		 
        	 }
         }
         int x=0;
         for(int i=1;i<a.length;i++){
         for(int j=1;j<a.length-1;j++){
        	 if(i==j){
        		 break;
        	 }else if(a[i].equals(a[j])){
        		 x++;
        		 System.out.println("重复的字符串一共有"+x+"种,他们分别是"+a[i]);
        	 }
         }
        }
    }

	public static String randomString(int length){
        char s[]=new char[length];
        for (int i = 0; i < s.length; i++) {
            char c=(char)((Math.random()*(126-33))+33);
            if(Character.isLetter(c)||Character.isDigit(c)){
                s[i]=c;
            }
            else{
                i--;
            }
        }
        String result=Arrays.toString(s);
        return result;
    }
}