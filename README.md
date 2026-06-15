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
| [0026-remove-duplicates-from-sorted-array](https://github.com/Shivang1109/Leetcode/tree/master/0026-remove-duplicates-from-sorted-array) |
| [0027-remove-element](https://github.com/Shivang1109/Leetcode/tree/master/0027-remove-element) |
| [0035-search-insert-position](https://github.com/Shivang1109/Leetcode/tree/master/0035-search-insert-position) |
| [0041-first-missing-positive](https://github.com/Shivang1109/Leetcode/tree/master/0041-first-missing-positive) |
| [0053-maximum-subarray](https://github.com/Shivang1109/Leetcode/tree/master/0053-maximum-subarray) |
| [0075-sort-colors](https://github.com/Shivang1109/Leetcode/tree/master/0075-sort-colors) |
| [0136-single-number](https://github.com/Shivang1109/Leetcode/tree/master/0136-single-number) |
| [0169-majority-element](https://github.com/Shivang1109/Leetcode/tree/master/0169-majority-element) |
| [0204-count-primes](https://github.com/Shivang1109/Leetcode/tree/master/0204-count-primes) |
| [0217-contains-duplicate](https://github.com/Shivang1109/Leetcode/tree/master/0217-contains-duplicate) |
| [0240-search-a-2d-matrix-ii](https://github.com/Shivang1109/Leetcode/tree/master/0240-search-a-2d-matrix-ii) |
| [0268-missing-number](https://github.com/Shivang1109/Leetcode/tree/master/0268-missing-number) |
| [0283-move-zeroes](https://github.com/Shivang1109/Leetcode/tree/master/0283-move-zeroes) |
| [0414-third-maximum-number](https://github.com/Shivang1109/Leetcode/tree/master/0414-third-maximum-number) |
| [0628-maximum-product-of-three-numbers](https://github.com/Shivang1109/Leetcode/tree/master/0628-maximum-product-of-three-numbers) |
| [0704-binary-search](https://github.com/Shivang1109/Leetcode/tree/master/0704-binary-search) |
| [0724-find-pivot-index](https://github.com/Shivang1109/Leetcode/tree/master/0724-find-pivot-index) |
| [0747-largest-number-at-least-twice-of-others](https://github.com/Shivang1109/Leetcode/tree/master/0747-largest-number-at-least-twice-of-others) |
| [0806-number-of-lines-to-write-string](https://github.com/Shivang1109/Leetcode/tree/master/0806-number-of-lines-to-write-string) |
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
| [1700-number-of-students-unable-to-eat-lunch](https://github.com/Shivang1109/Leetcode/tree/master/1700-number-of-students-unable-to-eat-lunch) |
| [1720-decode-xored-array](https://github.com/Shivang1109/Leetcode/tree/master/1720-decode-xored-array) |
| [1732-find-the-highest-altitude](https://github.com/Shivang1109/Leetcode/tree/master/1732-find-the-highest-altitude) |
| [1822-sign-of-the-product-of-an-array](https://github.com/Shivang1109/Leetcode/tree/master/1822-sign-of-the-product-of-an-array) |
| [1979-find-greatest-common-divisor-of-array](https://github.com/Shivang1109/Leetcode/tree/master/1979-find-greatest-common-divisor-of-array) |
| [1991-find-the-middle-index-in-array](https://github.com/Shivang1109/Leetcode/tree/master/1991-find-the-middle-index-in-array) |
| [2078-two-furthest-houses-with-different-colors](https://github.com/Shivang1109/Leetcode/tree/master/2078-two-furthest-houses-with-different-colors) |
| [2108-find-first-palindromic-string-in-the-array](https://github.com/Shivang1109/Leetcode/tree/master/2108-find-first-palindromic-string-in-the-array) |
| [2114-maximum-number-of-words-found-in-sentences](https://github.com/Shivang1109/Leetcode/tree/master/2114-maximum-number-of-words-found-in-sentences) |
| [2239-find-closest-number-to-zero](https://github.com/Shivang1109/Leetcode/tree/master/2239-find-closest-number-to-zero) |
| [2455-average-value-of-even-numbers-that-are-divisible-by-three](https://github.com/Shivang1109/Leetcode/tree/master/2455-average-value-of-even-numbers-that-are-divisible-by-three) |
| [2529-maximum-count-of-positive-integer-and-negative-integer](https://github.com/Shivang1109/Leetcode/tree/master/2529-maximum-count-of-positive-integer-and-negative-integer) |
| [2535-difference-between-element-sum-and-digit-sum-of-an-array](https://github.com/Shivang1109/Leetcode/tree/master/2535-difference-between-element-sum-and-digit-sum-of-an-array) |
| [2540-minimum-common-value](https://github.com/Shivang1109/Leetcode/tree/master/2540-minimum-common-value) |
| [2574-left-and-right-sum-differences](https://github.com/Shivang1109/Leetcode/tree/master/2574-left-and-right-sum-differences) |
| [2656-maximum-sum-with-exactly-k-elements](https://github.com/Shivang1109/Leetcode/tree/master/2656-maximum-sum-with-exactly-k-elements) |
| [2678-number-of-senior-citizens](https://github.com/Shivang1109/Leetcode/tree/master/2678-number-of-senior-citizens) |
| [2733-neither-minimum-nor-maximum](https://github.com/Shivang1109/Leetcode/tree/master/2733-neither-minimum-nor-maximum) |
| [2778-sum-of-squares-of-special-elements](https://github.com/Shivang1109/Leetcode/tree/master/2778-sum-of-squares-of-special-elements) |
| [2828-check-if-a-string-is-an-acronym-of-words](https://github.com/Shivang1109/Leetcode/tree/master/2828-check-if-a-string-is-an-acronym-of-words) |
| [2903-find-indices-with-index-and-value-difference-i](https://github.com/Shivang1109/Leetcode/tree/master/2903-find-indices-with-index-and-value-difference-i) |
| [2942-find-words-containing-character](https://github.com/Shivang1109/Leetcode/tree/master/2942-find-words-containing-character) |
| [2996-smallest-missing-integer-greater-than-sequential-prefix-sum](https://github.com/Shivang1109/Leetcode/tree/master/2996-smallest-missing-integer-greater-than-sequential-prefix-sum) |
| [3000-maximum-area-of-longest-diagonal-rectangle](https://github.com/Shivang1109/Leetcode/tree/master/3000-maximum-area-of-longest-diagonal-rectangle) |
| [3024-type-of-triangle](https://github.com/Shivang1109/Leetcode/tree/master/3024-type-of-triangle) |
| [3131-find-the-integer-added-to-array-i](https://github.com/Shivang1109/Leetcode/tree/master/3131-find-the-integer-added-to-array-i) |
| [3194-minimum-average-of-smallest-and-largest-elements](https://github.com/Shivang1109/Leetcode/tree/master/3194-minimum-average-of-smallest-and-largest-elements) |
| [3248-snake-in-matrix](https://github.com/Shivang1109/Leetcode/tree/master/3248-snake-in-matrix) |
| [3550-smallest-index-with-digit-sum-equal-to-index](https://github.com/Shivang1109/Leetcode/tree/master/3550-smallest-index-with-digit-sum-equal-to-index) |
| [3678-smallest-absent-positive-greater-than-average](https://github.com/Shivang1109/Leetcode/tree/master/3678-smallest-absent-positive-greater-than-average) |
| [3688-bitwise-or-of-even-numbers-in-an-array](https://github.com/Shivang1109/Leetcode/tree/master/3688-bitwise-or-of-even-numbers-in-an-array) |
| [3701-compute-alternating-sum](https://github.com/Shivang1109/Leetcode/tree/master/3701-compute-alternating-sum) |
| [3774-absolute-difference-between-maximum-and-minimum-k-elements](https://github.com/Shivang1109/Leetcode/tree/master/3774-absolute-difference-between-maximum-and-minimum-k-elements) |
| [3838-weighted-word-mapping](https://github.com/Shivang1109/Leetcode/tree/master/3838-weighted-word-mapping) |
| [3921-score-validator](https://github.com/Shivang1109/Leetcode/tree/master/3921-score-validator) |
## Math
|  |
| ------- |
| [0007-reverse-integer](https://github.com/Shivang1109/Leetcode/tree/master/0007-reverse-integer) |
| [0009-palindrome-number](https://github.com/Shivang1109/Leetcode/tree/master/0009-palindrome-number) |
| [0069-sqrtx](https://github.com/Shivang1109/Leetcode/tree/master/0069-sqrtx) |
| [0070-climbing-stairs](https://github.com/Shivang1109/Leetcode/tree/master/0070-climbing-stairs) |
| [0168-excel-sheet-column-title](https://github.com/Shivang1109/Leetcode/tree/master/0168-excel-sheet-column-title) |
| [0171-excel-sheet-column-number](https://github.com/Shivang1109/Leetcode/tree/master/0171-excel-sheet-column-number) |
| [0202-happy-number](https://github.com/Shivang1109/Leetcode/tree/master/0202-happy-number) |
| [0204-count-primes](https://github.com/Shivang1109/Leetcode/tree/master/0204-count-primes) |
| [0231-power-of-two](https://github.com/Shivang1109/Leetcode/tree/master/0231-power-of-two) |
| [0258-add-digits](https://github.com/Shivang1109/Leetcode/tree/master/0258-add-digits) |
| [0263-ugly-number](https://github.com/Shivang1109/Leetcode/tree/master/0263-ugly-number) |
| [0268-missing-number](https://github.com/Shivang1109/Leetcode/tree/master/0268-missing-number) |
| [0326-power-of-three](https://github.com/Shivang1109/Leetcode/tree/master/0326-power-of-three) |
| [0342-power-of-four](https://github.com/Shivang1109/Leetcode/tree/master/0342-power-of-four) |
| [0367-valid-perfect-square](https://github.com/Shivang1109/Leetcode/tree/master/0367-valid-perfect-square) |
| [0371-sum-of-two-integers](https://github.com/Shivang1109/Leetcode/tree/master/0371-sum-of-two-integers) |
| [0412-fizz-buzz](https://github.com/Shivang1109/Leetcode/tree/master/0412-fizz-buzz) |
| [0423-reconstruct-original-digits-from-english](https://github.com/Shivang1109/Leetcode/tree/master/0423-reconstruct-original-digits-from-english) |
| [0441-arranging-coins](https://github.com/Shivang1109/Leetcode/tree/master/0441-arranging-coins) |
| [0504-base-7](https://github.com/Shivang1109/Leetcode/tree/master/0504-base-7) |
| [0507-perfect-number](https://github.com/Shivang1109/Leetcode/tree/master/0507-perfect-number) |
| [0509-fibonacci-number](https://github.com/Shivang1109/Leetcode/tree/master/0509-fibonacci-number) |
| [0628-maximum-product-of-three-numbers](https://github.com/Shivang1109/Leetcode/tree/master/0628-maximum-product-of-three-numbers) |
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
| [2269-find-the-k-beauty-of-a-number](https://github.com/Shivang1109/Leetcode/tree/master/2269-find-the-k-beauty-of-a-number) |
| [2396-strictly-palindromic-number](https://github.com/Shivang1109/Leetcode/tree/master/2396-strictly-palindromic-number) |
| [2413-smallest-even-multiple](https://github.com/Shivang1109/Leetcode/tree/master/2413-smallest-even-multiple) |
| [2427-number-of-common-factors](https://github.com/Shivang1109/Leetcode/tree/master/2427-number-of-common-factors) |
| [2455-average-value-of-even-numbers-that-are-divisible-by-three](https://github.com/Shivang1109/Leetcode/tree/master/2455-average-value-of-even-numbers-that-are-divisible-by-three) |
| [2469-convert-the-temperature](https://github.com/Shivang1109/Leetcode/tree/master/2469-convert-the-temperature) |
| [2520-count-the-digits-that-divide-a-number](https://github.com/Shivang1109/Leetcode/tree/master/2520-count-the-digits-that-divide-a-number) |
| [2525-categorize-box-according-to-criteria](https://github.com/Shivang1109/Leetcode/tree/master/2525-categorize-box-according-to-criteria) |
| [2535-difference-between-element-sum-and-digit-sum-of-an-array](https://github.com/Shivang1109/Leetcode/tree/master/2535-difference-between-element-sum-and-digit-sum-of-an-array) |
| [2544-alternating-digit-sum](https://github.com/Shivang1109/Leetcode/tree/master/2544-alternating-digit-sum) |
| [2600-k-items-with-the-maximum-sum](https://github.com/Shivang1109/Leetcode/tree/master/2600-k-items-with-the-maximum-sum) |
| [2651-calculate-delayed-arrival-time](https://github.com/Shivang1109/Leetcode/tree/master/2651-calculate-delayed-arrival-time) |
| [2652-sum-multiples](https://github.com/Shivang1109/Leetcode/tree/master/2652-sum-multiples) |
| [2769-find-the-maximum-achievable-number](https://github.com/Shivang1109/Leetcode/tree/master/2769-find-the-maximum-achievable-number) |
| [2806-account-balance-after-rounded-purchase](https://github.com/Shivang1109/Leetcode/tree/master/2806-account-balance-after-rounded-purchase) |
| [2894-divisible-and-non-divisible-sums-difference](https://github.com/Shivang1109/Leetcode/tree/master/2894-divisible-and-non-divisible-sums-difference) |
| [3024-type-of-triangle](https://github.com/Shivang1109/Leetcode/tree/master/3024-type-of-triangle) |
| [3274-check-if-two-chessboard-squares-have-the-same-color](https://github.com/Shivang1109/Leetcode/tree/master/3274-check-if-two-chessboard-squares-have-the-same-color) |
| [3280-convert-date-to-binary](https://github.com/Shivang1109/Leetcode/tree/master/3280-convert-date-to-binary) |
| [3516-find-closest-person](https://github.com/Shivang1109/Leetcode/tree/master/3516-find-closest-person) |
| [3536-maximum-product-of-two-digits](https://github.com/Shivang1109/Leetcode/tree/master/3536-maximum-product-of-two-digits) |
| [3550-smallest-index-with-digit-sum-equal-to-index](https://github.com/Shivang1109/Leetcode/tree/master/3550-smallest-index-with-digit-sum-equal-to-index) |
| [3658-gcd-of-odd-and-even-sums](https://github.com/Shivang1109/Leetcode/tree/master/3658-gcd-of-odd-and-even-sums) |
| [3750-minimum-number-of-flips-to-reverse-binary-string](https://github.com/Shivang1109/Leetcode/tree/master/3750-minimum-number-of-flips-to-reverse-binary-string) |
| [3783-mirror-distance-of-an-integer](https://github.com/Shivang1109/Leetcode/tree/master/3783-mirror-distance-of-an-integer) |
## Number Theory
|  |
| ------- |
| [0204-count-primes](https://github.com/Shivang1109/Leetcode/tree/master/0204-count-primes) |
| [0258-add-digits](https://github.com/Shivang1109/Leetcode/tree/master/0258-add-digits) |
| [1952-three-divisors](https://github.com/Shivang1109/Leetcode/tree/master/1952-three-divisors) |
| [1979-find-greatest-common-divisor-of-array](https://github.com/Shivang1109/Leetcode/tree/master/1979-find-greatest-common-divisor-of-array) |
| [2413-smallest-even-multiple](https://github.com/Shivang1109/Leetcode/tree/master/2413-smallest-even-multiple) |
| [2427-number-of-common-factors](https://github.com/Shivang1109/Leetcode/tree/master/2427-number-of-common-factors) |
| [3658-gcd-of-odd-and-even-sums](https://github.com/Shivang1109/Leetcode/tree/master/3658-gcd-of-odd-and-even-sums) |
## Enumeration
|  |
| ------- |
| [0204-count-primes](https://github.com/Shivang1109/Leetcode/tree/master/0204-count-primes) |
| [1952-three-divisors](https://github.com/Shivang1109/Leetcode/tree/master/1952-three-divisors) |
| [2427-number-of-common-factors](https://github.com/Shivang1109/Leetcode/tree/master/2427-number-of-common-factors) |
| [2778-sum-of-squares-of-special-elements](https://github.com/Shivang1109/Leetcode/tree/master/2778-sum-of-squares-of-special-elements) |
## String
|  |
| ------- |
| [0020-valid-parentheses](https://github.com/Shivang1109/Leetcode/tree/master/0020-valid-parentheses) |
| [0028-find-the-index-of-the-first-occurrence-in-a-string](https://github.com/Shivang1109/Leetcode/tree/master/0028-find-the-index-of-the-first-occurrence-in-a-string) |
| [0058-length-of-last-word](https://github.com/Shivang1109/Leetcode/tree/master/0058-length-of-last-word) |
| [0125-valid-palindrome](https://github.com/Shivang1109/Leetcode/tree/master/0125-valid-palindrome) |
| [0151-reverse-words-in-a-string](https://github.com/Shivang1109/Leetcode/tree/master/0151-reverse-words-in-a-string) |
| [0168-excel-sheet-column-title](https://github.com/Shivang1109/Leetcode/tree/master/0168-excel-sheet-column-title) |
| [0171-excel-sheet-column-number](https://github.com/Shivang1109/Leetcode/tree/master/0171-excel-sheet-column-number) |
| [0344-reverse-string](https://github.com/Shivang1109/Leetcode/tree/master/0344-reverse-string) |
| [0387-first-unique-character-in-a-string](https://github.com/Shivang1109/Leetcode/tree/master/0387-first-unique-character-in-a-string) |
| [0389-find-the-difference](https://github.com/Shivang1109/Leetcode/tree/master/0389-find-the-difference) |
| [0412-fizz-buzz](https://github.com/Shivang1109/Leetcode/tree/master/0412-fizz-buzz) |
| [0423-reconstruct-original-digits-from-english](https://github.com/Shivang1109/Leetcode/tree/master/0423-reconstruct-original-digits-from-english) |
| [0504-base-7](https://github.com/Shivang1109/Leetcode/tree/master/0504-base-7) |
| [0551-student-attendance-record-i](https://github.com/Shivang1109/Leetcode/tree/master/0551-student-attendance-record-i) |
| [0657-robot-return-to-origin](https://github.com/Shivang1109/Leetcode/tree/master/0657-robot-return-to-origin) |
| [0709-to-lower-case](https://github.com/Shivang1109/Leetcode/tree/master/0709-to-lower-case) |
| [0771-jewels-and-stones](https://github.com/Shivang1109/Leetcode/tree/master/0771-jewels-and-stones) |
| [0806-number-of-lines-to-write-string](https://github.com/Shivang1109/Leetcode/tree/master/0806-number-of-lines-to-write-string) |
| [1528-shuffle-string](https://github.com/Shivang1109/Leetcode/tree/master/1528-shuffle-string) |
| [1629-slowest-key](https://github.com/Shivang1109/Leetcode/tree/master/1629-slowest-key) |
| [1945-sum-of-digits-of-string-after-convert](https://github.com/Shivang1109/Leetcode/tree/master/1945-sum-of-digits-of-string-after-convert) |
| [2108-find-first-palindromic-string-in-the-array](https://github.com/Shivang1109/Leetcode/tree/master/2108-find-first-palindromic-string-in-the-array) |
| [2114-maximum-number-of-words-found-in-sentences](https://github.com/Shivang1109/Leetcode/tree/master/2114-maximum-number-of-words-found-in-sentences) |
| [2124-check-if-all-as-appears-before-all-bs](https://github.com/Shivang1109/Leetcode/tree/master/2124-check-if-all-as-appears-before-all-bs) |
| [2269-find-the-k-beauty-of-a-number](https://github.com/Shivang1109/Leetcode/tree/master/2269-find-the-k-beauty-of-a-number) |
| [2278-percentage-of-letter-in-string](https://github.com/Shivang1109/Leetcode/tree/master/2278-percentage-of-letter-in-string) |
| [2678-number-of-senior-citizens](https://github.com/Shivang1109/Leetcode/tree/master/2678-number-of-senior-citizens) |
| [2710-remove-trailing-zeros-from-a-string](https://github.com/Shivang1109/Leetcode/tree/master/2710-remove-trailing-zeros-from-a-string) |
| [2716-minimize-string-length](https://github.com/Shivang1109/Leetcode/tree/master/2716-minimize-string-length) |
| [2810-faulty-keyboard](https://github.com/Shivang1109/Leetcode/tree/master/2810-faulty-keyboard) |
| [2828-check-if-a-string-is-an-acronym-of-words](https://github.com/Shivang1109/Leetcode/tree/master/2828-check-if-a-string-is-an-acronym-of-words) |
| [2942-find-words-containing-character](https://github.com/Shivang1109/Leetcode/tree/master/2942-find-words-containing-character) |
| [3019-number-of-changing-keys](https://github.com/Shivang1109/Leetcode/tree/master/3019-number-of-changing-keys) |
| [3110-score-of-a-string](https://github.com/Shivang1109/Leetcode/tree/master/3110-score-of-a-string) |
| [3146-permutation-difference-between-two-strings](https://github.com/Shivang1109/Leetcode/tree/master/3146-permutation-difference-between-two-strings) |
| [3168-minimum-number-of-chairs-in-a-waiting-room](https://github.com/Shivang1109/Leetcode/tree/master/3168-minimum-number-of-chairs-in-a-waiting-room) |
| [3210-find-the-encrypted-string](https://github.com/Shivang1109/Leetcode/tree/master/3210-find-the-encrypted-string) |
| [3248-snake-in-matrix](https://github.com/Shivang1109/Leetcode/tree/master/3248-snake-in-matrix) |
| [3274-check-if-two-chessboard-squares-have-the-same-color](https://github.com/Shivang1109/Leetcode/tree/master/3274-check-if-two-chessboard-squares-have-the-same-color) |
| [3280-convert-date-to-binary](https://github.com/Shivang1109/Leetcode/tree/master/3280-convert-date-to-binary) |
| [3340-check-balanced-string](https://github.com/Shivang1109/Leetcode/tree/master/3340-check-balanced-string) |
| [3498-reverse-degree-of-a-string](https://github.com/Shivang1109/Leetcode/tree/master/3498-reverse-degree-of-a-string) |
| [3750-minimum-number-of-flips-to-reverse-binary-string](https://github.com/Shivang1109/Leetcode/tree/master/3750-minimum-number-of-flips-to-reverse-binary-string) |
| [3798-largest-even-number](https://github.com/Shivang1109/Leetcode/tree/master/3798-largest-even-number) |
| [3813-vowel-consonant-score](https://github.com/Shivang1109/Leetcode/tree/master/3813-vowel-consonant-score) |
| [3838-weighted-word-mapping](https://github.com/Shivang1109/Leetcode/tree/master/3838-weighted-word-mapping) |
| [3884-first-matching-character-from-both-ends](https://github.com/Shivang1109/Leetcode/tree/master/3884-first-matching-character-from-both-ends) |
| [3921-score-validator](https://github.com/Shivang1109/Leetcode/tree/master/3921-score-validator) |
| [3931-check-adjacent-digit-differences](https://github.com/Shivang1109/Leetcode/tree/master/3931-check-adjacent-digit-differences) |
## Bit Manipulation
|  |
| ------- |
| [0136-single-number](https://github.com/Shivang1109/Leetcode/tree/master/0136-single-number) |
| [0231-power-of-two](https://github.com/Shivang1109/Leetcode/tree/master/0231-power-of-two) |
| [0268-missing-number](https://github.com/Shivang1109/Leetcode/tree/master/0268-missing-number) |
| [0338-counting-bits](https://github.com/Shivang1109/Leetcode/tree/master/0338-counting-bits) |
| [0342-power-of-four](https://github.com/Shivang1109/Leetcode/tree/master/0342-power-of-four) |
| [0371-sum-of-two-integers](https://github.com/Shivang1109/Leetcode/tree/master/0371-sum-of-two-integers) |
| [0389-find-the-difference](https://github.com/Shivang1109/Leetcode/tree/master/0389-find-the-difference) |
| [0461-hamming-distance](https://github.com/Shivang1109/Leetcode/tree/master/0461-hamming-distance) |
| [1342-number-of-steps-to-reduce-a-number-to-zero](https://github.com/Shivang1109/Leetcode/tree/master/1342-number-of-steps-to-reduce-a-number-to-zero) |
| [1486-xor-operation-in-an-array](https://github.com/Shivang1109/Leetcode/tree/master/1486-xor-operation-in-an-array) |
| [1720-decode-xored-array](https://github.com/Shivang1109/Leetcode/tree/master/1720-decode-xored-array) |
| [3688-bitwise-or-of-even-numbers-in-an-array](https://github.com/Shivang1109/Leetcode/tree/master/3688-bitwise-or-of-even-numbers-in-an-array) |
| [3750-minimum-number-of-flips-to-reverse-binary-string](https://github.com/Shivang1109/Leetcode/tree/master/3750-minimum-number-of-flips-to-reverse-binary-string) |
## Stack
|  |
| ------- |
| [0020-valid-parentheses](https://github.com/Shivang1109/Leetcode/tree/master/0020-valid-parentheses) |
| [0155-min-stack](https://github.com/Shivang1109/Leetcode/tree/master/0155-min-stack) |
| [1700-number-of-students-unable-to-eat-lunch](https://github.com/Shivang1109/Leetcode/tree/master/1700-number-of-students-unable-to-eat-lunch) |
## Binary Search
|  |
| ------- |
| [0035-search-insert-position](https://github.com/Shivang1109/Leetcode/tree/master/0035-search-insert-position) |
| [0069-sqrtx](https://github.com/Shivang1109/Leetcode/tree/master/0069-sqrtx) |
| [0240-search-a-2d-matrix-ii](https://github.com/Shivang1109/Leetcode/tree/master/0240-search-a-2d-matrix-ii) |
| [0268-missing-number](https://github.com/Shivang1109/Leetcode/tree/master/0268-missing-number) |
| [0367-valid-perfect-square](https://github.com/Shivang1109/Leetcode/tree/master/0367-valid-perfect-square) |
| [0374-guess-number-higher-or-lower](https://github.com/Shivang1109/Leetcode/tree/master/0374-guess-number-higher-or-lower) |
| [0441-arranging-coins](https://github.com/Shivang1109/Leetcode/tree/master/0441-arranging-coins) |
| [0704-binary-search](https://github.com/Shivang1109/Leetcode/tree/master/0704-binary-search) |
| [1346-check-if-n-and-its-double-exist](https://github.com/Shivang1109/Leetcode/tree/master/1346-check-if-n-and-its-double-exist) |
| [2529-maximum-count-of-positive-integer-and-negative-integer](https://github.com/Shivang1109/Leetcode/tree/master/2529-maximum-count-of-positive-integer-and-negative-integer) |
| [2540-minimum-common-value](https://github.com/Shivang1109/Leetcode/tree/master/2540-minimum-common-value) |
## Hash Table
|  |
| ------- |
| [0001-two-sum](https://github.com/Shivang1109/Leetcode/tree/master/0001-two-sum) |
| [0041-first-missing-positive](https://github.com/Shivang1109/Leetcode/tree/master/0041-first-missing-positive) |
| [0169-majority-element](https://github.com/Shivang1109/Leetcode/tree/master/0169-majority-element) |
| [0202-happy-number](https://github.com/Shivang1109/Leetcode/tree/master/0202-happy-number) |
| [0217-contains-duplicate](https://github.com/Shivang1109/Leetcode/tree/master/0217-contains-duplicate) |
| [0268-missing-number](https://github.com/Shivang1109/Leetcode/tree/master/0268-missing-number) |
| [0387-first-unique-character-in-a-string](https://github.com/Shivang1109/Leetcode/tree/master/0387-first-unique-character-in-a-string) |
| [0389-find-the-difference](https://github.com/Shivang1109/Leetcode/tree/master/0389-find-the-difference) |
| [0423-reconstruct-original-digits-from-english](https://github.com/Shivang1109/Leetcode/tree/master/0423-reconstruct-original-digits-from-english) |
| [0771-jewels-and-stones](https://github.com/Shivang1109/Leetcode/tree/master/0771-jewels-and-stones) |
| [1346-check-if-n-and-its-double-exist](https://github.com/Shivang1109/Leetcode/tree/master/1346-check-if-n-and-its-double-exist) |
| [1512-number-of-good-pairs](https://github.com/Shivang1109/Leetcode/tree/master/1512-number-of-good-pairs) |
| [2540-minimum-common-value](https://github.com/Shivang1109/Leetcode/tree/master/2540-minimum-common-value) |
| [2716-minimize-string-length](https://github.com/Shivang1109/Leetcode/tree/master/2716-minimize-string-length) |
| [2996-smallest-missing-integer-greater-than-sequential-prefix-sum](https://github.com/Shivang1109/Leetcode/tree/master/2996-smallest-missing-integer-greater-than-sequential-prefix-sum) |
| [3146-permutation-difference-between-two-strings](https://github.com/Shivang1109/Leetcode/tree/master/3146-permutation-difference-between-two-strings) |
| [3678-smallest-absent-positive-greater-than-average](https://github.com/Shivang1109/Leetcode/tree/master/3678-smallest-absent-positive-greater-than-average) |
## Sorting
|  |
| ------- |
| [0075-sort-colors](https://github.com/Shivang1109/Leetcode/tree/master/0075-sort-colors) |
| [0169-majority-element](https://github.com/Shivang1109/Leetcode/tree/master/0169-majority-element) |
| [0217-contains-duplicate](https://github.com/Shivang1109/Leetcode/tree/master/0217-contains-duplicate) |
| [0268-missing-number](https://github.com/Shivang1109/Leetcode/tree/master/0268-missing-number) |
| [0389-find-the-difference](https://github.com/Shivang1109/Leetcode/tree/master/0389-find-the-difference) |
| [0414-third-maximum-number](https://github.com/Shivang1109/Leetcode/tree/master/0414-third-maximum-number) |
| [0628-maximum-product-of-three-numbers](https://github.com/Shivang1109/Leetcode/tree/master/0628-maximum-product-of-three-numbers) |
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
| [0412-fizz-buzz](https://github.com/Shivang1109/Leetcode/tree/master/0412-fizz-buzz) |
| [0657-robot-return-to-origin](https://github.com/Shivang1109/Leetcode/tree/master/0657-robot-return-to-origin) |
| [0867-transpose-matrix](https://github.com/Shivang1109/Leetcode/tree/master/0867-transpose-matrix) |
| [1646-get-maximum-in-generated-array](https://github.com/Shivang1109/Leetcode/tree/master/1646-get-maximum-in-generated-array) |
| [1688-count-of-matches-in-tournament](https://github.com/Shivang1109/Leetcode/tree/master/1688-count-of-matches-in-tournament) |
| [1700-number-of-students-unable-to-eat-lunch](https://github.com/Shivang1109/Leetcode/tree/master/1700-number-of-students-unable-to-eat-lunch) |
| [1945-sum-of-digits-of-string-after-convert](https://github.com/Shivang1109/Leetcode/tree/master/1945-sum-of-digits-of-string-after-convert) |
| [2810-faulty-keyboard](https://github.com/Shivang1109/Leetcode/tree/master/2810-faulty-keyboard) |
| [3168-minimum-number-of-chairs-in-a-waiting-room](https://github.com/Shivang1109/Leetcode/tree/master/3168-minimum-number-of-chairs-in-a-waiting-room) |
| [3248-snake-in-matrix](https://github.com/Shivang1109/Leetcode/tree/master/3248-snake-in-matrix) |
| [3498-reverse-degree-of-a-string](https://github.com/Shivang1109/Leetcode/tree/master/3498-reverse-degree-of-a-string) |
| [3688-bitwise-or-of-even-numbers-in-an-array](https://github.com/Shivang1109/Leetcode/tree/master/3688-bitwise-or-of-even-numbers-in-an-array) |
| [3701-compute-alternating-sum](https://github.com/Shivang1109/Leetcode/tree/master/3701-compute-alternating-sum) |
| [3813-vowel-consonant-score](https://github.com/Shivang1109/Leetcode/tree/master/3813-vowel-consonant-score) |
| [3838-weighted-word-mapping](https://github.com/Shivang1109/Leetcode/tree/master/3838-weighted-word-mapping) |
| [3921-score-validator](https://github.com/Shivang1109/Leetcode/tree/master/3921-score-validator) |
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
| [0169-majority-element](https://github.com/Shivang1109/Leetcode/tree/master/0169-majority-element) |
| [0240-search-a-2d-matrix-ii](https://github.com/Shivang1109/Leetcode/tree/master/0240-search-a-2d-matrix-ii) |
## Dynamic Programming
|  |
| ------- |
| [0053-maximum-subarray](https://github.com/Shivang1109/Leetcode/tree/master/0053-maximum-subarray) |
| [0070-climbing-stairs](https://github.com/Shivang1109/Leetcode/tree/master/0070-climbing-stairs) |
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
| [0026-remove-duplicates-from-sorted-array](https://github.com/Shivang1109/Leetcode/tree/master/0026-remove-duplicates-from-sorted-array) |
| [0027-remove-element](https://github.com/Shivang1109/Leetcode/tree/master/0027-remove-element) |
| [0028-find-the-index-of-the-first-occurrence-in-a-string](https://github.com/Shivang1109/Leetcode/tree/master/0028-find-the-index-of-the-first-occurrence-in-a-string) |
| [0075-sort-colors](https://github.com/Shivang1109/Leetcode/tree/master/0075-sort-colors) |
| [0125-valid-palindrome](https://github.com/Shivang1109/Leetcode/tree/master/0125-valid-palindrome) |
| [0151-reverse-words-in-a-string](https://github.com/Shivang1109/Leetcode/tree/master/0151-reverse-words-in-a-string) |
| [0202-happy-number](https://github.com/Shivang1109/Leetcode/tree/master/0202-happy-number) |
| [0283-move-zeroes](https://github.com/Shivang1109/Leetcode/tree/master/0283-move-zeroes) |
| [0344-reverse-string](https://github.com/Shivang1109/Leetcode/tree/master/0344-reverse-string) |
| [0905-sort-array-by-parity](https://github.com/Shivang1109/Leetcode/tree/master/0905-sort-array-by-parity) |
| [0922-sort-array-by-parity-ii](https://github.com/Shivang1109/Leetcode/tree/master/0922-sort-array-by-parity-ii) |
| [0977-squares-of-a-sorted-array](https://github.com/Shivang1109/Leetcode/tree/master/0977-squares-of-a-sorted-array) |
| [1346-check-if-n-and-its-double-exist](https://github.com/Shivang1109/Leetcode/tree/master/1346-check-if-n-and-its-double-exist) |
| [2108-find-first-palindromic-string-in-the-array](https://github.com/Shivang1109/Leetcode/tree/master/2108-find-first-palindromic-string-in-the-array) |
| [2396-strictly-palindromic-number](https://github.com/Shivang1109/Leetcode/tree/master/2396-strictly-palindromic-number) |
| [2540-minimum-common-value](https://github.com/Shivang1109/Leetcode/tree/master/2540-minimum-common-value) |
| [2903-find-indices-with-index-and-value-difference-i](https://github.com/Shivang1109/Leetcode/tree/master/2903-find-indices-with-index-and-value-difference-i) |
| [3194-minimum-average-of-smallest-and-largest-elements](https://github.com/Shivang1109/Leetcode/tree/master/3194-minimum-average-of-smallest-and-largest-elements) |
| [3750-minimum-number-of-flips-to-reverse-binary-string](https://github.com/Shivang1109/Leetcode/tree/master/3750-minimum-number-of-flips-to-reverse-binary-string) |
| [3884-first-matching-character-from-both-ends](https://github.com/Shivang1109/Leetcode/tree/master/3884-first-matching-character-from-both-ends) |
## Counting
|  |
| ------- |
| [0169-majority-element](https://github.com/Shivang1109/Leetcode/tree/master/0169-majority-element) |
| [0387-first-unique-character-in-a-string](https://github.com/Shivang1109/Leetcode/tree/master/0387-first-unique-character-in-a-string) |
| [1512-number-of-good-pairs](https://github.com/Shivang1109/Leetcode/tree/master/1512-number-of-good-pairs) |
| [2529-maximum-count-of-positive-integer-and-negative-integer](https://github.com/Shivang1109/Leetcode/tree/master/2529-maximum-count-of-positive-integer-and-negative-integer) |
## Prefix Sum
|  |
| ------- |
| [0724-find-pivot-index](https://github.com/Shivang1109/Leetcode/tree/master/0724-find-pivot-index) |
| [1480-running-sum-of-1d-array](https://github.com/Shivang1109/Leetcode/tree/master/1480-running-sum-of-1d-array) |
| [1732-find-the-highest-altitude](https://github.com/Shivang1109/Leetcode/tree/master/1732-find-the-highest-altitude) |
| [1991-find-the-middle-index-in-array](https://github.com/Shivang1109/Leetcode/tree/master/1991-find-the-middle-index-in-array) |
| [2574-left-and-right-sum-differences](https://github.com/Shivang1109/Leetcode/tree/master/2574-left-and-right-sum-differences) |
## Heap (Priority Queue)
|  |
| ------- |
| [1464-maximum-product-of-two-elements-in-an-array](https://github.com/Shivang1109/Leetcode/tree/master/1464-maximum-product-of-two-elements-in-an-array) |
## Memoization
|  |
| ------- |
| [0070-climbing-stairs](https://github.com/Shivang1109/Leetcode/tree/master/0070-climbing-stairs) |
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
## Queue
|  |
| ------- |
| [0387-first-unique-character-in-a-string](https://github.com/Shivang1109/Leetcode/tree/master/0387-first-unique-character-in-a-string) |
| [1700-number-of-students-unable-to-eat-lunch](https://github.com/Shivang1109/Leetcode/tree/master/1700-number-of-students-unable-to-eat-lunch) |
## Interactive
|  |
| ------- |
| [0374-guess-number-higher-or-lower](https://github.com/Shivang1109/Leetcode/tree/master/0374-guess-number-higher-or-lower) |
## String Matching
|  |
| ------- |
| [0028-find-the-index-of-the-first-occurrence-in-a-string](https://github.com/Shivang1109/Leetcode/tree/master/0028-find-the-index-of-the-first-occurrence-in-a-string) |
## Sliding Window
|  |
| ------- |
| [2269-find-the-k-beauty-of-a-number](https://github.com/Shivang1109/Leetcode/tree/master/2269-find-the-k-beauty-of-a-number) |
<!---LeetCode Topics End-->