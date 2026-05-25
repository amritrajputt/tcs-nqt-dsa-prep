# TCS NQT Coding Questions — Pattern-Wise Complete Guide
> Covers all patterns asked in TCS NQT (Ninja / Digital / Prime) from 2020–2025  
> Pattern-wise, not topic-wise — so you don't skip any question type

---

## 📌 EXAM STRUCTURE (2025–2026)
| Section | Time | Details |
|---|---|---|
| Part A – Foundation | 75 mins | Aptitude, Verbal, Logical |
| Part B – Advanced Coding | 90 mins | **2 Coding Questions** |
| Difficulty | Ninja = Easy-Med | Digital/Prime = Med-Hard |

> **Goal:** Solve Q1 fully + partial Q2 → Ninja | Both fully → Digital/Prime

---

## 🔁 PATTERN 1: Two Pointer

> Used when array is sorted or you need pair/triplet with a condition

### Q1. Remove Duplicates from Sorted Array
Given a sorted array, remove duplicates in-place and return the new length.  
`Input: [1,1,2,3,3,4]` → `Output: 4 → [1,2,3,4]`

### Q2. Pair with Given Sum in Sorted Array
Given a sorted array and target T, find if a pair exists with sum = T.  
`Input: arr=[1,3,5,7,9], T=12` → `Output: Yes (3,9)`

### Q3. Three Sum = 0
Find all triplets in the array that sum to zero.  
`Input: [-1,0,1,2,-1,-4]` → `Output: [[-1,-1,2],[-1,0,1]]`

### Q4. Container With Most Water
Given heights of walls, find max water that can be trapped between two walls.  
`Input: [1,8,6,2,5,4,8,3,7]` → `Output: 49`

### Q5. Squaring Sorted Array
Given a sorted array (may have negatives), return sorted array of squares.  
`Input: [-4,-1,0,3,10]` → `Output: [0,1,9,16,100]`

### Q6. Move Zeroes to End (Two Pointer Style)
Move all 0s to end maintaining relative order of non-zero elements.  
`Input: [0,1,0,3,12]` → `Output: [1,3,12,0,0]`

### Q7. Merge Two Sorted Arrays In-Place
Given two sorted arrays A (with extra space) and B, merge B into A in-place.  
`Input: A=[1,2,3,0,0,0], B=[2,5,6]` → `Output: [1,2,2,3,5,6]`

### Q8. Find Pair with Minimum Absolute Difference
Given sorted array, find pair (a,b) with minimum |a-b|.  
`Input: [1,3,6,10,15]` → `Output: (1,3) diff=2`

### Q9. Count Pairs with Sum < K
Count pairs in sorted array with sum less than K.  
`Input: arr=[1,2,3,4,5], K=7` → `Output: 6`

### Q10. Palindrome Check Using Two Pointer
Check if a string is palindrome without using reverse function.  
`Input: "racecar"` → `Output: Yes`

---

## 🪟 PATTERN 2: Sliding Window

> Used for subarray/substring problems with a fixed or variable window

### Q11. Maximum Sum Subarray of Size K
Find max sum of any contiguous subarray of size K.  
`Input: arr=[2,1,5,1,3,2], K=3` → `Output: 9`

### Q12. Minimum Sum Subarray of Size K
Find min sum of any contiguous subarray of size K.  
`Input: arr=[2,3,4,1,5], K=2` → `Output: 5`

### Q13. Count Distinct Elements in Every Window of Size K
Print count of distinct elements in each window.  
`Input: arr=[1,2,1,3,4,2,3], K=4` → `Output: [3,4,4,3]`

### Q14. First Negative Number in Every Window of Size K
Print first negative number in each window. If none, print 0.  
`Input: arr=[12,-1,-7,8,-15,30,16,28], K=3` → `Output: [-1,-1,-7,-15,-15,0]`

### Q15. Longest Subarray with Sum = K
Find length of longest subarray with sum equal to K.  
`Input: arr=[10,5,2,7,1,9], K=15` → `Output: 4`

### Q16. Longest Substring Without Repeating Characters
Find length of longest substring with all unique characters.  
`Input: "abcabcbb"` → `Output: 3 (abc)`

### Q17. Maximum of All Subarrays of Size K
Print maximum element in each window of size K.  
`Input: arr=[1,3,-1,-3,5,3,6,7], K=3` → `Output: [3,3,5,5,6,7]`

### Q18. Minimum Window Substring
Find minimum window in string S containing all chars of string T.  
`Input: S="ADOBECODEBANC", T="ABC"` → `Output: "BANC"`

### Q19. Count Anagrams of Pattern in String
Count all occurrences of anagrams of pattern P in string S.  
`Input: S="cbaebabacd", P="abc"` → `Output: 2`

### Q20. Subarray with Given Sum (Positive Numbers)
Find a contiguous subarray with sum = S.  
`Input: arr=[1,4,20,3,10,5], S=33` → `Output: [20,3,10]`

### Q21. Longest Subarray with Equal 0s and 1s
Find length of longest subarray with equal 0s and 1s.  
`Input: [0,1,0,1,1,0,0]` → `Output: 6`

### Q22. Number of Subarrays with Product Less Than K
Count subarrays where product of all elements < K.  
`Input: arr=[10,5,2,6], K=100` → `Output: 8`

---

## 🔢 PATTERN 3: Array Manipulation

> Direct array operations — most common TCS NQT pattern

### Q23. Rotate Array by K Positions (Right)
Rotate array to the right by K steps.  
`Input: [1,2,3,4,5,6,7], K=3` → `Output: [5,6,7,1,2,3,4]`

### Q24. Sort Array of 0s, 1s, and 2s (Dutch National Flag)
Sort without using inbuilt sort.  
`Input: [0,2,1,2,0,1]` → `Output: [0,0,1,1,2,2]`

### Q25. Find Missing Number in Array [1..N]
`Input: [1,2,4,5,6], N=6` → `Output: 3`

### Q26. Find Duplicate Number in Array [1..N]
Array has N+1 elements, each between 1 to N, find duplicate.  
`Input: [1,3,4,2,2]` → `Output: 2`

### Q27. Find Second Largest Element
Without sorting, find the 2nd largest in single pass.  
`Input: [12,35,1,10,34,1]` → `Output: 34`

### Q28. Kadane's Algorithm – Maximum Subarray Sum
Find maximum sum of any contiguous subarray.  
`Input: [-2,1,-3,4,-1,2,1,-5,4]` → `Output: 6`

### Q29. Cyclically Rotate Array by 1
`Input: [1,2,3,4,5]` → `Output: [5,1,2,3,4]`

### Q30. Count Inversions in Array
Count pairs (i,j) where i < j but arr[i] > arr[j].  
`Input: [2,4,1,3,5]` → `Output: 3`

### Q31. Product of Array Except Self
Return array where each element is product of all except itself. No division allowed.  
`Input: [1,2,3,4]` → `Output: [24,12,8,6]`

### Q32. Rearrange Positive and Negative Alternately
`Input: [-1,2,-3,4,-5,6]` → `Output: [2,-1,4,-3,6,-5]`

### Q33. Leaders in an Array
An element is a leader if all elements to its right are smaller.  
`Input: [16,17,4,3,5,2]` → `Output: [17,5,2]`

### Q34. Trapping Rain Water
Given heights, find total water trapped.  
`Input: [0,1,0,2,1,0,1,3,2,1,2,1]` → `Output: 6`

### Q35. Stock Buy and Sell (Max Profit)
Find max profit with one buy and one sell.  
`Input: [7,1,5,3,6,4]` → `Output: 5`

### Q36. Find Subarray with Given Sum
`Input: arr=[1,4,20,3,10,5], sum=33` → `Output: Subarray from index 2 to 4`

### Q37. Majority Element (> N/2 times)
Find element appearing more than N/2 times.  
`Input: [2,2,1,1,1,2,2]` → `Output: 2`

### Q38. Wave Array
Arrange in a[0]>=a[1]<=a[2]>=a[3] pattern.  
`Input: [3,6,5,10,7,20]` → `Output: [6,3,10,5,20,7]`

---

## 🧵 PATTERN 4: String Manipulation

> Very frequent in TCS NQT — almost guaranteed 1 string question

### Q39. Reverse Words in a Sentence
`Input: "Hello World TCS"` → `Output: "TCS World Hello"`

### Q40. Check Anagram
Two strings are anagram if they have same characters with same frequency.  
`Input: "listen", "silent"` → `Output: Yes`

### Q41. Count and Say
Generate the nth term of count-and-say sequence.  
`Input: n=4` → `Output: "1211"`

### Q42. Longest Common Prefix
Find longest common prefix string among an array of strings.  
`Input: ["flower","flow","flight"]` → `Output: "fl"`

### Q43. First Non-Repeating Character
`Input: "aabbcdde"` → `Output: 'c'`

### Q44. Remove All Vowels from String
`Input: "Hello World"` → `Output: "Hll Wrld"`

### Q45. Check if String is Rotation of Another
`Input: s1="ABCD", s2="CDAB"` → `Output: Yes`

### Q46. String Compression
Compress "aaabbbcccc" → "a3b3c4"  
`Input: "aabcccccaaa"` → `Output: "a2b1c5a3"`

### Q47. Count Occurrences of Pattern in String
`Input: text="aababab", pattern="abab"` → `Output: 2`

### Q48. Longest Palindromic Substring
`Input: "babad"` → `Output: "bab"`

### Q49. Reverse Only Letters in String
`Input: "a-bC-dEf-ghIj"` → `Output: "j-Ih-gfE-dCba"`

### Q50. Check Balanced Parentheses
`Input: "([{}])"` → `Output: Valid`  
`Input: "([)]"` → `Output: Invalid`

### Q51. Caesar Cipher (Shift K)
Shift each character by K positions.  
`Input: "ABC", K=3` → `Output: "DEF"`

### Q52. Find All Permutations of a String
`Input: "ABC"` → `Output: ABC, ACB, BAC, BCA, CAB, CBA`

---

## 🔢 PATTERN 5: Number Theory / Math

> Very common as Q1 in TCS NQT — easy to solve if formula known

### Q53. Check Prime Number
`Input: 29` → `Output: Prime`

### Q54. Find All Primes Up to N (Sieve of Eratosthenes)
`Input: N=30` → `Output: 2,3,5,7,11,13,17,19,23,29`

### Q55. GCD and LCM
`Input: 12, 18` → `GCD: 6, LCM: 36`

### Q56. Fibonacci Series Up to N Terms
`Input: N=10` → `Output: 0 1 1 2 3 5 8 13 21 34`

### Q57. Factorial of N (Iterative + Recursive)
`Input: 6` → `Output: 720`

### Q58. Check Perfect Number
A number is perfect if sum of divisors (excluding itself) equals the number.  
`Input: 28` → `Output: Perfect (1+2+4+7+14=28)`

### Q59. Check Armstrong Number
Sum of cubes of digits = the number.  
`Input: 153` → `Output: Armstrong (1³+5³+3³=153)`

### Q60. Reverse a Number
`Input: 12345` → `Output: 54321`

### Q61. Sum of Digits Until Single Digit
`Input: 9875` → `Output: 2 (9+8+7+5=29 → 2+9=11 → 1+1=2)`

### Q62. Count Digits in Factorial
Find number of digits in N! without computing it.  
`Input: 20` → `Output: 19`

### Q63. Power Without Inbuilt Function (Fast Exponentiation)
Compute a^b mod m efficiently.  
`Input: a=2, b=10, m=1000` → `Output: 24`

### Q64. Count Set Bits in a Number
`Input: 9 (1001 in binary)` → `Output: 2`

### Q65. XOR of All Elements in Range [1..N]
`Input: N=6` → `Output: 7`

### Q66. Nth Term of AP/GP Series
`Input: AP: first=2, diff=3, N=5` → `Output: 14`

### Q67. Sum of AP/GP Series
`Input: GP: first=1, ratio=2, N=8` → `Output: 255`

### Q68. Check Palindrome Number
`Input: 12321` → `Output: Yes`

### Q69. Find All Divisors of N
`Input: 36` → `Output: 1 2 3 4 6 9 12 18 36`

### Q70. Largest Prime Factor
`Input: 315` → `Output: 7`

---

## 🔀 PATTERN 6: Sorting-Based Problems

> TCS loves questions that look complex but reduce to sorting

### Q71. Sort Without Inbuilt Function (Bubble Sort)
Implement Bubble Sort and sort an array.  
`Input: [64,34,25,12,22,11,90]` → `Output: [11,12,22,25,34,64,90]`

### Q72. Merge Sort Implementation
Divide and conquer sort.  
`Input: [38,27,43,3,9,82,10]` → `Output: [3,9,10,27,38,43,82]`

### Q73. Find Kth Largest Element
Without full sorting, find Kth largest.  
`Input: [3,2,1,5,6,4], K=2` → `Output: 5`

### Q74. Sort by Frequency
Sort array elements by their frequency (most frequent first).  
`Input: [2,3,2,4,5,12,2,3,3,3,12]` → `Output: [3,3,3,3,2,2,2,12,12,4,5]`

### Q75. Segregate Even and Odd
All even numbers before odd numbers.  
`Input: [1,2,3,4,5,6,7]` → `Output: [2,4,6,1,3,5,7]`

### Q76. Sort Array by Absolute Difference with X
Sort array by absolute difference with a given number X.  
`Input: arr=[10,5,3,9,2], X=7` → `Output: [5,9,10,3,2]`

### Q77. Minimum Swaps to Sort Array
Find minimum number of swaps to sort array.  
`Input: [4,3,2,1]` → `Output: 2`

---

## 🔁 PATTERN 7: Recursion & Backtracking

> TCS Digital/Prime level questions

### Q78. Tower of Hanoi
Move N disks from source to destination using helper peg. Print each move.  
`Input: N=3` → `Output: Move disk 1 from A to C...`

### Q79. Generate All Subsets of Array
`Input: [1,2,3]` → `Output: [], [1], [2], [3], [1,2], [1,3], [2,3], [1,2,3]`

### Q80. N Queens Problem
Place N queens on NxN board such that no two attack each other.  
`Input: N=4` → `Output: [[0,1,0,0],[0,0,0,1],[1,0,0,0],[0,0,1,0]]`

### Q81. Print All Paths from Top-Left to Bottom-Right in Matrix
Only move right or down.  
`Input: 2x2 grid` → `Output: RD, DR`

### Q82. Word Search in Grid
Given a 2D board and word, check if word exists in grid (horizontal/vertical/diagonal).  
`Input: board + "ABCCED"` → `Output: True`

### Q83. Rat in a Maze
Find all paths from (0,0) to (N-1,N-1).  
`Input: N=4 maze grid` → `Output: DDRDRR, DRDDRR...`

### Q84. Phone Digit Letter Combinations
Given phone number digits, print all possible letter combinations.  
`Input: "23"` → `Output: ad,ae,af,bd,be,bf,cd,ce,cf`

---

## 🌲 PATTERN 8: Matrix / 2D Array

> Frequently appears as real-world problem (chocolate, gems, library)

### Q85. Spiral Order Traversal of Matrix
Print matrix elements in spiral order.  
`Input: [[1,2,3],[4,5,6],[7,8,9]]` → `Output: 1 2 3 6 9 8 7 4 5`

### Q86. Rotate Matrix by 90 Degrees
`Input: [[1,2,3],[4,5,6],[7,8,9]]` → `Output: [[7,4,1],[8,5,2],[9,6,3]]`

### Q87. Search in Row-wise and Column-wise Sorted Matrix
`Input: matrix + target=5` → `Output: Found at (0,2)`

### Q88. Find Maximum in Each Row
`Input: [[1,2,3],[4,5,6],[7,8,9]]` → `Output: [3,6,9]`

### Q89. Transpose of Matrix
`Input: [[1,2,3],[4,5,6]]` → `Output: [[1,4],[2,5],[3,6]]`

### Q90. Count Islands (Connected 1s in Binary Matrix)
Count number of groups of connected 1s.  
`Input: binary matrix` → `Output: 3`

### Q91. Diagonal Sum of Matrix
Find sum of both diagonals.  
`Input: [[1,2,3],[4,5,6],[7,8,9]]` → `Output: 25`

### Q92. Boundary Elements of Matrix
Print all border elements in order.  
`Input: 4x4 matrix` → `Output: all border elements`

---

## 📦 PATTERN 9: Stack & Queue Based

### Q93. Next Greater Element
For each element, find the next greater element to its right.  
`Input: [4,5,2,25]` → `Output: [5,25,25,-1]`

### Q94. Stock Span Problem
For each day, find how many consecutive days before it had lower/equal price.  
`Input: [100,80,60,70,60,75,85]` → `Output: [1,1,1,2,1,4,6]`

### Q95. Valid Parentheses Sequence
Already in Q50, but here focus on stack implementation.  
`Input: "{[]()}"` → `Output: Valid`

### Q96. Reverse Queue Using Stack
`Input: Queue: 1←2←3←4←5` → `Output: Queue: 5←4←3←2←1`

### Q97. Queue Using Two Stacks
Implement queue using only 2 stacks.

### Q98. Largest Rectangle in Histogram
Find largest rectangle that can be formed in histogram bars.  
`Input: [2,1,5,6,2,3]` → `Output: 10`

---

## 🔗 PATTERN 10: Hashing / Frequency Count

> Very common disguised pattern in TCS NQT

### Q99. Find Two Numbers with Sum = K (Using Hashing)
`Input: arr=[2,7,11,15], K=9` → `Output: (2,7)`

### Q100. Count Frequency of Each Element
`Input: [1,1,2,3,3,3,4]` → `Output: 1→2, 2→1, 3→3, 4→1`

### Q101. Check if Array Has Duplicate Within K Distance
`Input: arr=[1,2,3,1,4,5], K=3` → `Output: True`

### Q102. Subarray with 0 Sum
Check if any subarray has sum = 0.  
`Input: [4,2,-3,-1,0,4]` → `Output: Yes`

### Q103. Largest Subarray with Equal Number of 0s and 1s
`Input: [0,1,0,1,1,0,0]` → `Output: length 6`

### Q104. Count Distinct Pairs with Difference = K
`Input: arr=[1,5,3,4,2], K=3` → `Output: 2 pairs → (5,2) and (4,1)`

### Q105. Group Anagrams Together
`Input: ["eat","tea","tan","ate","nat","bat"]`  
`Output: [["eat","tea","ate"],["tan","nat"],["bat"]]`

---

## 🔁 PATTERN 11: Dynamic Programming (TCS Prime Level)

> For Prime role — at least one DP question expected

### Q106. 0/1 Knapsack Problem
Given weights and values, maximize value within capacity W.  
`Input: weights=[2,3,4,5], values=[3,4,5,6], W=5` → `Output: 7`

### Q107. Longest Common Subsequence (LCS)
`Input: s1="ABCBDAB", s2="BDCAB"` → `Output: 4 (BCAB)`

### Q108. Longest Increasing Subsequence (LIS)
`Input: [10,9,2,5,3,7,101,18]` → `Output: 4`

### Q109. Coin Change Problem
Minimum number of coins to make amount N.  
`Input: coins=[1,5,10,25], amount=30` → `Output: 2 (25+5)`

### Q110. Maximum Profit in Rod Cutting
Cut rod of length N to maximize revenue.  
`Input: lengths=[1..N], prices=[1,5,8,9,10,17,17,20]` → `Output: 22`

### Q111. Climbing Stairs (1 or 2 steps)
How many distinct ways to climb N stairs?  
`Input: N=5` → `Output: 8`

### Q112. Maximum Sum Non-Adjacent Elements
`Input: [2,1,4,9,5]` → `Output: 15 (2+4+9 not allowed, so 2+9=11? No: 1+9=10, 2+4+5=11, 4+5=9... correct is 2+9=11)`  
Actually: `[2,1,4,9,5]` → pick 2,4,5=11 or 1,9=10 or 2,9=11 → `Output: 11`

### Q113. Edit Distance Between Two Strings
Minimum insert/delete/replace to convert s1 to s2.  
`Input: s1="horse", s2="ros"` → `Output: 3`

### Q114. Subset Sum = Target
Check if any subset has sum = K.  
`Input: arr=[3,34,4,12,5,2], K=9` → `Output: Yes (4+3+2)`

---

## 🌐 PATTERN 12: Real-World Disguised Problems (TCS Favourite!)

> TCS wraps simple logic in stories about chocolates, gems, factories, etc.

### Q115. Chocolate Distribution Problem
Given N chocolates and M students, minimize difference between max and min chocolates given.  
`Input: arr=[3,4,1,9,56,7,9,12], M=5` → `Output: 6`

### Q116. Conveyor Belt / Chocolates (Move Zeroes)
Empty packets (0) must go to the end of the belt.  
`Input: [4,5,0,1,9,0,5,0]` → `Output: [4,5,1,9,5,0,0,0]`

### Q117. Gem Counting in Library (Frequency Map)
Count how many distinct gem types a traveler has.  
`Input: gems="aAabbBBb"` → `Output: 4`

### Q118. Points on Straight Line
Given N points, find maximum points that lie on same line.  
`Input: [[1,1],[2,2],[3,3]]` → `Output: 3`

### Q119. Candy Distribution (Greedy)
N children with ratings — give minimum candies such that higher rating = more candy.  
`Input: ratings=[1,0,2]` → `Output: 5 (2,1,2)`

### Q120. Fibonacci Series as Series Mixture
A series is mixture of two series — find Nth term.  
`Input: Series: 1,1,2,3,5,8... find N=7` → `Output: 13`

### Q121. Number of Digits Without Repeated Digits in Range [N1, N2]
`Input: N1=11, N2=15` → `Output: 4 (12,13,14,15)`

### Q122. Missing Numbers in Range
Given array, find all missing numbers in [1..N].  
`Input: [4,3,2,7,8,2,3,1], N=8` → `Output: [5,6]`

### Q123. Balanced Brackets in Expression (Real-world)
Check if a mathematical expression has balanced brackets.  
`Input: "((a+b)*(c-d))"` → `Output: Valid`

### Q124. Series: Sum of N Terms of 1 + 1/2 + 1/3 + ... + 1/N
`Input: N=5` → `Output: 2.283`

### Q125. Pattern Printing (Various TCS Favourites)
```
Pattern A (Star Triangle):      Pattern B (Number Pyramid):
    *                                1
   ***                              121
  *****                            12321
 *******                          1234321
```

---

## 💡 PATTERN 13: Bit Manipulation

> Occasional appearance in TCS Digital round

### Q126. Check if Number is Power of 2
`Input: 64` → `Output: Yes`

### Q127. Swap Two Numbers Without Temp Variable (Using XOR)
`Input: a=5, b=7` → `Output: a=7, b=5`

### Q128. Find Non-Repeating Element in Array (All others repeat twice)
`Input: [2,3,5,4,5,3,4]` → `Output: 2`

### Q129. Toggle Bits Between Positions L and R
`Input: N=170 (10101010), L=2, R=4` → `Output: 175 (10101111)`

### Q130. Count Bits to Convert A to B (Hamming Distance)
`Input: A=10, B=20` → `Output: 4`

---

## 📊 PATTERN 14: Linked List (TCS Prime Only)

### Q131. Reverse a Linked List
`Input: 1→2→3→4→5` → `Output: 5→4→3→2→1`

### Q132. Detect Cycle in Linked List (Floyd's Algorithm)
Return true if cycle exists.

### Q133. Find Middle of Linked List (Slow-Fast Pointer)
`Input: 1→2→3→4→5` → `Output: 3`

### Q134. Merge Two Sorted Linked Lists
`Input: L1=1→2→4, L2=1→3→4` → `Output: 1→1→2→3→4→4`

### Q135. Remove Nth Node from End
`Input: 1→2→3→4→5, N=2` → `Output: 1→2→3→5`

---

## 🔄 PATTERN 15: Prefix Sum / Difference Array

> Hidden pattern — appears in many TCS questions

### Q136. Range Sum Query
Precompute prefix sums. Answer multiple sum queries in O(1).  
`Input: arr=[1,3,5,7,9], query (1,3)` → `Output: 15`

### Q137. Count Subarrays with Sum = K
`Input: arr=[1,1,1], K=2` → `Output: 2`

### Q138. Equilibrium Index of Array
Find index where sum of left elements = sum of right elements.  
`Input: [3,4,-7,3,1,3,1,-4,-2,-2]` → `Output: 3`

### Q139. Maximum Circular Subarray Sum
Extend Kadane's to handle circular arrays.  
`Input: [8,-1,3,-2]` → `Output: 12`

### Q140. Minimum Size Subarray with Sum >= S
`Input: arr=[2,3,1,2,4,3], S=7` → `Output: 2`

---

## ✅ TCS NQT QUICK CHECKLIST

### Patterns You Must Master (Priority Order):
- [x] Array Manipulation (Q23–Q38) — **Always in exam**
- [x] String Problems (Q39–Q52) — **Almost always**
- [x] Number Theory/Math (Q53–Q70) — **Easy marks**
- [x] Two Pointer (Q1–Q10) — **Ninja/Digital**
- [x] Sliding Window (Q11–Q22) — **Ninja/Digital**
- [x] Sorting Based (Q71–Q77) — **Medium difficulty**
- [x] Hashing / Frequency (Q99–Q114) — **Disguised as stories**
- [x] Real-world Story Problems (Q115–Q125) — **TCS Favourite**
- [ ] Recursion & DP (Q78–Q114) — **Digital/Prime only**
- [ ] Matrix (Q85–Q92) — **Occasional**
- [ ] Stack/Queue (Q93–Q98) — **Occasional**
- [ ] Linked List (Q131–Q135) — **Prime only**

---

## 🛠️ INPUT FORMAT TIPS (Very Important for TCS iON)

```
# Standard input pattern used in TCS NQT:
N         ← first line is always size
a b c d   ← space-separated OR each on new line

# Python safe input:
n = int(input())
arr = list(map(int, input().split()))

# C safe input:
int n;
scanf("%d", &n);
for(int i=0;i<n;i++) scanf("%d", &arr[i]);
```

> ⚠️ Use **spaces not tabs** in Python on TCS iON compiler  
> ⚠️ No physical paper allowed — use on-screen rough pad  
> ⚠️ Don't look down — AI proctoring triggers warnings

---

*Total Questions: 140+ | Patterns: 15 | Source: TCS NQT PYQ 2020–2025*
