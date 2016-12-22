/*
 * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
 * immediately to its left or right. Return true if all the g's in the given 
 * string are happy.
 *
 * gHappy("xxggxx") → true
 * gHappy("xxgxx") → false
 * gHappy("xxggyygxx") → false
*/
public boolean gHappy(String str) {
  int gCount = 0;
  int isHappyCount = 0;
  
  for(int i = 0; i < str.length(); i++) {
    if(str.charAt(i) == 'g') { //found a 'g'
      gCount++; //increment the total num of 'g's found
      
      if( (i + 1 <= str.length() - 1) && (i - 1 >= 0) ) { //don't want to throw 'index out of bounds'
        if( (str.charAt(i + 1) == 'g') || (str.charAt(i - 1) == 'g') ) { //check if next char is a 'g'
          isHappyCount++; //if it is increment 'isHappyCount'
        }
      }
      else if( (i + 1) <= (str.length() - 1) ) { //needed for 'g's at end of word
        if(str.charAt(i + 1) == 'g') {
          isHappyCount++;
        }
      }
      
      else if( (i - 1) >= 0 ) {
        if(str.charAt(i - 1) == 'g') { //needed for 'g's at beginning of word
          isHappyCount++;
        }
      }
    }
  }
  
  if( isHappyCount == gCount ) { //these two numbers should match
    return true;
  }
  
  return false;
}