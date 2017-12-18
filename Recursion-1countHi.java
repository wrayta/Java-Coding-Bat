/*
Given a string, compute recursively (no loops) the number of times lowercase 
"hi" appears in the string.

countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
*/
public int countHi(String str) {
  int count = 0;
  
  if (str.length() == 0 || str == "") {
    return count;
  } else {
      if ( (str.length() - 2 >= 0)
      && str.substring(str.length() - 2, str.length()).equals("hi") ){
        count = 1;
      } else {
        count = 0;
      }
    return count + countHi(str.substring(0, str.length() - 1));
  }
}