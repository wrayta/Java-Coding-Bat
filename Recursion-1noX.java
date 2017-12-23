/*
Given a string, compute recursively a new string where all the 'x' chars have 
been removed.

noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""
*/
public String noX(String str) {
  if((str.length() == 1 && str.charAt(0) == 'x')
    || str.equals("")){
    return "";
  } else if(str.length() == 1) {
    return str;
  } else if(str.charAt(0) == 'x') {
    return noX(str.substring(1));
  } else {
    return (str.charAt(0) + noX(str.substring(1)));
  }
}
