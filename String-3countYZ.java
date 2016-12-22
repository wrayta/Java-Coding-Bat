/*
 * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' 
 * in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case
 * sensitive). We'll say that a y or z is at the end of a word if there is not 
 * an alphabetic letter immediately following it. (Note: Character.isLetter(char)
 * tests if a char is an alphabetic letter.)
 * 
 * countYZ("fez day") → 2
 * countYZ("day fez") → 2
 * countYZ("day fyyyz") → 2
 */
public int countYZ(String str) {
  int count = 0;
  String[] words = str.split("\\s+");
  
  for(int i = 0; i < words.length; i++){
    for(int j = 0; j < words[i].length(); j++){
      if(j + 1 <= words[i].length() - 1){
        if( !(Character.isLetter((words[i].charAt(j + 1)))) ){
          if( (words[i].charAt(j) == 'y')
            || (words[i].charAt(j) == 'Y')
            || (words[i].charAt(j) == 'z') 
            || (words[i].charAt(j) == 'Z')){
              count++;
          }
        }
      }
      else if( (words[i].charAt(j) == 'y') 
            || (words[i].charAt(j) == 'Y')
            || (words[i].charAt(j) == 'z') 
            || (words[i].charAt(j) == 'Z')){
              count++;
      }
    }
  }
  
  return count;
}