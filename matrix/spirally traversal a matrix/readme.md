# Spirally Traversing a matrix

Given a matrix of size r*c. Traverse the matrix in spiral form.

# Your Task

Complete the function spirallyTraverse() that takes matrix, r and c as input parameters and returns a list of integers denoting the spiral traversal of matrix. 

__Expected Time Complexity:__ O(r*c)

__Expected Auxiliary Space:__ O(r*c), for returning the answer only.

## Example 1:

    r = 4, c = 4
    matrix[][] = {
        { 1,  2,  3,  4  }
        { 5,  6,  7,  8  }
        { 9,  10, 11, 12 }
        { 13, 14, 15, 16 }
    }

    Ouput: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10


## Example 2:
    
    r = 3, c = 4
    matrix[][] = {
        { 1,  2,  3,  4  }
        { 5,  6,  7,  8  }
        { 9,  10, 11, 12 }
    }

    Output: 1 2 3 4 8 12 11 10 9 5 6 7