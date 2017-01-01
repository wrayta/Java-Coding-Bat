/*
 * Given two strings, base and remove, return a version of the base string
 * where all instances of the remove string have been removed (not case 
 * sensitive). You may assume that the remove string is length 1 or more. 
 * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves
 * "x".
 *
 * withoutString("Hello there", "llo") → "He there"
 * withoutString("Hello there", "e") → "Hllo thr"
 * withoutString("Hello there", "x") → "Hello there"
 */
public String withoutString(String base, String remove) {
  int remLength = remove.length();
  String retStr = "";
   
  for(int i = 0; i < base.length(); i++) {
    
    if(i + remLength <= base.length() 
      && base.substring(i, i + remLength).equalsIgnoreCase(remove)) {
      
      i += (remLength - 1); //don't want to include if contained, so advance index
    
    }
    
    else {
      retStr += base.charAt(i); //include in new String if not contained
    }
  }
  
  return retStr;
}