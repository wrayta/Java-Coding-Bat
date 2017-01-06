/*
 * Given two arrays of ints sorted in increasing order, outer and inner, return
 * true if all of the numbers in inner appear in outer. The best solution makes
 * only a single "linear" pass of both arrays, taking advantage of the fact that
 * both arrays are already in sorted order.

 * linearIn([1, 2, 4, 6], [2, 4]) → true
 * linearIn([1, 2, 4, 6], [2, 3, 4]) → false
 * linearIn([1, 2, 4, 4, 6], [2, 4]) → true
 */
public boolean linearIn(int[] outer, int[] inner) {
  
  boolean allAppear = false;
  int counter = 0; //keep track of the matches between outer and inner
  int innerIndex = 0; //index in the inner array
  
  for(int i = 0; i < outer.length; i++) {
    if((innerIndex < inner.length) && (outer[i] == inner[innerIndex])) {
      counter++;
      innerIndex++;
    }
  }
  
  if(counter == inner.length) { //if the matches equals the inner's length, return true
    allAppear = true;
  }
  
  return allAppear;
}