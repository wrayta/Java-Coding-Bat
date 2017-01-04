/*
 * Given a string, return true if the number of appearances of "is" anywhere in
 * the string is equal to the number of appearances of "not" anywhere in the 
 * string (case sensitive).
 *
 * equalIsNot("This is not") → false
 * equalIsNot("This is notnot") → true
 * equalIsNot("noisxxnotyynotxisi") → true
 */
public boolean equalIsNot(String str) {
  int isCount = 0;
  int notCount = 0;
  
  for(int i = 0; i < str.length(); i++) {
    
    if(str.charAt(i) == 'i') {
      if(i + 1 < str.length() && str.charAt(i + 1) == 's') {
        isCount++;
        i++;
      }
    }
    
    else if(str.charAt(i) == 'n') {
      if(i + 2 < str.length() && str.charAt(i + 1) == 'o'
        && str.charAt(i + 2) == 't') {
        notCount++;
        i += 2;
      }
    }
  }
  
  if(isCount == notCount) {
    return true;
  }
  
  return false;
}