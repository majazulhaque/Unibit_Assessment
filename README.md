UNIBIT PROBLEM:

    Given an array of integers and a target value, you must determine which     two integers' sum
    equals the target and return a 2D array. Then merge the array into a    single array with sorting (
    ascending ) order, in the next step double the target value and find    again the combination of
    digits (can be multiple digits ) that are equal to the double targeted  value and returned into a 2D
    array.
    Sample Input : [1, 3, 2, 2, -4, -6, -2, 8];
    Target Value = 4,
    Output: First Combination For “4” : [ [1,3],[2,2],[-4,8],[-6,2] ];
    Merge Into a single Array : [-6,-4,1,2,2,2,3,8];
    Second Combination For “8” : [ [ 1,3,2,2], [8,-4,2,2],....,[n,n,n,n] ]


    IN Output :- [-6,2] is not equal to 4. and also below line is wrong.


    *** Size of array should be given before array and input taken from terminal(IMPORTANT)

    RESULT:-

        INPUT:    8  (Size of array)
                  1 3 2 2 -4 -6 -2 8 (Array)
                  4     (Target)

        OUTPUT:    First Combination For "4":
                   [3, 1]
                   [2, 2]
                   [8, -4]
                   Merge Into a single Array:
                   [-4, 1, 2, 2, 3, 8]
                   Second Combination For "8":
                   [-4, 1, 3, 8]
                   [-4, 2, 2, 8]
                   [1, 2, 2, 3]
                   [8]

        INPUT:    14
                  1 3 2 2 5 2 8 1 3 2 -4 -6 -2 8
                  5

        OUTPUT:   First Combination For "5":
                  [2, 3]
                  [2, 3]
                  [2, 3]
                  [3, 2]
                  [2, 3]
                  Merge Into a single Array:
                  [2, 2, 2, 2, 2, 3, 3, 3, 3, 3]
                  Second Combination For "10":
                  [2, 2, 2, 2, 2]
                  [2, 2, 3, 3]


    TIME COMPLEXITY:-  
      
      FindPair Function ---- 0(N+M) where N is the length of nums array &
                                    M is the number of pairs found

     mergeArrays Funtion ---- O(K)  where K is the total number of                             
                                    elements in all the arrays

    findDoubleCombinations Function ---  O(M*L) where M is the   number of combinations
                                        and  L is the avg length of the combinations.

    Overall time complexity in best scenario is O(N+K)

    SPACE COMPLEXITY:-

      findPair ------- O(N+M)
      mergeArrays ----- O(K)
      findDoubleCombinations ----- O(N)

      Overall  O(N+M)

