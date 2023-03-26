// Michael Cohen
// Midterm Q1-Q2

/*
1. (15 pts) Describe what you think the most appropriate data type would be in Java for each of
the following variables. Include your reasons.

a. A double variable would work because the average level of daily radiation in Blue Bell is usually measured to two decimals.

b. A boolean variable would work because you either have medical insurance (true) or not (false).

c. A string variable would work because it is capable of storing multiple characters like a last name.

d. A integer variable would work because the number of apples in a bag is going to be a whole number.

e. A boolean variable would work because a car is either in working condition (true) or not (false).


2. (20 pts) These declarations have been made in a Java program :
                     int a = 18, b = 2;
                     float c = 3.6;       (A float value should have an f after it, but I answered the questions as if c was correctly initialized as 3.6f.)

a) a % 4    ANSWER: 2
b) ( a % 2) == 0  ANSWER: true
c) c / b    ANSWER: 1.8
d) (c >= 3.1) ? 10 : -10   ANSWER: 10
e) a + 18 / b   ANSWER: 27
f) (a + 19) / b   ANSWER: 18
g) ( b != 2)   ANSWER: false
h) b--;  ANSWER: 1
i) a / b    ANSWER: 9
j) ( c < 3.0) || (b > 1)   ANSWER: 2

*/
public class Q1Q2
{
    public static void main(String[] args)
    {
      int a = 18, b = 2;
      float c = 3.6;

      System.out.println(c / b);
     }
}