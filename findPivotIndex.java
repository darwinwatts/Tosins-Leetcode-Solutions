/**
My explanation:

so basically, the pivot index is not included in left most or right most sum. It is literally the index in between the two sums.

so we have to find the left most sum that equals the right most sum. 
If the pivot index is removed from the total sum of numbers in the array when finding the left and 
right sum the it safe to say `leftSum = tolalSum - (pivotIndexNum + rightSum)` or  `rightSum = tolalSum - (pivotIndexNum + leftSum)`.

With that we just need to continue looking for the leftSum from the beginning to end while getting the rightSum as well. 
We can use a for loop for that. So, we’ll get the leftSum, get the rightSum, check if they’re equal and 
return the index of pivotIndexNum if equal. 

If not the loop will repeat till found. If not found at the end of the loop we’ll just return -1.

***/
