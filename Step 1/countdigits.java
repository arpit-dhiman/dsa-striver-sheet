public class Solution {
    public static int countDigits(int n){
  int num = n;
  int cnt=0;

  int ltd;

  while(n>0)
  {
      ltd = n%10;

      if(ltd!=0 && num%ltd==0)
      {
          cnt++;
      }

      n=n/10;
  }

   return cnt;
}}