/*
Given a string, compute recursively (no loops) the number of lowercase 'x' chars
in the string.

countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
*/
public int countX(String str) {
  int numX = 0;
  
  if(str == "" || str.length() == 0) {
    return numX;
  } else if(str.length() == 1){
    numX = (str.charAt(0)) == 'x' ? 1 : 0;
    return numX;
  } else {
    numX = (str.charAt(str.length() - 1)) == 'x' ? 1 : 0;
    return numX + countX(str.substring(0, str.length() - 1));
  }
}