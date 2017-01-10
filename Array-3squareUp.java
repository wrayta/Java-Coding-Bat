/*
 * Given n>=0, create an array length n*n with the following pattern, shown 
 * here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3
 * groups).
 *
 * squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
 * squareUp(2) → [0, 1, 2, 1]
 * squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 */
public int[] squareUp(int n) {
  int[] retArr = new int[n*n];

  int counter;
  
  for(int i = n; i > 0; i--) {
    
    counter = 1;
    
    for(int j = 1; j <= n; j++) {
      
      if(counter > i) {
        retArr[n * i - j] = 0;
      }
      
      else {
        retArr[n * i - j] = counter;
      }
      counter++;
    }
  }
  
  return retArr;
}