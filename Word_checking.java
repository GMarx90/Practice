/*
Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") › true
startHi("hi") › true
startHi("hello hi") › false*/

public boolean startHi(String str) {
  
  str=str.toLowerCase();

  if (str.length()>=2){
  String check="hi";
  String a=str.substring(0,2);
  if (a.equals(check)){
  return true ;
}
else {
  return false;
}
}

else {
  return false;}
}

/*
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.


delDel("adelbc") › "abc"
delDel("adelHello") › "aHello"
delDel("adedbc") › "adedbc"*/

public String delDel(String str) {
  int a= str.length();
  
  String check="del";
    if (a>=4&&str.substring(1,4).equals(check))
  {return str=str.charAt(0)+str.substring(4,a);}
  else {return str;}
}


/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


mixStart("mix snacks") › true
mixStart("pix snacks") › true
mixStart("piz snacks") › false*/


public boolean mixStart(String str) {
  String a="ix";
  int b= str.length();
  if((b>=3)&&(str.substring(1,3).equals(a))){
    return true;}
  else{return false;}
  
}


/*
Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.


extraEnd("Hello") › "lololo"
extraEnd("ab") › "ababab"
extraEnd("Hi") › "HiHiHi"*/

public String extraEnd(String str) {
 int a =str.length();
 int j =a-1;
 int i =a-2;
  return (3*(str.substring(i))+
  (str.substring(i))+(str.substring(i)));
  
}
