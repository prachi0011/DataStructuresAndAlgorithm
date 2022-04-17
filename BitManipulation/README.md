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
