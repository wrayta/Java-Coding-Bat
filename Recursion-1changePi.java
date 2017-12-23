/*
Given a string, compute recursively (no loops) a new string where all 
appearances of "pi" have been replaced by "3.14".

changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"
*/
public String changePi(String str) {
  if(str.length() <= 1) {
    return str;
  } else if ((str.substring(str.length() - 2, str.length())).equals("pi")) {
      return changePi(str.substring(0, str.length() - 2))
      + "3.14";
  } else {
      return changePi(str.substring(0, str.length() - 1))
      + (str.substring(str.length() - 1, str.length()));
  }
}
