/*
 * We'll say that a "mirror" section in an array is a group of contiguous 
 * elements such that somewhere in the array, the same group appears in reverse
 * order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} 
 * is length 3 (the {1, 2, 3} part). Return the size of the largest mirror 
 * section found in the given array.
 *
 * maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
 * maxMirror([1, 2, 1, 4]) → 3
 * maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
 */
public int maxMirror(int[] nums) {
  int maxSize = 0;
  int countSize;
  int iEquivalent = 0;
  
  for(int i = 0; i < nums.length; i++) {
    for(int j = nums.length - 1; j >= 0; j--) {
      
      countSize = 0;
      
      if(nums[j] == nums[i]) { //found a same element
        countSize++;
        iEquivalent = i; //don't want to lose i's place in loop so set new variable equal to i
      
        while( (iEquivalent + 1 < nums.length) && (j - 1 >= 0) && (nums[--j] == nums[++iEquivalent]) ) {
          countSize++;
        }
        
        if(countSize > maxSize) {
          maxSize = countSize;
        }            
      }
    }
  }
  
  return maxSize;
  
}