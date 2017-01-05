/*
 * Given a non-empty array, return true if there is a place to split the array 
 * so that the sum of the numbers on one side is equal to the sum of the numbers
 * on the other side.
 *
 * canBalance([1, 1, 1, 2, 1]) → true
 * canBalance([2, 1, 1, 2, 1]) → false
 * canBalance([10, 10]) → true
 */
public boolean canBalance(int[] nums) {
  int rightSideSum = 0;
  int leftSideSum = 0;
  boolean canBal = false;
  
  for(int i = 0; i < nums.length; i++) {
    
    leftSideSum += nums[i];

    for(int j = nums.length - 1; j >= 0; j--) {
      rightSideSum += nums[j];
      
      if((rightSideSum == leftSideSum) && (j - i == 1)) {
        canBal = true;
      }
    }
    rightSideSum = 0;
  }
  
  return canBal;
}