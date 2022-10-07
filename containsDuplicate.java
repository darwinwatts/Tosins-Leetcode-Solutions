/***

here the code wants us to find the return true if any value in array appears at least once. 
so we somehow need to check each array (which seems like it will already involve a for loop) to check if 
a value appears at least twice in any index position of the array then stop executing the code

A Hash Set seems appropriate because we only need to check if it appears a second time, so we store the values in 
the array one by one in a Hash Set that obviously aren’t there already (we’ll check to make sure with each try).

Then with each run, if the value isn’t in the Hash Set (for the first one it obviously wont be there) we can 
make it store (add) the value to Hash Set. Now we’ll make an exception for the next one that might be in the 
Hash Set already, buy checking and if it works we’ll make it return true.


***/
