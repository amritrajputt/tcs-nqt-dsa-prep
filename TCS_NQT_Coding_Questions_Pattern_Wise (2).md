# TCS NQT Coding Questions — Pattern-Wise Complete Guide
> Covers all patterns asked in TCS NQT (Ninja / Digital / Prime) from 2020–2025  
> Pattern-wise, not topic-wise — so you don't skip any question type  
> Includes TakeUForward (Striver) Official NQT Sheet questions merged by pattern

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

### Q6. Move Zeroes to End
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

### Q23. Minimum Size Subarray with Sum >= S
Find shortest subarray whose sum is at least S.  
`Input: arr=[2,3,1,2,4,3], S=7` → `Output: 2`

---

## 🔢 PATTERN 3: Array Manipulation
> Direct array operations — most common TCS NQT pattern

### Q24. Find the Smallest Number in an Array
Without sorting, find minimum in a single pass.  
`Input: [5,2,8,1,9]` → `Output: 1`

### Q25. Find the Largest Number in an Array
Without sorting, find maximum in a single pass.  
`Input: [5,2,8,1,9]` → `Output: 9`

### Q26. Find Second Largest Element
Without sorting, find the 2nd largest in single pass.  
`Input: [12,35,1,10,34,1]` → `Output: 34`

### Q27. Second Smallest and Second Largest Element
Find both in a single pass without sorting.  
`Input: [12,35,1,10,34,1]` → `Output: SecondSmall=10, SecondLarge=34`

### Q28. Calculate Sum and Average of Array Elements
`Input: [10,20,30,40,50]` → `Output: Sum=150, Average=30.0`

### Q29. Find the Median of an Array
Sort first, then return middle element (or average of two middles for even length).  
`Input: [1,3,5,7,9]` → `Output: 5` | `Input: [2,4,6,8]` → `Output: 5.0`

### Q30. Reverse a Given Array
`Input: [1,2,3,4,5]` → `Output: [5,4,3,2,1]`

### Q31. Rotate Array by K Positions (Right)
Rotate array to the right by K steps.  
`Input: [1,2,3,4,5,6,7], K=3` → `Output: [5,6,7,1,2,3,4]`

### Q32. Circular / Left Rotation of Array by K Positions
`Input: [1,2,3,4,5], K=2` → `Output: [3,4,5,1,2]`

### Q33. Cyclically Rotate Array by 1
`Input: [1,2,3,4,5]` → `Output: [5,1,2,3,4]`

### Q34. Sort Array of 0s, 1s, and 2s (Dutch National Flag)
Sort without using inbuilt sort.  
`Input: [0,2,1,2,0,1]` → `Output: [0,0,1,1,2,2]`

### Q35. Find Missing Number in Array [1..N]
`Input: [1,2,4,5,6], N=6` → `Output: 3`

### Q36. Missing Numbers in Range [1..N] (Multiple Missing)
`Input: [4,3,2,7,8,2,3,1], N=8` → `Output: [5,6]`

### Q37. Find Duplicate Number in Array [1..N]
Array has N+1 elements, each between 1 to N, find the one duplicate.  
`Input: [1,3,4,2,2]` → `Output: 2`

### Q38. Find All Repeating Elements in an Array
Print every element that appears more than once.  
`Input: [1,2,3,1,3,6,6]` → `Output: 1,3,6`

### Q39. Find All Non-Repeating Elements in an Array
Print elements that appear exactly once.  
`Input: [1,2,3,1,3,6]` → `Output: 2,6`

### Q40. Kadane's Algorithm — Maximum Subarray Sum
Find maximum sum of any contiguous subarray.  
`Input: [-2,1,-3,4,-1,2,1,-5,4]` → `Output: 6`

### Q41. Maximum Product Subarray
Find contiguous subarray whose product is maximum.  
`Input: [2,3,-2,4]` → `Output: 6` | `Input: [-2,0,-1]` → `Output: 0`

### Q42. Product of Array Except Self
Return array where each element is product of all except itself. No division allowed.  
`Input: [1,2,3,4]` → `Output: [24,12,8,6]`

### Q43. Count Inversions in Array
Count pairs (i,j) where i < j but arr[i] > arr[j].  
`Input: [2,4,1,3,5]` → `Output: 3`

### Q44. Rearrange Positive and Negative Alternately
`Input: [-1,2,-3,4,-5,6]` → `Output: [2,-1,4,-3,6,-5]`

### Q45. Rearrange Array in Increasing-Decreasing Order
First half ascending, second half descending.  
`Input: [1,2,3,4,5,6,8]` → `Output: [1,2,3,4,8,6,5]`

### Q46. Leaders in an Array
An element is a leader if all elements to its right are smaller.  
`Input: [16,17,4,3,5,2]` → `Output: [17,5,2]`

### Q47. Trapping Rain Water
Given heights, find total water trapped.  
`Input: [0,1,0,2,1,0,1,3,2,1,2,1]` → `Output: 6`

### Q48. Stock Buy and Sell (Max Profit)
Find max profit with one buy and one sell.  
`Input: [7,1,5,3,6,4]` → `Output: 5`

### Q49. Majority Element (> N/2 times)
Find element appearing more than N/2 times (Boyer-Moore Voting).  
`Input: [2,2,1,1,1,2,2]` → `Output: 2`

### Q50. Wave Array
Arrange in a[0]>=a[1]<=a[2]>=a[3] pattern.  
`Input: [3,6,5,10,7,20]` → `Output: [6,3,10,5,20,7]`

### Q51. Remove Duplicates from Unsorted Array
Remove all duplicates preserving first occurrence order.  
`Input: [1,2,1,3,2,4]` → `Output: [1,2,3,4]`

### Q52. Add an Element at a Given Position in Array
Insert element X at index P, shift rest right.  
`Input: arr=[1,2,4,5], X=3, P=2` → `Output: [1,2,3,4,5]`

### Q53. Find All Symmetric Pairs in an Array of Pairs
A pair (a,b) is symmetric if (b,a) also exists.  
`Input: [[1,2],[3,4],[2,1],[4,3]]` → `Output: (1,2),(3,4)`

### Q54. Replace Each Element by Its Rank in the Array
Smallest gets rank 1, next gets rank 2, etc.  
`Input: [20,15,26,2,98,6]` → `Output: [4,3,5,1,6,2]`

### Q55. Sort Array According to Order Defined by Another Array
Elements present in order[] appear first (in that order), rest follow sorted.  
`Input: arr=[2,1,2,5,7,1,9,3,6,8,8], order=[2,1,8,3]` → `Output: [2,2,1,1,8,8,3,5,6,7,9]`

### Q56. Search an Element in an Array (Linear & Binary)
Implement linear search O(N) and binary search O(log N).  
`Input: arr=[10,20,30,40,50], target=30` → `Output: Found at index 2`

### Q57. Check if One Array is a Subset of Another
`Input: arr1=[11,1,13,21,3,7], arr2=[11,3,7,1]` → `Output: Yes`

### Q58. Find Subarray with Given Sum
`Input: arr=[1,4,20,3,10,5], sum=33` → `Output: Subarray from index 2 to 4`

---

## 🧵 PATTERN 4: String Manipulation
> Very frequent in TCS NQT — almost guaranteed 1 string question

### Q59. Reverse a String
`Input: "Hello"` → `Output: "olleH"`

### Q60. Reverse Words in a Sentence
`Input: "Hello World TCS"` → `Output: "TCS World Hello"`

### Q61. Reverse Only Letters in String (Skip Non-Alphabets)
`Input: "a-bC-dEf-ghIj"` → `Output: "j-Ih-gfE-dCba"`

### Q62. Check Anagram
Two strings are anagram if they have same characters with same frequency.  
`Input: "listen", "silent"` → `Output: Yes`

### Q63. Check if String is Rotation of Another
`Input: s1="ABCD", s2="CDAB"` → `Output: Yes`

### Q64. Longest Common Prefix
Find longest common prefix string among an array of strings.  
`Input: ["flower","flow","flight"]` → `Output: "fl"`

### Q65. Longest Palindromic Substring
`Input: "babad"` → `Output: "bab"`

### Q66. String Compression (Run-Length Encoding)
`Input: "aabcccccaaa"` → `Output: "a2b1c5a3"`

### Q67. Count Occurrences of Pattern in String
`Input: text="aababab", pattern="abab"` → `Output: 2`

### Q68. First Non-Repeating Character
`Input: "aabbcdde"` → `Output: 'c'`

### Q69. Remove All Vowels from String
`Input: "Hello World"` → `Output: "Hll Wrld"`

### Q70. Remove All Spaces from a String
`Input: "Hello World TCS"` → `Output: "HelloWorldTCS"`

### Q71. Remove All Characters Except Alphabets
Remove digits and special characters, keep only a–z, A–Z.  
`Input: "H3ll0 W@rld!"` → `Output: "HllWrld"`

### Q72. Remove Brackets from an Algebraic Expression
Remove `()`, `[]`, `{}` but keep all other characters.  
`Input: "(a+b)*(c-d)"` → `Output: "a+b*c-d"`

### Q73. Remove All Duplicate Characters (Keep First Occurrence)
`Input: "geeksforgeeks"` → `Output: "geksfor"`

### Q74. Print All Duplicate Characters in a String
Print characters that appear more than once (each printed once).  
`Input: "programming"` → `Output: r,g,m`

### Q75. Remove Characters from S1 That Are Present in S2
`Input: s1="they are students", s2="aeiou"` → `Output: "thy r stdnts"`

### Q76. Check Balanced Parentheses
`Input: "([{}])"` → `Output: Valid` | `Input: "([)]"` → `Output: Invalid`

### Q77. Count and Say
Generate the nth term of count-and-say sequence.  
`Input: n=4` → `Output: "1211"`

### Q78. Caesar Cipher (Shift K)
Shift each character by K positions.  
`Input: "ABC", K=3` → `Output: "DEF"`

### Q79. Find All Permutations of a String
`Input: "ABC"` → `Output: ABC, ACB, BAC, BCA, CAB, CBA`

### Q80. Count Vowels, Consonants, and Spaces in a String
`Input: "Hello World"` → `Output: Vowels=3, Consonants=7, Spaces=1`

### Q81. Find the ASCII Value of a Character
`Input: 'A'` → `Output: 65` | `Input: 'a'` → `Output: 97`

### Q82. Sum of All Numbers Embedded in a String
Extract all digit sequences and sum them.  
`Input: "abc12de3fg17"` → `Output: 32 (12+3+17)`

### Q83. Capitalize First and Last Character of Each Word
`Input: "hello world"` → `Output: "HellO WorlD"`

### Q84. Return Maximum Occurring Character in a String
`Input: "testsample"` → `Output: 't' (3 times)`

### Q85. Change Every Letter to the Next Lexicographic Alphabet
Increment each letter by 1; 'z' wraps to 'a'.  
`Input: "abcz"` → `Output: "bcda"`

### Q86. Find the Largest Word in a String (by Length)
`Input: "I love competitive programming"` → `Output: "programming"`

### Q87. Sort All Characters in a String
`Input: "geeksforgeeks"` → `Output: "eeeefgggkorss"`

### Q88. Find the Word with the Highest Number of Repeated Letters
`Input: "hello world programming"` → `Output: "programming"`

### Q89. Toggle Case of Every Character in a String
Uppercase → lowercase and vice versa.  
`Input: "Hello World"` → `Output: "hELLO wORLD"`

### Q90. Concatenate Two Strings Without Built-in Function
`Input: s1="Hello", s2=" World"` → `Output: "Hello World"`

### Q91. Find Substring Within a String and Return Starting Index
Implement without using find/indexOf.  
`Input: text="abcdefgh", pattern="cde"` → `Output: Found at index 2`

### Q92. Count the Number of Words in a String
Handle multiple consecutive spaces.  
`Input: "TCS NQT Coding Round"` → `Output: 4`

### Q93. Count Common Subsequences in Two Strings
`Input: s1="AXY", s2="AXZ"` → `Output: 4 (empty, "A", "X", "AX")`

### Q94. Check if Two Strings Match with Wildcard Characters
'?' matches one char; '*' matches any sequence including empty.  
`Input: pattern="h?llo*", text="hello world"` → `Output: Match`

---

## 🔢 PATTERN 5: Number Theory / Math
> Very common as Q1 in TCS NQT — easy to solve if formula known

### Q95. Check Prime Number
`Input: 29` → `Output: Prime`

### Q96. Find All Primes Up to N (Sieve of Eratosthenes)
`Input: N=30` → `Output: 2,3,5,7,11,13,17,19,23,29`

### Q97. Largest Prime Factor
`Input: 315` → `Output: 7`

### Q98. Check if N Can Be Expressed as Sum of Two Primes (Goldbach)
`Input: 18` → `Output: Yes (5+13, 7+11)`

### Q99. GCD and LCM
`Input: 12, 18` → `GCD: 6, LCM: 36`

### Q100. Fibonacci Series Up to N Terms
`Input: N=10` → `Output: 0 1 1 2 3 5 8 13 21 34`

### Q101. Fibonacci Series as Mixed Series — Find Nth Term
A series mixing Fibonacci and primes — find the Nth term.  
`Input: N=7` → `Output: 13`

### Q102. Factorial of N (Iterative + Recursive)
`Input: 6` → `Output: 720`

### Q103. Count Digits in Factorial
Find number of digits in N! without computing it (use log).  
`Input: 20` → `Output: 19`

### Q104. Check Perfect Number
Sum of proper divisors (excluding itself) equals the number.  
`Input: 28` → `Output: Perfect (1+2+4+7+14=28)`

### Q105. Check Armstrong Number
Sum of cubes of digits = the number.  
`Input: 153` → `Output: Armstrong (1³+5³+3³=153)`

### Q106. Check if a Number is a Strong Number
Sum of factorials of digits = the number itself.  
`Input: 145` → `Output: Strong (1!+4!+5!=145)`

### Q107. Check if a Number is Automorphic
A number whose square ends with itself.  
`Input: 25` → `Output: Automorphic (25²=625)` | `Input: 76` → `Output: Automorphic (76²=5776)`

### Q108. Check if a Number is a Harshad (Niven) Number
A number divisible by the sum of its digits.  
`Input: 18` → `Output: Harshad (digit sum=9, 18÷9=2)`

### Q109. Check if a Number is an Abundant Number
Sum of proper divisors > the number.  
`Input: 12` → `Output: Abundant (1+2+3+4+6=16>12)`

### Q110. Check if a Number is a Neon Number
Sum of digits of its square = the number itself.  
`Input: 9` → `Output: Neon (9²=81, 8+1=9)`

### Q111. Check if a Number is a Spy Number
Sum of digits = Product of digits.  
`Input: 1124` → `Output: Spy (1+1+2+4=8, 1×1×2×4=8)`

### Q112. Reverse a Number
`Input: 12345` → `Output: 54321`

### Q113. Check Palindrome Number
`Input: 12321` → `Output: Yes`

### Q114. Find All Palindrome Numbers in a Given Range
`Input: range [10,200]` → `Output: 11,22,33,...,191`

### Q115. Sum of Digits Until Single Digit (Digital Root)
`Input: 9875` → `Output: 2 (9+8+7+5=29 → 2+9=11 → 1+1=2)`

### Q116. Maximum and Minimum Digit in a Number
`Input: 3947` → `Output: Max=9, Min=3`

### Q117. Even or Odd (Bitwise Trick)
`Input: 7` → `Output: Odd` (hint: n & 1 == 1 means odd)

### Q118. Check Whether a Number is Positive or Negative
`Input: -5` → `Output: Negative`

### Q119. Sum of First N Natural Numbers
Using formula N*(N+1)/2.  
`Input: N=100` → `Output: 5050`

### Q120. Sum of All Numbers in a Given Range [N1, N2]
`Input: N1=5, N2=10` → `Output: 45`

### Q121. Greatest of Two Numbers
`Input: a=45, b=78` → `Output: 78`

### Q122. Greatest of Three Numbers
`Input: a=10, b=20, c=15` → `Output: 20`

### Q123. Leap Year or Not
Divisible by 4 and (not 100, or divisible by 400).  
`Input: 2024` → `Output: Leap Year` | `Input: 1900` → `Output: Not Leap`

### Q124. Nth Term and Sum of AP Series
`Input: first=2, diff=3, N=5` → `Output: Nth term=14, Sum=40`

### Q125. Sum of GP Series
`Input: first=1, ratio=2, N=8` → `Output: 255`

### Q126. Power Without Inbuilt Function (Fast Exponentiation)
Compute a^b mod m efficiently.  
`Input: a=2, b=10, m=1000` → `Output: 24`

### Q127. Find All Divisors of N
`Input: 36` → `Output: 1 2 3 4 6 9 12 18 36`

### Q128. Permutations P(N, R) — N People in R Seats
P(n,r) = n! / (n-r)!  
`Input: N=10, R=2` → `Output: 90`

### Q129. Add Two Fractions and Reduce to Lowest Terms
`Input: 1/2 + 3/4` → `Output: 5/4`

### Q130. Replace All 0s with 1s in an Integer
`Input: 1020304` → `Output: 1121314`

### Q131. Calculate Area of a Circle
`Input: radius=7` → `Output: 153.94`

### Q132. Find Roots of a Quadratic Equation ax²+bx+c=0
Use discriminant D=b²-4ac.  
`Input: a=1, b=-7, c=10` → `Output: x=5.0, x=2.0`

### Q133. Find All Pythagorean Triplets Up to N
Find all (a,b,c) where a²+b²=c² and all values ≤ N.  
`Input: N=20` → `Output: (3,4,5),(5,12,13),(6,8,10),(8,15,17)`

### Q134. Series: Sum of N Terms of 1 + 1/2 + 1/3 + ... + 1/N
`Input: N=5` → `Output: 2.283`

### Q135. Number of Digits Without Repeated Digits in Range [N1, N2]
`Input: N1=11, N2=15` → `Output: 4 (12,13,14,15)`

### Q136. Pattern Printing (Various TCS Favourites)
```
Pattern A (Star Triangle):      Pattern B (Number Pyramid):
    *                                1
   ***                              121
  *****                            12321
 *******                          1234321
```

---

## 💱 PATTERN 6: Number System Conversions
> Frequently appears directly in TCS NQT — know all 6 base conversions cold

### Q137. Convert Binary to Decimal
`Input: 1010` → `Output: 10`

### Q138. Convert Decimal to Binary
`Input: 25` → `Output: 11001`

### Q139. Convert Binary to Octal
Group binary digits in sets of 3 from right.  
`Input: 11001` → `Output: 31`

### Q140. Convert Octal to Binary
Expand each octal digit to 3 binary bits.  
`Input: 17` → `Output: 001111`

### Q141. Convert Decimal to Octal
`Input: 65` → `Output: 101`

### Q142. Convert Octal to Decimal
`Input: 17` → `Output: 15`

### Q143. Convert Decimal to Hexadecimal
`Input: 255` → `Output: FF`

### Q144. Convert Hexadecimal to Decimal
`Input: 1A` → `Output: 26`

### Q145. Convert Digits/Number to Words
`Input: 2025` → `Output: "Two Thousand Twenty Five"`

### Q146. Toggle All Bits After MSB (Including MSB)
Convert to binary, flip every bit, convert back.  
`Input: 10 (binary: 1010)` → `Output: 5 (flipped: 0101)`

---

## 🔀 PATTERN 7: Sorting Algorithms
> TCS explicitly asks to implement these — do not use built-in sort()

### Q147. Bubble Sort Algorithm
Repeatedly swap adjacent elements if in wrong order.  
`Input: [64,34,25,12,22,11,90]` → `Output: [11,12,22,25,34,64,90]`

### Q148. Selection Sort Algorithm
Find minimum from unsorted part and place at correct position each pass.  
`Input: [64,25,12,22,11]` → `Output: [11,12,22,25,64]`  
Time: O(N²) | Space: O(1)

### Q149. Insertion Sort Algorithm
Build sorted subarray one element at a time.  
`Input: [12,11,13,5,6]` → `Output: [5,6,11,12,13]`  
Time: O(N²) | Best Case: O(N) when nearly sorted

### Q150. Merge Sort Implementation
Divide and conquer sort.  
`Input: [38,27,43,3,9,82,10]` → `Output: [3,9,10,27,38,43,82]`

### Q151. Quick Sort Algorithm
Pick pivot, partition, recurse.  
`Input: [10,7,8,9,1,5]` → `Output: [1,5,7,8,9,10]`

### Q152. Find Kth Largest Element
Without full sorting, find Kth largest (use QuickSelect or min-heap).  
`Input: [3,2,1,5,6,4], K=2` → `Output: 5`

### Q153. Sort by Frequency
Sort array elements by their frequency (most frequent first).  
`Input: [2,3,2,4,5,12,2,3,3,3,12]` → `Output: [3,3,3,3,2,2,2,12,12,4,5]`

### Q154. Segregate Even and Odd Numbers
All even numbers before odd numbers.  
`Input: [1,2,3,4,5,6,7]` → `Output: [2,4,6,1,3,5,7]`

### Q155. Sort Array by Absolute Difference with X
Sort array elements by their absolute difference from X.  
`Input: arr=[10,5,3,9,2], X=7` → `Output: [5,9,10,3,2]`

### Q156. Minimum Swaps to Sort Array
Find minimum number of swaps needed to sort the array.  
`Input: [4,3,2,1]` → `Output: 2`

---

## 🔁 PATTERN 8: Recursion & Backtracking
> TCS Digital/Prime level questions

### Q157. Tower of Hanoi
Move N disks from source to destination using helper peg. Print each move.  
`Input: N=3` → `Output: Move disk 1 from A to C...`

### Q158. Generate All Subsets of Array
`Input: [1,2,3]` → `Output: [], [1], [2], [3], [1,2], [1,3], [2,3], [1,2,3]`

### Q159. N Queens Problem
Place N queens on NxN board such that no two attack each other.  
`Input: N=4` → `Output: [[0,1,0,0],[0,0,0,1],[1,0,0,0],[0,0,1,0]]`

### Q160. Print All Paths from Top-Left to Bottom-Right in Matrix
Only move right or down.  
`Input: 2x2 grid` → `Output: RD, DR`

### Q161. Word Search in Grid
Given a 2D board and word, check if word exists horizontally or vertically.  
`Input: board + "ABCCED"` → `Output: True`

### Q162. Rat in a Maze
Find all paths from (0,0) to (N-1,N-1) in a binary maze.  
`Input: N=4 maze grid` → `Output: DDRDRR, DRDDRR...`

### Q163. Phone Digit Letter Combinations
Given phone number digits, print all possible letter combinations.  
`Input: "23"` → `Output: ad,ae,af,bd,be,bf,cd,ce,cf`

---

## 🌲 PATTERN 9: Matrix / 2D Array
> Frequently appears as real-world problem (chocolate, gems, library)

### Q164. Spiral Order Traversal of Matrix
Print matrix elements in spiral order.  
`Input: [[1,2,3],[4,5,6],[7,8,9]]` → `Output: 1 2 3 6 9 8 7 4 5`

### Q165. Rotate Matrix by 90 Degrees
`Input: [[1,2,3],[4,5,6],[7,8,9]]` → `Output: [[7,4,1],[8,5,2],[9,6,3]]`

### Q166. Transpose of Matrix
`Input: [[1,2,3],[4,5,6]]` → `Output: [[1,4],[2,5],[3,6]]`

### Q167. Search in Row-wise and Column-wise Sorted Matrix
`Input: matrix + target=5` → `Output: Found at (0,2)`

### Q168. Find Maximum in Each Row
`Input: [[1,2,3],[4,5,6],[7,8,9]]` → `Output: [3,6,9]`

### Q169. Diagonal Sum of Matrix
Find sum of both diagonals (avoid double-counting center if odd size).  
`Input: [[1,2,3],[4,5,6],[7,8,9]]` → `Output: 25`

### Q170. Boundary Elements of Matrix
Print all border elements in clockwise order.  
`Input: 4x4 matrix` → `Output: all border elements`

### Q171. Count Islands (Connected 1s in Binary Matrix)
Count number of groups of connected 1s using DFS/BFS.  
`Input: binary matrix` → `Output: 3`

---

## 📦 PATTERN 10: Stack & Queue
> Stack solves "next greater / previous smaller" type problems

### Q172. Next Greater Element
For each element, find the next greater element to its right.  
`Input: [4,5,2,25]` → `Output: [5,25,25,-1]`

### Q173. Stock Span Problem
For each day, find how many consecutive days before it had lower/equal price.  
`Input: [100,80,60,70,60,75,85]` → `Output: [1,1,1,2,1,4,6]`

### Q174. Largest Rectangle in Histogram
Find largest rectangle area that can be formed using histogram bars.  
`Input: [2,1,5,6,2,3]` → `Output: 10`

### Q175. Reverse Queue Using Stack
`Input: Queue: 1←2←3←4←5` → `Output: Queue: 5←4←3←2←1`

### Q176. Queue Using Two Stacks
Implement queue with only 2 stacks. Enqueue into stack1, dequeue via stack2.

---

## 🔗 PATTERN 11: Hashing / Frequency Count
> Very common disguised pattern in TCS NQT

### Q177. Find Two Numbers with Sum = K (Using Hashing)
`Input: arr=[2,7,11,15], K=9` → `Output: (2,7)`

### Q178. Count Frequency of Each Element
`Input: [1,1,2,3,3,3,4]` → `Output: 1→2, 2→1, 3→3, 4→1`

### Q179. Check if Array Has Duplicate Within K Distance
`Input: arr=[1,2,3,1,4,5], K=3` → `Output: True`

### Q180. Subarray with 0 Sum
Check if any subarray has sum = 0.  
`Input: [4,2,-3,-1,0,4]` → `Output: Yes`

### Q181. Largest Subarray with Equal Number of 0s and 1s
`Input: [0,1,0,1,1,0,0]` → `Output: length 6`

### Q182. Count Distinct Pairs with Difference = K
`Input: arr=[1,5,3,4,2], K=3` → `Output: 2 pairs → (5,2) and (4,1)`

### Q183. Group Anagrams Together
`Input: ["eat","tea","tan","ate","nat","bat"]`  
`Output: [["eat","tea","ate"],["tan","nat"],["bat"]]`

---

## 🔁 PATTERN 12: Dynamic Programming
> For Prime role — at least one DP question expected

### Q184. 0/1 Knapsack Problem
Given weights and values, maximize value within capacity W.  
`Input: weights=[2,3,4,5], values=[3,4,5,6], W=5` → `Output: 7`

### Q185. Longest Common Subsequence (LCS)
`Input: s1="ABCBDAB", s2="BDCAB"` → `Output: 4 (BCAB)`

### Q186. Longest Increasing Subsequence (LIS)
`Input: [10,9,2,5,3,7,101,18]` → `Output: 4`

### Q187. Coin Change Problem
Minimum number of coins to make amount N.  
`Input: coins=[1,5,10,25], amount=30` → `Output: 2 (25+5)`

### Q188. Maximum Profit in Rod Cutting
Cut rod of length N to maximize revenue.  
`Input: lengths=[1..N], prices=[1,5,8,9,10,17,17,20]` → `Output: 22`

### Q189. Climbing Stairs (1 or 2 Steps at a Time)
How many distinct ways to climb N stairs?  
`Input: N=5` → `Output: 8`

### Q190. Maximum Sum Non-Adjacent Elements
Pick elements such that no two are adjacent; maximize sum.  
`Input: [2,1,4,9,5]` → `Output: 11 (2+9 or 2+4+5)`

### Q191. Edit Distance Between Two Strings
Minimum insert/delete/replace to convert s1 to s2.  
`Input: s1="horse", s2="ros"` → `Output: 3`

### Q192. Subset Sum = Target
Check if any subset has sum = K.  
`Input: arr=[3,34,4,12,5,2], K=9` → `Output: Yes (4+3+2)`

### Q193. Count Common Subsequences in Two Strings (DP approach)
`Input: s1="AXY", s2="AXZ"` → `Output: 4`

### Q194. Wildcard Pattern Matching (DP approach)
`Input: pattern="h?llo*", text="hello world"` → `Output: Match`

---

## 🌐 PATTERN 13: Real-World Disguised Problems
> TCS wraps simple logic in stories — don't let the story confuse you

### Q195. Chocolate Distribution Problem
Given N chocolates and M students, minimize (max − min) chocolates distributed.  
`Input: arr=[3,4,1,9,56,7,9,12], M=5` → `Output: 6`

### Q196. Conveyor Belt — Move Empty Packets to End
Empty packets (0) go to the end; non-zero keep relative order.  
`Input: [4,5,0,1,9,0,5,0]` → `Output: [4,5,1,9,5,0,0,0]`

### Q197. Gem Counting in Library (Frequency Map)
Count distinct gem types the traveler has.  
`Input: gems="aAabbBBb"` → `Output: 4 distinct types`

### Q198. Points on a Straight Line
Given N points, find maximum number that lie on the same line.  
`Input: [[1,1],[2,2],[3,3]]` → `Output: 3`

### Q199. Candy Distribution (Greedy)
N children with ratings — give minimum candies so higher rating = more candy.  
`Input: ratings=[1,0,2]` → `Output: 5 (2,1,2)`

### Q200. Balanced Brackets in Expression (Real-world)
Check if a mathematical expression has balanced brackets.  
`Input: "((a+b)*(c-d))"` → `Output: Valid`

### Q201. Number of Digits Without Repeated Digits in Range [N1, N2]
`Input: N1=11, N2=15` → `Output: 4 (12,13,14,15)`

### Q202. Missing Numbers in Range [1..N]
`Input: [4,3,2,7,8,2,3,1], N=8` → `Output: [5,6]`

### Q203. Series: Sum of Harmonic Terms 1 + 1/2 + 1/3 + ... + 1/N
`Input: N=5` → `Output: 2.283`

---

## 💡 PATTERN 14: Bit Manipulation
> Occasional appearance in TCS Digital round

### Q204. Check if Number is Power of 2
`Input: 64` → `Output: Yes` (hint: n & (n-1) == 0)

### Q205. Swap Two Numbers Without Temp Variable (Using XOR)
`Input: a=5, b=7` → `Output: a=7, b=5`

### Q206. Find Non-Repeating Element (All Others Repeat Twice)
`Input: [2,3,5,4,5,3,4]` → `Output: 2`

### Q207. Toggle Bits Between Positions L and R
`Input: N=170 (10101010), L=2, R=4` → `Output: 175 (10101111)`

### Q208. Count Bits to Convert A to B (Hamming Distance)
`Input: A=10, B=20` → `Output: 4`

### Q209. Count Set Bits in a Number
`Input: 9 (1001 in binary)` → `Output: 2`

### Q210. XOR of All Elements in Range [1..N]
`Input: N=6` → `Output: 7` (uses XOR pattern: 1 if N%4==1, N+1 if N%4==2, 0 if N%4==3, N if N%4==0)

---

## 📊 PATTERN 15: Linked List
> TCS Prime Only

### Q211. Reverse a Linked List
`Input: 1→2→3→4→5` → `Output: 5→4→3→2→1`

### Q212. Detect Cycle in Linked List (Floyd's Algorithm)
Return true if a cycle exists using slow and fast pointers.

### Q213. Find Middle of Linked List (Slow-Fast Pointer)
`Input: 1→2→3→4→5` → `Output: 3`

### Q214. Merge Two Sorted Linked Lists
`Input: L1=1→2→4, L2=1→3→4` → `Output: 1→1→2→3→4→4`

### Q215. Remove Nth Node from End
`Input: 1→2→3→4→5, N=2` → `Output: 1→2→3→5`

---

## 🔄 PATTERN 16: Prefix Sum / Difference Array
> Hidden pattern — appears in many TCS questions

### Q216. Range Sum Query
Precompute prefix sums. Answer multiple sum queries in O(1).  
`Input: arr=[1,3,5,7,9], query(1,3)` → `Output: 15`

### Q217. Count Subarrays with Sum = K
`Input: arr=[1,1,1], K=2` → `Output: 2`

### Q218. Equilibrium Index of Array
Find index where sum of left elements = sum of right elements.  
`Input: [3,4,-7,3,1,3,1,-4,-2,-2]` → `Output: 3`

### Q219. Maximum Circular Subarray Sum
Extend Kadane's to handle circular arrays.  
`Input: [8,-1,3,-2]` → `Output: 12`

---

## ✅ TCS NQT QUICK CHECKLIST

### Patterns Priority Order:
| Priority | Pattern | Questions | TCS Round |
|---|---|---|---|
| ⭐⭐⭐ | Array Manipulation (P3) | Q24–Q58 | All rounds |
| ⭐⭐⭐ | String Manipulation (P4) | Q59–Q94 | All rounds |
| ⭐⭐⭐ | Number Theory / Math (P5) | Q95–Q136 | All rounds |
| ⭐⭐⭐ | Number System (P6) | Q137–Q146 | All rounds |
| ⭐⭐ | Two Pointer (P1) | Q1–Q10 | Ninja/Digital |
| ⭐⭐ | Sliding Window (P2) | Q11–Q23 | Ninja/Digital |
| ⭐⭐ | Sorting (P7) | Q147–Q156 | Ninja/Digital |
| ⭐⭐ | Hashing (P11) | Q177–Q183 | Ninja/Digital |
| ⭐⭐ | Real-World Problems (P13) | Q195–Q203 | All rounds |
| ⭐ | Recursion & DP (P8, P12) | Q157–Q163, Q184–Q194 | Digital/Prime |
| ⭐ | Matrix (P9) | Q164–Q171 | Occasional |
| ⭐ | Stack & Queue (P10) | Q172–Q176 | Occasional |
| ⭐ | Bit Manipulation (P14) | Q204–Q210 | Digital only |
| ⭐ | Linked List (P15) | Q211–Q215 | Prime only |
| ⭐ | Prefix Sum (P16) | Q216–Q219 | Digital/Prime |

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

*Total Questions: 219 | Patterns: 16 | Sources: TCS NQT PYQ 2020–2025 + TakeUForward (Striver) Official NQT Sheet*
