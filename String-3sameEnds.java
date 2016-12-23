/*
 * Given a string, return the longest substring that appears at both the 
 * beginning and end of the string without overlapping. For example, 
 * sameEnds("abXab") is "ab".
 *
 * sameEnds("abXYab") → "ab"
 * sameEnds("xx") → "x"
 * sameEnds("xxx") → "x"
 */
 
  public String sameEnds(String string) {
  int len = string.length();
  String longestSubstr = "";
   
  for(int i = len/2; i > 0; i--){
    if(string.substring(0,i)
    .equals(string.substring(len - i, len))){
      longestSubstr += string.substring(0, i);
      break;
    }
  }
   
  return longestSubstr;
}