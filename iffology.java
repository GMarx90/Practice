/*Given two temperatures, return true if one is less than 0 and the other is greater than 100.


icyHot(120, -1) › true
icyHot(-1, 120) › true
icyHot(2, 120) › false*/

public boolean icyHot(int temp1, int temp2) {
  if((temp1<0&&temp2>100)||(temp2<0&&temp1>100))
  {return true;
  }
  else
  {return false;
  }
  
}


/*
Given 2 int values, return true if either of them is in the range 10..20 inclusive.


in1020(12, 99) › true
in1020(21, 12) › true
in1020(8, 99) › false*/

public boolean in1020(int a, int b) {
  if(((a>=10&&a<=20)||(b<=10&&b>=20))||((b>=10&&b<=20)||(a<=10&&a>=20))){
    return true;
  }
  else {
    return false;}
  }



/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
*/


public boolean hasTeen(int a, int b, int c) {

  return (a>=13 && a<=19) ||
         (b>=13 && b<=19) ||
         (c>=13 && c<=19);
}

