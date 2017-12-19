/*
Given a string, compute recursively (no loops) a new string where all the 
lowercase 'x' chars have been changed to 'y' chars.

changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"
*/
public String changeXY(String str) {
  if(str.length() == 0 || str.equals("")) {
    return "";
  } else if(str.length() == 1){
    if(str.charAt(0) == 'x') {
      return str.substring(0, str.length() - 1) + 'y';
    } else {
      return str;
    }
  } else {
      char endLetter;

      if(str.charAt(str.length() - 1) == 'x') {
        endLetter = 'y';
      } else {
        endLetter = str.charAt(str.length() - 1);
      } return changeXY(str.substring(0, str.length() - 1)) + endLetter;
  }
}
