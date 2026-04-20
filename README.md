# 🚀 LeetCode Solutions Repository

Welcome to my **LeetCode Solutions** repository! This repo documents my journey of solving Data Structures and Algorithms (DSA) problems to strengthen my problem-solving skills and prepare for technical interviews.

## 📌 About the Repository

* 📚 Contains solutions to a wide range of LeetCode problems.
* 🧠 Focuses on improving algorithmic thinking and coding efficiency.
* 🏆 Covers problems frequently asked in technical interviews.
* 📈 Tracks my progress and consistency in competitive programming.
* ✨ Includes optimized and well-structured solutions.

---

## 🛠️ Languages Used

* ☕ Java
* 💻 C++
* 🐍 Python
* 📘 C

---

## 📂 Repository Structure

```
LeetCode/
│── Arrays/
│── Strings/
│── LinkedList/
│── Stack/
│── Queue/
│── Trees/
│── Graphs/
│── Dynamic Programming/
│── Greedy/
│── Recursion/
│── Backtracking/
│── Binary Search/
│── Hashing/
│── Math/
│── SQL/
│── README.md
```

---

## 📊 Progress Tracker

| Category                 | Problems Solved |
| ------------------------ | --------------- |
| Arrays                   | ⬜               |
| Strings                  | ⬜               |
| Linked Lists             | ⬜               |
| Stack & Queue            | ⬜               |
| Trees                    | ⬜               |
| Graphs                   | ⬜               |
| Dynamic Programming      | ⬜               |
| Greedy                   | ⬜               |
| Recursion & Backtracking | ⬜               |
| Binary Search            | ⬜               |
| Hashing                  | ⬜               |
| Math                     | ⬜               |
| SQL                      | ⬜               |

---

## 📝 Problem Format

Each solution follows this structure:

```
Problem Name
├── Problem Link
├── Approach
├── Time Complexity
├── Space Complexity
└── Solution Code
```

Example:

```java
// Two Sum - https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
```

**Time Complexity:** O(n)
**Space Complexity:** O(n)

---

## 🎯 Goals

* Solve **500+ LeetCode problems**.
* Master **Data Structures and Algorithms**.
* Strengthen problem-solving and optimization skills.
* Prepare for top tech company interviews.
* Maintain daily coding consistency.

---

## 🌟 How to Use This Repository

1. Browse problems by topic.
2. Review approaches and optimizations.
3. Practice similar problems on LeetCode.
4. Track your learning progress.

---

## 🔗 LeetCode Profile

Add your profile link here:
**👉 https://leetcode.com/u/Shivangpathak11/

---

## 🤝 Contributions

This is a personal repository, but suggestions and improvements are always welcome.

---

## 📜 License

This project is licensed under the MIT License.

---

## ⭐ Support

If you find this repository helpful, consider giving it a **star**!

**Happy Coding! 🚀**

<!---LeetCode Topics Start-->
# LeetCode Topics
## Array
|  |
| ------- |
| [0001-two-sum](https://github.com/Shivang1109/Leetcode/tree/master/0001-two-sum) |
| [0027-remove-element](https://github.com/Shivang1109/Leetcode/tree/master/0027-remove-element) |
| [0035-search-insert-position](https://github.com/Shivang1109/Leetcode/tree/master/0035-search-insert-position) |
| [0053-maximum-subarray](https://github.com/Shivang1109/Leetcode/tree/master/0053-maximum-subarray) |
| [0075-sort-colors](https://github.com/Shivang1109/Leetcode/tree/master/0075-sort-colors) |
| [0136-single-number](https://github.com/Shivang1109/Leetcode/tree/master/0136-single-number) |
| [0217-contains-duplicate](https://github.com/Shivang1109/Leetcode/tree/master/0217-contains-duplicate) |
| [0240-search-a-2d-matrix-ii](https://github.com/Shivang1109/Leetcode/tree/master/0240-search-a-2d-matrix-ii) |
| [0268-missing-number](https://github.com/Shivang1109/Leetcode/tree/master/0268-missing-number) |
| [0283-move-zeroes](https://github.com/Shivang1109/Leetcode/tree/master/0283-move-zeroes) |
| [0704-binary-search](https://github.com/Shivang1109/Leetcode/tree/master/0704-binary-search) |
| [0747-largest-number-at-least-twice-of-others](https://github.com/Shivang1109/Leetcode/tree/master/0747-largest-number-at-least-twice-of-others) |
| [0867-transpose-matrix](https://github.com/Shivang1109/Leetcode/tree/master/0867-transpose-matrix) |
| [0905-sort-array-by-parity](https://github.com/Shivang1109/Leetcode/tree/master/0905-sort-array-by-parity) |
| [0922-sort-array-by-parity-ii](https://github.com/Shivang1109/Leetcode/tree/master/0922-sort-array-by-parity-ii) |
| [0976-largest-perimeter-triangle](https://github.com/Shivang1109/Leetcode/tree/master/0976-largest-perimeter-triangle) |
| [0977-squares-of-a-sorted-array](https://github.com/Shivang1109/Leetcode/tree/master/0977-squares-of-a-sorted-array) |
| [1346-check-if-n-and-its-double-exist](https://github.com/Shivang1109/Leetcode/tree/master/1346-check-if-n-and-its-double-exist) |
| [1450-number-of-students-doing-homework-at-a-given-time](https://github.com/Shivang1109/Leetcode/tree/master/1450-number-of-students-doing-homework-at-a-given-time) |
| [1464-maximum-product-of-two-elements-in-an-array](https://github.com/Shivang1109/Leetcode/tree/master/1464-maximum-product-of-two-elements-in-an-array) |
| [1470-shuffle-the-array](https://github.com/Shivang1109/Leetcode/tree/master/1470-shuffle-the-array) |
| [1480-running-sum-of-1d-array](https://github.com/Shivang1109/Leetcode/tree/master/1480-running-sum-of-1d-array) |
| [1491-average-salary-excluding-the-minimum-and-maximum-salary](https://github.com/Shivang1109/Leetcode/tree/master/1491-average-salary-excluding-the-minimum-and-maximum-salary) |
| [1512-number-of-good-pairs](https://github.com/Shivang1109/Leetcode/tree/master/1512-number-of-good-pairs) |
| [1528-shuffle-string](https://github.com/Shivang1109/Leetcode/tree/master/1528-shuffle-string) |
| [1572-matrix-diagonal-sum](https://github.com/Shivang1109/Leetcode/tree/master/1572-matrix-diagonal-sum) |
| [1619-mean-of-array-after-removing-some-elements](https://github.com/Shivang1109/Leetcode/tree/master/1619-mean-of-array-after-removing-some-elements) |
| [1629-slowest-key](https://github.com/Shivang1109/Leetcode/tree/master/1629-slowest-key) |
| [1646-get-maximum-in-generated-array](https://github.com/Shivang1109/Leetcode/tree/master/1646-get-maximum-in-generated-array) |
| [1672-richest-customer-wealth](https://github.com/Shivang1109/Leetcode/tree/master/1672-richest-customer-wealth) |
| [1720-decode-xored-array](https://github.com/Shivang1109/Leetcode/tree/master/1720-decode-xored-array) |
| [1732-find-the-highest-altitude](https://github.com/Shivang1109/Leetcode/tree/master/1732-find-the-highest-altitude) |
| [1822-sign-of-the-product-of-an-array](https://github.com/Shivang1109/Leetcode/tree/master/1822-sign-of-the-product-of-an-array) |
| [1979-find-greatest-common-divisor-of-array](https://github.com/Shivang1109/Leetcode/tree/master/1979-find-greatest-common-divisor-of-array) |
| [2078-two-furthest-houses-with-different-colors](https://github.com/Shivang1109/Leetcode/tree/master/2078-two-furthest-houses-with-different-colors) |
| [2239-find-closest-number-to-zero](https://github.com/Shivang1109/Leetcode/tree/master/2239-find-closest-number-to-zero) |
| [2455-average-value-of-even-numbers-that-are-divisible-by-three](https://github.com/Shivang1109/Leetcode/tree/master/2455-average-value-of-even-numbers-that-are-divisible-by-three) |
| [2529-maximum-count-of-positive-integer-and-negative-integer](https://github.com/Shivang1109/Leetcode/tree/master/2529-maximum-count-of-positive-integer-and-negative-integer) |
| [2535-difference-between-element-sum-and-digit-sum-of-an-array](https://github.com/Shivang1109/Leetcode/tree/master/2535-difference-between-element-sum-and-digit-sum-of-an-array) |
| [2540-minimum-common-value](https://github.com/Shivang1109/Leetcode/tree/master/2540-minimum-common-value) |
| [2656-maximum-sum-with-exactly-k-elements](https://github.com/Shivang1109/Leetcode/tree/master/2656-maximum-sum-with-exactly-k-elements) |
| [2733-neither-minimum-nor-maximum](https://github.com/Shivang1109/Leetcode/tree/master/2733-neither-minimum-nor-maximum) |
| [2778-sum-of-squares-of-special-elements](https://github.com/Shivang1109/Leetcode/tree/master/2778-sum-of-squares-of-special-elements) |
| [2903-find-indices-with-index-and-value-difference-i](https://github.com/Shivang1109/Leetcode/tree/master/2903-find-indices-with-index-and-value-difference-i) |
| [2996-smallest-missing-integer-greater-than-sequential-prefix-sum](https://github.com/Shivang1109/Leetcode/tree/master/2996-smallest-missing-integer-greater-than-sequential-prefix-sum) |
| [3000-maximum-area-of-longest-diagonal-rectangle](https://github.com/Shivang1109/Leetcode/tree/master/3000-maximum-area-of-longest-diagonal-rectangle) |
| [3024-type-of-triangle](https://github.com/Shivang1109/Leetcode/tree/master/3024-type-of-triangle) |
| [3131-find-the-integer-added-to-array-i](https://github.com/Shivang1109/Leetcode/tree/master/3131-find-the-integer-added-to-array-i) |
| [3194-minimum-average-of-smallest-and-largest-elements](https://github.com/Shivang1109/Leetcode/tree/master/3194-minimum-average-of-smallest-and-largest-elements) |
| [3550-smallest-index-with-digit-sum-equal-to-index](https://github.com/Shivang1109/Leetcode/tree/master/3550-smallest-index-with-digit-sum-equal-to-index) |
| [3678-smallest-absent-positive-greater-than-average](https://github.com/Shivang1109/Leetcode/tree/master/3678-smallest-absent-positive-greater-than-average) |
| [3688-bitwise-or-of-even-numbers-in-an-array](https://github.com/Shivang1109/Leetcode/tree/master/3688-bitwise-or-of-even-numbers-in-an-array) |
| [3701-compute-alternating-sum](https://github.com/Shivang1109/Leetcode/tree/master/3701-compute-alternating-sum) |
| [3774-absolute-difference-between-maximum-and-minimum-k-elements](https://github.com/Shivang1109/Leetcode/tree/master/3774-absolute-difference-between-maximum-and-minimum-k-elements) |
## Math
|  |
| ------- |
| [0007-reverse-integer](https://github.com/Shivang1109/Leetcode/tree/master/0007-reverse-integer) |
| [0009-palindrome-number](https://github.com/Shivang1109/Leetcode/tree/master/0009-palindrome-number) |
| [0069-sqrtx](https://github.com/Shivang1109/Leetcode/tree/master/0069-sqrtx) |
| [0231-power-of-two](https://github.com/Shivang1109/Leetcode/tree/master/0231-power-of-two) |
| [0258-add-digits](https://github.com/Shivang1109/Leetcode/tree/master/0258-add-digits) |
| [0268-missing-number](https://github.com/Shivang1109/Leetcode/tree/master/0268-missing-number) |
| [0326-power-of-three](https://github.com/Shivang1109/Leetcode/tree/master/0326-power-of-three) |
| [0342-power-of-four](https://github.com/Shivang1109/Leetcode/tree/master/0342-power-of-four) |
| [0504-base-7](https://github.com/Shivang1109/Leetcode/tree/master/0504-base-7) |
| [0507-perfect-number](https://github.com/Shivang1109/Leetcode/tree/master/0507-perfect-number) |
| [0509-fibonacci-number](https://github.com/Shivang1109/Leetcode/tree/master/0509-fibonacci-number) |
| [0976-largest-perimeter-triangle](https://github.com/Shivang1109/Leetcode/tree/master/0976-largest-perimeter-triangle) |
| [1137-n-th-tribonacci-number](https://github.com/Shivang1109/Leetcode/tree/master/1137-n-th-tribonacci-number) |
| [1281-subtract-the-product-and-sum-of-digits-of-an-integer](https://github.com/Shivang1109/Leetcode/tree/master/1281-subtract-the-product-and-sum-of-digits-of-an-integer) |
| [1342-number-of-steps-to-reduce-a-number-to-zero](https://github.com/Shivang1109/Leetcode/tree/master/1342-number-of-steps-to-reduce-a-number-to-zero) |
| [1486-xor-operation-in-an-array](https://github.com/Shivang1109/Leetcode/tree/master/1486-xor-operation-in-an-array) |
| [1512-number-of-good-pairs](https://github.com/Shivang1109/Leetcode/tree/master/1512-number-of-good-pairs) |
| [1523-count-odd-numbers-in-an-interval-range](https://github.com/Shivang1109/Leetcode/tree/master/1523-count-odd-numbers-in-an-interval-range) |
| [1688-count-of-matches-in-tournament](https://github.com/Shivang1109/Leetcode/tree/master/1688-count-of-matches-in-tournament) |
| [1822-sign-of-the-product-of-an-array](https://github.com/Shivang1109/Leetcode/tree/master/1822-sign-of-the-product-of-an-array) |
| [1837-sum-of-digits-in-base-k](https://github.com/Shivang1109/Leetcode/tree/master/1837-sum-of-digits-in-base-k) |
| [1952-three-divisors](https://github.com/Shivang1109/Leetcode/tree/master/1952-three-divisors) |
| [1979-find-greatest-common-divisor-of-array](https://github.com/Shivang1109/Leetcode/tree/master/1979-find-greatest-common-divisor-of-array) |
| [2119-a-number-after-a-double-reversal](https://github.com/Shivang1109/Leetcode/tree/master/2119-a-number-after-a-double-reversal) |
| [2235-add-two-integers](https://github.com/Shivang1109/Leetcode/tree/master/2235-add-two-integers) |
| [2396-strictly-palindromic-number](https://github.com/Shivang1109/Leetcode/tree/master/2396-strictly-palindromic-number) |
| [2413-smallest-even-multiple](https://github.com/Shivang1109/Leetcode/tree/master/2413-smallest-even-multiple) |
| [2427-number-of-common-factors](https://github.com/Shivang1109/Leetcode/tree/master/2427-number-of-common-factors) |
| [2455-average-value-of-even-numbers-that-are-divisible-by-three](https://github.com/Shivang1109/Leetcode/tree/master/2455-average-value-of-even-numbers-that-are-divisible-by-three) |
| [2469-convert-the-temperature](https://github.com/Shivang1109/Leetcode/tree/master/2469-convert-the-temperature) |
| [2520-count-the-digits-that-divide-a-number](https://github.com/Shivang1109/Leetcode/tree/master/2520-count-the-digits-that-divide-a-number) |
| [2525-categorize-box-according-to-criteria](https://github.com/Shivang1109/Leetcode/tree/master/2525-categorize-box-according-to-criteria) |
| [2535-difference-between-element-sum-and-digit-sum-of-an-array](https://github.com/Shivang1109/Leetcode/tree/master/2535-difference-between-element-sum-and-digit-sum-of-an-array) |
| [2600-k-items-with-the-maximum-sum](https://github.com/Shivang1109/Leetcode/tree/master/2600-k-items-with-the-maximum-sum) |
| [2651-calculate-delayed-arrival-time](https://github.com/Shivang1109/Leetcode/tree/master/2651-calculate-delayed-arrival-time) |
| [2652-sum-multiples](https://github.com/Shivang1109/Leetcode/tree/master/2652-sum-multiples) |
| [2769-find-the-maximum-achievable-number](https://github.com/Shivang1109/Leetcode/tree/master/2769-find-the-maximum-achievable-number) |
| [2806-account-balance-after-rounded-purchase](https://github.com/Shivang1109/Leetcode/tree/master/2806-account-balance-after-rounded-purchase) |
| [2894-divisible-and-non-divisible-sums-difference](https://github.com/Shivang1109/Leetcode/tree/master/2894-divisible-and-non-divisible-sums-difference) |
| [3024-type-of-triangle](https://github.com/Shivang1109/Leetcode/tree/master/3024-type-of-triangle) |
| [3516-find-closest-person](https://github.com/Shivang1109/Leetcode/tree/master/3516-find-closest-person) |
| [3536-maximum-product-of-two-digits](https://github.com/Shivang1109/Leetcode/tree/master/3536-maximum-product-of-two-digits) |
| [3550-smallest-index-with-digit-sum-equal-to-index](https://github.com/Shivang1109/Leetcode/tree/master/3550-smallest-index-with-digit-sum-equal-to-index) |
| [3658-gcd-of-odd-and-even-sums](https://github.com/Shivang1109/Leetcode/tree/master/3658-gcd-of-odd-and-even-sums) |
| [3783-mirror-distance-of-an-integer](https://github.com/Shivang1109/Leetcode/tree/master/3783-mirror-distance-of-an-integer) |
## Number Theory
|  |
| ------- |
| [0258-add-digits](https://github.com/Shivang1109/Leetcode/tree/master/0258-add-digits) |
| [1952-three-divisors](https://github.com/Shivang1109/Leetcode/tree/master/1952-three-divisors) |
| [1979-find-greatest-common-divisor-of-array](https://github.com/Shivang1109/Leetcode/tree/master/1979-find-greatest-common-divisor-of-array) |
| [2413-smallest-even-multiple](https://github.com/Shivang1109/Leetcode/tree/master/2413-smallest-even-multiple) |
| [2427-number-of-common-factors](https://github.com/Shivang1109/Leetcode/tree/master/2427-number-of-common-factors) |
| [3658-gcd-of-odd-and-even-sums](https://github.com/Shivang1109/Leetcode/tree/master/3658-gcd-of-odd-and-even-sums) |
## Enumeration
|  |
| ------- |
| [1952-three-divisors](https://github.com/Shivang1109/Leetcode/tree/master/1952-three-divisors) |
| [2427-number-of-common-factors](https://github.com/Shivang1109/Leetcode/tree/master/2427-number-of-common-factors) |
| [2778-sum-of-squares-of-special-elements](https://github.com/Shivang1109/Leetcode/tree/master/2778-sum-of-squares-of-special-elements) |
## String
|  |
| ------- |
| [0020-valid-parentheses](https://github.com/Shivang1109/Leetcode/tree/master/0020-valid-parentheses) |
| [0504-base-7](https://github.com/Shivang1109/Leetcode/tree/master/0504-base-7) |
| [0657-robot-return-to-origin](https://github.com/Shivang1109/Leetcode/tree/master/0657-robot-return-to-origin) |
| [0709-to-lower-case](https://github.com/Shivang1109/Leetcode/tree/master/0709-to-lower-case) |
| [1528-shuffle-string](https://github.com/Shivang1109/Leetcode/tree/master/1528-shuffle-string) |
| [1629-slowest-key](https://github.com/Shivang1109/Leetcode/tree/master/1629-slowest-key) |
| [3019-number-of-changing-keys](https://github.com/Shivang1109/Leetcode/tree/master/3019-number-of-changing-keys) |
| [3884-first-matching-character-from-both-ends](https://github.com/Shivang1109/Leetcode/tree/master/3884-first-matching-character-from-both-ends) |
## Bit Manipulation
|  |
| ------- |
| [0136-single-number](https://github.com/Shivang1109/Leetcode/tree/master/0136-single-number) |
| [0231-power-of-two](https://github.com/Shivang1109/Leetcode/tree/master/0231-power-of-two) |
| [0268-missing-number](https://github.com/Shivang1109/Leetcode/tree/master/0268-missing-number) |
| [0338-counting-bits](https://github.com/Shivang1109/Leetcode/tree/master/0338-counting-bits) |
| [0342-power-of-four](https://github.com/Shivang1109/Leetcode/tree/master/0342-power-of-four) |
| [0461-hamming-distance](https://github.com/Shivang1109/Leetcode/tree/master/0461-hamming-distance) |
| [1342-number-of-steps-to-reduce-a-number-to-zero](https://github.com/Shivang1109/Leetcode/tree/master/1342-number-of-steps-to-reduce-a-number-to-zero) |
| [1486-xor-operation-in-an-array](https://github.com/Shivang1109/Leetcode/tree/master/1486-xor-operation-in-an-array) |
| [1720-decode-xored-array](https://github.com/Shivang1109/Leetcode/tree/master/1720-decode-xored-array) |
| [3688-bitwise-or-of-even-numbers-in-an-array](https://github.com/Shivang1109/Leetcode/tree/master/3688-bitwise-or-of-even-numbers-in-an-array) |
## Stack
|  |
| ------- |
| [0020-valid-parentheses](https://github.com/Shivang1109/Leetcode/tree/master/0020-valid-parentheses) |
| [0155-min-stack](https://github.com/Shivang1109/Leetcode/tree/master/0155-min-stack) |
## Binary Search
|  |
| ------- |
| [0035-search-insert-position](https://github.com/Shivang1109/Leetcode/tree/master/0035-search-insert-position) |
| [0069-sqrtx](https://github.com/Shivang1109/Leetcode/tree/master/0069-sqrtx) |
| [0240-search-a-2d-matrix-ii](https://github.com/Shivang1109/Leetcode/tree/master/0240-search-a-2d-matrix-ii) |
| [0268-missing-number](https://github.com/Shivang1109/Leetcode/tree/master/0268-missing-number) |
| [0704-binary-search](https://github.com/Shivang1109/Leetcode/tree/master/0704-binary-search) |
| [1346-check-if-n-and-its-double-exist](https://github.com/Shivang1109/Leetcode/tree/master/1346-check-if-n-and-its-double-exist) |
| [2529-maximum-count-of-positive-integer-and-negative-integer](https://github.com/Shivang1109/Leetcode/tree/master/2529-maximum-count-of-positive-integer-and-negative-integer) |
| [2540-minimum-common-value](https://github.com/Shivang1109/Leetcode/tree/master/2540-minimum-common-value) |
## Hash Table
|  |
| ------- |
| [0001-two-sum](https://github.com/Shivang1109/Leetcode/tree/master/0001-two-sum) |
| [0217-contains-duplicate](https://github.com/Shivang1109/Leetcode/tree/master/0217-contains-duplicate) |
| [0268-missing-number](https://github.com/Shivang1109/Leetcode/tree/master/0268-missing-number) |
| [1346-check-if-n-and-its-double-exist](https://github.com/Shivang1109/Leetcode/tree/master/1346-check-if-n-and-its-double-exist) |
| [1512-number-of-good-pairs](https://github.com/Shivang1109/Leetcode/tree/master/1512-number-of-good-pairs) |
| [2540-minimum-common-value](https://github.com/Shivang1109/Leetcode/tree/master/2540-minimum-common-value) |
| [2996-smallest-missing-integer-greater-than-sequential-prefix-sum](https://github.com/Shivang1109/Leetcode/tree/master/2996-smallest-missing-integer-greater-than-sequential-prefix-sum) |
| [3678-smallest-absent-positive-greater-than-average](https://github.com/Shivang1109/Leetcode/tree/master/3678-smallest-absent-positive-greater-than-average) |
## Sorting
|  |
| ------- |
| [0075-sort-colors](https://github.com/Shivang1109/Leetcode/tree/master/0075-sort-colors) |
| [0217-contains-duplicate](https://github.com/Shivang1109/Leetcode/tree/master/0217-contains-duplicate) |
| [0268-missing-number](https://github.com/Shivang1109/Leetcode/tree/master/0268-missing-number) |
| [0747-largest-number-at-least-twice-of-others](https://github.com/Shivang1109/Leetcode/tree/master/0747-largest-number-at-least-twice-of-others) |
| [0905-sort-array-by-parity](https://github.com/Shivang1109/Leetcode/tree/master/0905-sort-array-by-parity) |
| [0922-sort-array-by-parity-ii](https://github.com/Shivang1109/Leetcode/tree/master/0922-sort-array-by-parity-ii) |
| [0976-largest-perimeter-triangle](https://github.com/Shivang1109/Leetcode/tree/master/0976-largest-perimeter-triangle) |
| [0977-squares-of-a-sorted-array](https://github.com/Shivang1109/Leetcode/tree/master/0977-squares-of-a-sorted-array) |
| [1346-check-if-n-and-its-double-exist](https://github.com/Shivang1109/Leetcode/tree/master/1346-check-if-n-and-its-double-exist) |
| [1464-maximum-product-of-two-elements-in-an-array](https://github.com/Shivang1109/Leetcode/tree/master/1464-maximum-product-of-two-elements-in-an-array) |
| [1491-average-salary-excluding-the-minimum-and-maximum-salary](https://github.com/Shivang1109/Leetcode/tree/master/1491-average-salary-excluding-the-minimum-and-maximum-salary) |
| [1619-mean-of-array-after-removing-some-elements](https://github.com/Shivang1109/Leetcode/tree/master/1619-mean-of-array-after-removing-some-elements) |
| [2733-neither-minimum-nor-maximum](https://github.com/Shivang1109/Leetcode/tree/master/2733-neither-minimum-nor-maximum) |
| [2996-smallest-missing-integer-greater-than-sequential-prefix-sum](https://github.com/Shivang1109/Leetcode/tree/master/2996-smallest-missing-integer-greater-than-sequential-prefix-sum) |
| [3024-type-of-triangle](https://github.com/Shivang1109/Leetcode/tree/master/3024-type-of-triangle) |
| [3194-minimum-average-of-smallest-and-largest-elements](https://github.com/Shivang1109/Leetcode/tree/master/3194-minimum-average-of-smallest-and-largest-elements) |
| [3536-maximum-product-of-two-digits](https://github.com/Shivang1109/Leetcode/tree/master/3536-maximum-product-of-two-digits) |
| [3774-absolute-difference-between-maximum-and-minimum-k-elements](https://github.com/Shivang1109/Leetcode/tree/master/3774-absolute-difference-between-maximum-and-minimum-k-elements) |
## Simulation
|  |
| ------- |
| [0258-add-digits](https://github.com/Shivang1109/Leetcode/tree/master/0258-add-digits) |
| [0657-robot-return-to-origin](https://github.com/Shivang1109/Leetcode/tree/master/0657-robot-return-to-origin) |
| [0867-transpose-matrix](https://github.com/Shivang1109/Leetcode/tree/master/0867-transpose-matrix) |
| [1646-get-maximum-in-generated-array](https://github.com/Shivang1109/Leetcode/tree/master/1646-get-maximum-in-generated-array) |
| [1688-count-of-matches-in-tournament](https://github.com/Shivang1109/Leetcode/tree/master/1688-count-of-matches-in-tournament) |
| [3688-bitwise-or-of-even-numbers-in-an-array](https://github.com/Shivang1109/Leetcode/tree/master/3688-bitwise-or-of-even-numbers-in-an-array) |
| [3701-compute-alternating-sum](https://github.com/Shivang1109/Leetcode/tree/master/3701-compute-alternating-sum) |
## Recursion
|  |
| ------- |
| [0231-power-of-two](https://github.com/Shivang1109/Leetcode/tree/master/0231-power-of-two) |
| [0326-power-of-three](https://github.com/Shivang1109/Leetcode/tree/master/0326-power-of-three) |
| [0342-power-of-four](https://github.com/Shivang1109/Leetcode/tree/master/0342-power-of-four) |
| [0509-fibonacci-number](https://github.com/Shivang1109/Leetcode/tree/master/0509-fibonacci-number) |
## Greedy
|  |
| ------- |
| [0976-largest-perimeter-triangle](https://github.com/Shivang1109/Leetcode/tree/master/0976-largest-perimeter-triangle) |
| [2078-two-furthest-houses-with-different-colors](https://github.com/Shivang1109/Leetcode/tree/master/2078-two-furthest-houses-with-different-colors) |
| [2600-k-items-with-the-maximum-sum](https://github.com/Shivang1109/Leetcode/tree/master/2600-k-items-with-the-maximum-sum) |
| [2656-maximum-sum-with-exactly-k-elements](https://github.com/Shivang1109/Leetcode/tree/master/2656-maximum-sum-with-exactly-k-elements) |
## Divide and Conquer
|  |
| ------- |
| [0053-maximum-subarray](https://github.com/Shivang1109/Leetcode/tree/master/0053-maximum-subarray) |
| [0240-search-a-2d-matrix-ii](https://github.com/Shivang1109/Leetcode/tree/master/0240-search-a-2d-matrix-ii) |
## Dynamic Programming
|  |
| ------- |
| [0053-maximum-subarray](https://github.com/Shivang1109/Leetcode/tree/master/0053-maximum-subarray) |
| [0338-counting-bits](https://github.com/Shivang1109/Leetcode/tree/master/0338-counting-bits) |
| [0509-fibonacci-number](https://github.com/Shivang1109/Leetcode/tree/master/0509-fibonacci-number) |
| [1137-n-th-tribonacci-number](https://github.com/Shivang1109/Leetcode/tree/master/1137-n-th-tribonacci-number) |
## Matrix
|  |
| ------- |
| [0240-search-a-2d-matrix-ii](https://github.com/Shivang1109/Leetcode/tree/master/0240-search-a-2d-matrix-ii) |
| [0867-transpose-matrix](https://github.com/Shivang1109/Leetcode/tree/master/0867-transpose-matrix) |
| [1572-matrix-diagonal-sum](https://github.com/Shivang1109/Leetcode/tree/master/1572-matrix-diagonal-sum) |
| [1672-richest-customer-wealth](https://github.com/Shivang1109/Leetcode/tree/master/1672-richest-customer-wealth) |
## Two Pointers
|  |
| ------- |
| [0027-remove-element](https://github.com/Shivang1109/Leetcode/tree/master/0027-remove-element) |
| [0075-sort-colors](https://github.com/Shivang1109/Leetcode/tree/master/0075-sort-colors) |
| [0283-move-zeroes](https://github.com/Shivang1109/Leetcode/tree/master/0283-move-zeroes) |
| [0905-sort-array-by-parity](https://github.com/Shivang1109/Leetcode/tree/master/0905-sort-array-by-parity) |
| [0922-sort-array-by-parity-ii](https://github.com/Shivang1109/Leetcode/tree/master/0922-sort-array-by-parity-ii) |
| [0977-squares-of-a-sorted-array](https://github.com/Shivang1109/Leetcode/tree/master/0977-squares-of-a-sorted-array) |
| [1346-check-if-n-and-its-double-exist](https://github.com/Shivang1109/Leetcode/tree/master/1346-check-if-n-and-its-double-exist) |
| [2396-strictly-palindromic-number](https://github.com/Shivang1109/Leetcode/tree/master/2396-strictly-palindromic-number) |
| [2540-minimum-common-value](https://github.com/Shivang1109/Leetcode/tree/master/2540-minimum-common-value) |
| [2903-find-indices-with-index-and-value-difference-i](https://github.com/Shivang1109/Leetcode/tree/master/2903-find-indices-with-index-and-value-difference-i) |
| [3194-minimum-average-of-smallest-and-largest-elements](https://github.com/Shivang1109/Leetcode/tree/master/3194-minimum-average-of-smallest-and-largest-elements) |
| [3884-first-matching-character-from-both-ends](https://github.com/Shivang1109/Leetcode/tree/master/3884-first-matching-character-from-both-ends) |
## Counting
|  |
| ------- |
| [1512-number-of-good-pairs](https://github.com/Shivang1109/Leetcode/tree/master/1512-number-of-good-pairs) |
| [2529-maximum-count-of-positive-integer-and-negative-integer](https://github.com/Shivang1109/Leetcode/tree/master/2529-maximum-count-of-positive-integer-and-negative-integer) |
## Prefix Sum
|  |
| ------- |
| [1480-running-sum-of-1d-array](https://github.com/Shivang1109/Leetcode/tree/master/1480-running-sum-of-1d-array) |
| [1732-find-the-highest-altitude](https://github.com/Shivang1109/Leetcode/tree/master/1732-find-the-highest-altitude) |
## Heap (Priority Queue)
|  |
| ------- |
| [1464-maximum-product-of-two-elements-in-an-array](https://github.com/Shivang1109/Leetcode/tree/master/1464-maximum-product-of-two-elements-in-an-array) |
## Memoization
|  |
| ------- |
| [0509-fibonacci-number](https://github.com/Shivang1109/Leetcode/tree/master/0509-fibonacci-number) |
| [1137-n-th-tribonacci-number](https://github.com/Shivang1109/Leetcode/tree/master/1137-n-th-tribonacci-number) |
## Brainteaser
|  |
| ------- |
| [2396-strictly-palindromic-number](https://github.com/Shivang1109/Leetcode/tree/master/2396-strictly-palindromic-number) |
## Design
|  |
| ------- |
| [0155-min-stack](https://github.com/Shivang1109/Leetcode/tree/master/0155-min-stack) |
<!---LeetCode Topics End-->