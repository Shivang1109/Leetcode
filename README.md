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
| [0136-single-number](https://github.com/Shivang1109/Leetcode/tree/master/0136-single-number) |
| [1528-shuffle-string](https://github.com/Shivang1109/Leetcode/tree/master/1528-shuffle-string) |
| [1979-find-greatest-common-divisor-of-array](https://github.com/Shivang1109/Leetcode/tree/master/1979-find-greatest-common-divisor-of-array) |
| [2239-find-closest-number-to-zero](https://github.com/Shivang1109/Leetcode/tree/master/2239-find-closest-number-to-zero) |
## Math
|  |
| ------- |
| [1952-three-divisors](https://github.com/Shivang1109/Leetcode/tree/master/1952-three-divisors) |
| [1979-find-greatest-common-divisor-of-array](https://github.com/Shivang1109/Leetcode/tree/master/1979-find-greatest-common-divisor-of-array) |
| [2235-add-two-integers](https://github.com/Shivang1109/Leetcode/tree/master/2235-add-two-integers) |
## Number Theory
|  |
| ------- |
| [1952-three-divisors](https://github.com/Shivang1109/Leetcode/tree/master/1952-three-divisors) |
| [1979-find-greatest-common-divisor-of-array](https://github.com/Shivang1109/Leetcode/tree/master/1979-find-greatest-common-divisor-of-array) |
## Enumeration
|  |
| ------- |
| [1952-three-divisors](https://github.com/Shivang1109/Leetcode/tree/master/1952-three-divisors) |
## String
|  |
| ------- |
| [0020-valid-parentheses](https://github.com/Shivang1109/Leetcode/tree/master/0020-valid-parentheses) |
| [0709-to-lower-case](https://github.com/Shivang1109/Leetcode/tree/master/0709-to-lower-case) |
| [1528-shuffle-string](https://github.com/Shivang1109/Leetcode/tree/master/1528-shuffle-string) |
## Bit Manipulation
|  |
| ------- |
| [0136-single-number](https://github.com/Shivang1109/Leetcode/tree/master/0136-single-number) |
## Stack
|  |
| ------- |
| [0020-valid-parentheses](https://github.com/Shivang1109/Leetcode/tree/master/0020-valid-parentheses) |
## Binary Search
|  |
| ------- |
| [0035-search-insert-position](https://github.com/Shivang1109/Leetcode/tree/master/0035-search-insert-position) |
<!---LeetCode Topics End-->