

import java.util.*;

public class UnibitProblem {
    // Function to get the pair of integer equals to target**********  
    public static int[][] findPair(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        List<int[]> ls = new ArrayList<>();

        for (int num : nums) {
            int i = target - num;
            if (m.containsKey(i)) {
                ls.add(new int[]{num, i});
            }
            m.put(num, num);
        }

        int[][] ans = new int[ls.size()][2];
        for (int i = 0; i < ls.size(); i++) {
            ans[i] = ls.get(i);
        }

        return ans;
    }

    // Function to merge 2d array into 1d array*************
    public static int[] mergeArrays(int[][] arrays) {
        int len = 0;
        for (int[] array : arrays) {
            len += array.length;
        }

        int[] mArray = new int[len];
        int currIdx = 0;

        for (int[] array : arrays) {
            System.arraycopy(array, 0, mArray, currIdx, array.length);
            currIdx += array.length;
        }

        return mArray;
    }
   

    private static void solve(int ind,int target,int[]candidates,List<List<Integer>>ans,ArrayList<Integer>temp){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=ind;i<candidates.length;i++){
            if(i!=ind && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;

            temp.add(candidates[i]);
            solve(i+1,target-candidates[i],candidates,ans,temp);     // Using recursion
            temp.remove(temp.size()-1);
        }
    }    

    // Function to get the multiple valued 2d arrays having sum equals to doubleTarget************
    public static int[][] findDoubleCombinations(int[] mergedArray, int doubleTarget) {
    List<List<Integer>> res = new ArrayList<>();
    solve(0, doubleTarget, mergedArray, res, new ArrayList<>());
    int[][] result = new int[res.size()][];

    for (int i = 0; i < res.size(); i++) {
        result[i] = new int[res.get(i).size()]; // Initialize the subarray
        for (int j = 0; j < res.get(i).size(); j++) {
            result[i][j] = res.get(i).get(j);
        }
    }
    return result;
}




    public static void main(String[] args) {
        // Taking input from Terminal******************
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();             // Taking the size of array
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = sc.nextInt();          // Taking Array value
        }
        int target = sc.nextInt();          // Taking target value
        int doubleTarget = target * 2;      // Double the target


        // Getting the matrix having pair equal to target and print in required form***********
        int[][] combinations = findPair(nums, target);
        System.out.println("First Combination For \"" + target + "\":");
        for (int[] combination : combinations) {
            System.out.println(Arrays.toString(combination));
        }

        // Getting the merged Array and sort it and print in required form***************
        int[] mergedArray = mergeArrays(combinations);
        Arrays.sort(mergedArray);
        System.out.println("Merge Into a single Array:");
        System.out.println(Arrays.toString(mergedArray));

        // Getting the matrix having multiple value sum equals to doubletarget and print in required form*****************
        int[][] doubleCombinations = findDoubleCombinations(mergedArray, doubleTarget);
        System.out.println("Second Combination For \"" + doubleTarget + "\":");
        for (int[] combination : doubleCombinations) {
            System.out.println(Arrays.toString(combination));
        }
    }
}
