/*
 * Given a string, return the length of the largest "block" in the string. 
 * A block is a run of adjacent chars that are the same.
 * 
 * maxBlock("hoopla") → 2
 * maxBlock("abbCCCddBBBxx") → 3
 * maxBlock("") → 0
 */
public int maxBlock(String str) {
  
  if(str.length() == 0) {
    return 0;
  }
  
  int count = 1;
  int maxBlock = 1;

  for(int i = 0; i < str.length(); i++) {
    
    count = 1;
  
    while(i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
      count++;
      i++;
      
      if(count > maxBlock) {
        maxBlock = count;
      }
    }
    
  }
  
  return maxBlock;
}