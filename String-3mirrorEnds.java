/*
 * Given a string, look for a mirror image (backwards) string at both the 
 * beginning and end of the given string. In other words, zero or more 
 * characters at the very begining of the given string, and at the very end of
 * the string in reverse order (possibly overlapping). For example, the string
 * "abXYZba" has the mirror end "ab".
 * 
 * mirrorEnds("abXYZba") → "ab"
 * mirrorEnds("abca") → "a"
 * mirrorEnds("aba") → "aba"
 */
public String mirrorEnds(String string) {
  StringBuilder reverseStrBld = new StringBuilder(string);
  String reverseStr = reverseStrBld.reverse().toString();
  String frontSubstr = "";
  String endSubstr = "";
  String retStr = "";
  
  if(string.length() == 1) {
    retStr = string;
  }
  
  else if(reverseStr.equals(string)) {
    retStr = string;
  }
  
  else {
  
    for(int i = 0; i < string.length(); i++) {
      
      frontSubstr = string.substring(0, i);
      
      endSubstr = reverseStr.substring(0, i);
      
      if(frontSubstr.equals(endSubstr)) {
        retStr = frontSubstr;
      }
      
      else {
        retStr = string.substring(0, i - 1);
        break;
      }
    }
  }
  
  return retStr;
}