# Median in a row-wise sorted Matrix

Given a row wise sorted matrix of size R*C where R and C are always odd, find the median of the matrix.

# Your Task:  

Your task is to complete the function median() which takes the integers R and C along with the 2D matrix as input parameters and returns the median of the matrix.

__Expected Time Complexity:__ O(32 * R * log(C))
__Expected Auxiliary Space:__ O(1)

## Example 1:

    Input:
    R = 3, C = 3
    M = [[1, 3, 5], 
         [2, 6, 9], 
         [3, 6, 9]]
    Output: 5
    Explanation: Sorting matrix elements gives 
    us {1,2,3,3,5,6,6,9,9}. Hence, 5 is median. 

## Example 2:

    Input:
    R = 3, C = 1
    M = [[1], [2], [3]]
    Output: 2
    Explanation: Sorting matrix elements gives 
    us {1,2,3}. Hence, 2 is median.    