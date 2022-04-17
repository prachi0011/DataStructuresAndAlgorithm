# Basics Of Bit Manipulation

1. You are given a number n.
2. Print the number produced on setting its i-th bit.
3. Print the number produced on unsetting its j-th bit.
4. Print the number produced on toggling its k-th bit.
5. Also, Check if its m-th bit is on or off. Print 'true' if it is on, otherwise print 'false'.

Constraints
1 <= n <= 10^9
1 <= i <= 9
1 <= j <= 9
1 <= k <= 9
1 <= m <= 9

| Sample Input | Sample Output |
| ------------ | ------------- |
| 57,3,3,3,3  | 57,49,49,true |


# Kernighans Algorithm
1. You are given a number n.
2. You have to count the number of set bits in the given number.

Constraints
1 <= n <= 10^9

| Sample Input | Sample Output |
| ------------ | ------------- |
| 58 | 4 |
| 28007298 | 13 |

# Print Value Of Rsb Mask

1. You are given a number n.
2. You have to print the right-most set bit mask.

- Constraints
1 <= n <= 10^9
Sample Input
58
Sample Output
10

# Josephus Special

1. You are given an integer N which represents the total number of soldiers standing in a circle 
     having position marked from 1 to N.
2. A cruel king wants to execute them but in a different way.
3. He starts executing soldiers from 1st position and proceeds around the circle in clockwise 
     direction.
4. In each step, every second soldier is executed.
5. The elimination proceeds around the circle (which is becoming smaller and smaller as the 
     executed soldiers are removed), until only the last soldier remains, who is given freedom.
6. You have to find the position of that lucky soldier.
- Constraints
1 <= N <= 10^9
| Sample Input | Sample Output |
|------------ | ------------ |
| 4 | 1 |
|7 | 7 |

# Gray Code
- The gray code is a binary numeral system where two successive numbers differ in only one bit.
- An n-bit gray code sequence is a sequence of 2n integers where:
- Every integer is in the inclusive range [0, 2n - 1],
- The first integer is 0,
- An integer appears no more than once in the sequence,
- The binary representation of every pair of adjacent integers differs by exactly one bit, and
- The binary representation of the first and last integers differs by exactly one bit.
- Given an integer n, return any valid n-bit gray code sequence.

```
 Example:
 Input: 2
 Output: [0,1,3,2]
 Explanation:
 00 - 0
 01 - 1
 11 - 3
 10 - 2
 [0,2,3,1] is also a valid gray code sequence.
 00 - 0
 10 - 2
 11 - 3
 01 - 1
 ```
- Constraints:
0<=n<=20
