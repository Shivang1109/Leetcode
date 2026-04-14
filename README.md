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
| [0035-search-insert-position](https://github.com/Shivang1109/Leetcode/tree/master/0035-search-insert-position) |
| [0053-maximum-subarray](https://github.com/Shivang1109/Leetcode/tree/master/0053-maximum-subarray) |
| [0136-single-number](https://github.com/Shivang1109/Leetcode/tree/master/0136-single-number) |
| [0268-missing-number](https://github.com/Shivang1109/Leetcode/tree/master/0268-missing-number) |
| [0976-largest-perimeter-triangle](https://github.com/Shivang1109/Leetcode/tree/master/0976-largest-perimeter-triangle) |
| [1528-shuffle-string](https://github.com/Shivang1109/Leetcode/tree/master/1528-shuffle-string) |
| [1979-find-greatest-common-divisor-of-array](https://github.com/Shivang1109/Leetcode/tree/master/1979-find-greatest-common-divisor-of-array) |
| [2239-find-closest-number-to-zero](https://github.com/Shivang1109/Leetcode/tree/master/2239-find-closest-number-to-zero) |
| [2535-difference-between-element-sum-and-digit-sum-of-an-array](https://github.com/Shivang1109/Leetcode/tree/master/2535-difference-between-element-sum-and-digit-sum-of-an-array) |
| [2996-smallest-missing-integer-greater-than-sequential-prefix-sum](https://github.com/Shivang1109/Leetcode/tree/master/2996-smallest-missing-integer-greater-than-sequential-prefix-sum) |
| [3000-maximum-area-of-longest-diagonal-rectangle](https://github.com/Shivang1109/Leetcode/tree/master/3000-maximum-area-of-longest-diagonal-rectangle) |
| [3024-type-of-triangle](https://github.com/Shivang1109/Leetcode/tree/master/3024-type-of-triangle) |
| [3131-find-the-integer-added-to-array-i](https://github.com/Shivang1109/Leetcode/tree/master/3131-find-the-integer-added-to-array-i) |
| [3550-smallest-index-with-digit-sum-equal-to-index](https://github.com/Shivang1109/Leetcode/tree/master/3550-smallest-index-with-digit-sum-equal-to-index) |
| [3678-smallest-absent-positive-greater-than-average](https://github.com/Shivang1109/Leetcode/tree/master/3678-smallest-absent-positive-greater-than-average) |
| [3688-bitwise-or-of-even-numbers-in-an-array](https://github.com/Shivang1109/Leetcode/tree/master/3688-bitwise-or-of-even-numbers-in-an-array) |
| [3701-compute-alternating-sum](https://github.com/Shivang1109/Leetcode/tree/master/3701-compute-alternating-sum) |
| [3774-absolute-difference-between-maximum-and-minimum-k-elements](https://github.com/Shivang1109/Leetcode/tree/master/3774-absolute-difference-between-maximum-and-minimum-k-elements) |
## Math
|  |
| ------- |
| [0009-palindrome-number](https://github.com/Shivang1109/Leetcode/tree/master/0009-palindrome-number) |
| [0069-sqrtx](https://github.com/Shivang1109/Leetcode/tree/master/0069-sqrtx) |
| [0231-power-of-two](https://github.com/Shivang1109/Leetcode/tree/master/0231-power-of-two) |
| [0258-add-digits](https://github.com/Shivang1109/Leetcode/tree/master/0258-add-digits) |
| [0268-missing-number](https://github.com/Shivang1109/Leetcode/tree/master/0268-missing-number) |
| [0326-power-of-three](https://github.com/Shivang1109/Leetcode/tree/master/0326-power-of-three) |
| [0342-power-of-four](https://github.com/Shivang1109/Leetcode/tree/master/0342-power-of-four) |
| [0504-base-7](https://github.com/Shivang1109/Leetcode/tree/master/0504-base-7) |
| [0976-largest-perimeter-triangle](https://github.com/Shivang1109/Leetcode/tree/master/0976-largest-perimeter-triangle) |
| [1952-three-divisors](https://github.com/Shivang1109/Leetcode/tree/master/1952-three-divisors) |
| [1979-find-greatest-common-divisor-of-array](https://github.com/Shivang1109/Leetcode/tree/master/1979-find-greatest-common-divisor-of-array) |
| [2235-add-two-integers](https://github.com/Shivang1109/Leetcode/tree/master/2235-add-two-integers) |
| [2535-difference-between-element-sum-and-digit-sum-of-an-array](https://github.com/Shivang1109/Leetcode/tree/master/2535-difference-between-element-sum-and-digit-sum-of-an-array) |
| [2600-k-items-with-the-maximum-sum](https://github.com/Shivang1109/Leetcode/tree/master/2600-k-items-with-the-maximum-sum) |
| [3024-type-of-triangle](https://github.com/Shivang1109/Leetcode/tree/master/3024-type-of-triangle) |
| [3516-find-closest-person](https://github.com/Shivang1109/Leetcode/tree/master/3516-find-closest-person) |
| [3536-maximum-product-of-two-digits](https://github.com/Shivang1109/Leetcode/tree/master/3536-maximum-product-of-two-digits) |
| [3550-smallest-index-with-digit-sum-equal-to-index](https://github.com/Shivang1109/Leetcode/tree/master/3550-smallest-index-with-digit-sum-equal-to-index) |
| [3658-gcd-of-odd-and-even-sums](https://github.com/Shivang1109/Leetcode/tree/master/3658-gcd-of-odd-and-even-sums) |
## Number Theory
|  |
| ------- |
| [0258-add-digits](https://github.com/Shivang1109/Leetcode/tree/master/0258-add-digits) |
| [1952-three-divisors](https://github.com/Shivang1109/Leetcode/tree/master/1952-three-divisors) |
| [1979-find-greatest-common-divisor-of-array](https://github.com/Shivang1109/Leetcode/tree/master/1979-find-greatest-common-divisor-of-array) |
| [3658-gcd-of-odd-and-even-sums](https://github.com/Shivang1109/Leetcode/tree/master/3658-gcd-of-odd-and-even-sums) |
## Enumeration
|  |
| ------- |
| [1952-three-divisors](https://github.com/Shivang1109/Leetcode/tree/master/1952-three-divisors) |
## String
|  |
| ------- |
| [0020-valid-parentheses](https://github.com/Shivang1109/Leetcode/tree/master/0020-valid-parentheses) |
| [0504-base-7](https://github.com/Shivang1109/Leetcode/tree/master/0504-base-7) |
| [0657-robot-return-to-origin](https://github.com/Shivang1109/Leetcode/tree/master/0657-robot-return-to-origin) |
| [0709-to-lower-case](https://github.com/Shivang1109/Leetcode/tree/master/0709-to-lower-case) |
| [1528-shuffle-string](https://github.com/Shivang1109/Leetcode/tree/master/1528-shuffle-string) |
| [3019-number-of-changing-keys](https://github.com/Shivang1109/Leetcode/tree/master/3019-number-of-changing-keys) |
## Bit Manipulation
|  |
| ------- |
| [0136-single-number](https://github.com/Shivang1109/Leetcode/tree/master/0136-single-number) |
| [0231-power-of-two](https://github.com/Shivang1109/Leetcode/tree/master/0231-power-of-two) |
| [0268-missing-number](https://github.com/Shivang1109/Leetcode/tree/master/0268-missing-number) |
| [0342-power-of-four](https://github.com/Shivang1109/Leetcode/tree/master/0342-power-of-four) |
| [3688-bitwise-or-of-even-numbers-in-an-array](https://github.com/Shivang1109/Leetcode/tree/master/3688-bitwise-or-of-even-numbers-in-an-array) |
## Stack
|  |
| ------- |
| [0020-valid-parentheses](https://github.com/Shivang1109/Leetcode/tree/master/0020-valid-parentheses) |
## Binary Search
|  |
| ------- |
| [0035-search-insert-position](https://github.com/Shivang1109/Leetcode/tree/master/0035-search-insert-position) |
| [0069-sqrtx](https://github.com/Shivang1109/Leetcode/tree/master/0069-sqrtx) |
| [0268-missing-number](https://github.com/Shivang1109/Leetcode/tree/master/0268-missing-number) |
## Hash Table
|  |
| ------- |
| [0268-missing-number](https://github.com/Shivang1109/Leetcode/tree/master/0268-missing-number) |
| [2996-smallest-missing-integer-greater-than-sequential-prefix-sum](https://github.com/Shivang1109/Leetcode/tree/master/2996-smallest-missing-integer-greater-than-sequential-prefix-sum) |
| [3678-smallest-absent-positive-greater-than-average](https://github.com/Shivang1109/Leetcode/tree/master/3678-smallest-absent-positive-greater-than-average) |
## Sorting
|  |
| ------- |
| [0268-missing-number](https://github.com/Shivang1109/Leetcode/tree/master/0268-missing-number) |
| [0976-largest-perimeter-triangle](https://github.com/Shivang1109/Leetcode/tree/master/0976-largest-perimeter-triangle) |
| [2996-smallest-missing-integer-greater-than-sequential-prefix-sum](https://github.com/Shivang1109/Leetcode/tree/master/2996-smallest-missing-integer-greater-than-sequential-prefix-sum) |
| [3024-type-of-triangle](https://github.com/Shivang1109/Leetcode/tree/master/3024-type-of-triangle) |
| [3536-maximum-product-of-two-digits](https://github.com/Shivang1109/Leetcode/tree/master/3536-maximum-product-of-two-digits) |
| [3774-absolute-difference-between-maximum-and-minimum-k-elements](https://github.com/Shivang1109/Leetcode/tree/master/3774-absolute-difference-between-maximum-and-minimum-k-elements) |
## Simulation
|  |
| ------- |
| [0258-add-digits](https://github.com/Shivang1109/Leetcode/tree/master/0258-add-digits) |
| [0657-robot-return-to-origin](https://github.com/Shivang1109/Leetcode/tree/master/0657-robot-return-to-origin) |
| [3688-bitwise-or-of-even-numbers-in-an-array](https://github.com/Shivang1109/Leetcode/tree/master/3688-bitwise-or-of-even-numbers-in-an-array) |
| [3701-compute-alternating-sum](https://github.com/Shivang1109/Leetcode/tree/master/3701-compute-alternating-sum) |
## Recursion
|  |
| ------- |
| [0231-power-of-two](https://github.com/Shivang1109/Leetcode/tree/master/0231-power-of-two) |
| [0326-power-of-three](https://github.com/Shivang1109/Leetcode/tree/master/0326-power-of-three) |
| [0342-power-of-four](https://github.com/Shivang1109/Leetcode/tree/master/0342-power-of-four) |
## Greedy
|  |
| ------- |
| [0976-largest-perimeter-triangle](https://github.com/Shivang1109/Leetcode/tree/master/0976-largest-perimeter-triangle) |
| [2600-k-items-with-the-maximum-sum](https://github.com/Shivang1109/Leetcode/tree/master/2600-k-items-with-the-maximum-sum) |
## Divide and Conquer
|  |
| ------- |
| [0053-maximum-subarray](https://github.com/Shivang1109/Leetcode/tree/master/0053-maximum-subarray) |
## Dynamic Programming
|  |
| ------- |
| [0053-maximum-subarray](https://github.com/Shivang1109/Leetcode/tree/master/0053-maximum-subarray) |
<!---LeetCode Topics End-->