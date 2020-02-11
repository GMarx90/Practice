/*Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.


firstLast6([1, 2, 6]) › true
firstLast6([6, 1, 2, 3]) › true
firstLast6([13, 6, 1, 2, 3]) › false*/


public boolean firstLast6(int[] nums) {
    int i = nums.length;
    if(i>1){
  if ((nums[0]==6||nums[i-1]==6)){
    return true;}
  else{return false;
  }
}
else if(nums[0]==6){
   return true;}

else {return false;}
}

/*
Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.


sameFirstLast([1, 2, 3]) › false
sameFirstLast([1, 2, 3, 1]) › true
sameFirstLast([1, 2, 1]) › true*/

public boolean sameFirstLast(int[] nums) {
  
  
  int i =nums.length;
  if (i>=1){
    if (nums[0]==nums[i-1])
    {return true;}
    else{ return false;}
  }
  else return false;
}



/*
Given an int array length 2, return true if it contains a 2 or a 3.


has23([2, 5]) › true
has23([4, 3]) › true
has23([4, 5]) › false*/

public boolean has23(int[] nums) {
  int x= nums.length;
 if(x==2&&(nums[x-1]==2||nums[x-1]==3 ||nums[x-2]==2||nums[x-2]==3)){
   return true;
 }
 else {return false;}
}


/*Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.


swapEnds([1, 2, 3, 4]) › [4, 2, 3, 1]
swapEnds([1, 2, 3]) › [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) › [5, 6, 7, 9, 8]*/

public int[] swapEnds(int[] nums) {
 int x=nums.length;
 if (x>=1){
int i =nums[0];
int j =nums[x-1];
nums[0]=j;
nums[x-1]=i;
   
 }
 return nums;
}


/*
Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.


commonEnd([1, 2, 3], [7, 3]) › true
commonEnd([1, 2, 3], [7, 3, 2]) › false
commonEnd([1, 2, 3], [1, 3]) › true*/
public boolean commonEnd(int[] a, int[] b) {
  int x= a.length;
  int y=b.length;
  if( a[0]==b[0]||a[x-1]==b[y-1])
  {return true;}
  else {return false;}
}
