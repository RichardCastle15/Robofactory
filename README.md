# Robofactory
## The question:

Hero owns a factory. There are n robots working at the factory. The robots are numbered 0 through n-1.

Today, exactly one of the robots became corrupted. Hero has decided to give all robots a test that may determine the number of the corrupted robot. The test works as follows: For each x from 0 to n-1, in order, Hero tells robot x a positive integer and the robot answers whether the integer is odd or even. Each normal robot will always give the correct answer. The corrupted robot may sometimes give the opposite answer. More precisely: the corrupted robot will answer incorrectly if and only if the previous robot was given an odd number. In particular, if robot 0 is the corrupted robot, it will give the correct answer (as there is no previous robot).

You are given a log of the test: a int[] query and a String[] answer, each with n elements. For each x, query[x] is the positive integer given to robot x, and answer[x] is the answer given by the robot: either "Odd" or "Even".

It is guaranteed that the situation described by query and answer could have occurred as described above. If it is possible to determine the index of the corrupted robot, return it. Otherwise, return -1.

## Constraints
-	n will be between 1 and 50, inclusive.
-	query and answer will contain exactly n elements.
-	Each element in query will be between 1 and 1000, inclusive.
-	Each element in answer will be either "Odd" or "Even".
-	It is guaranteed that there will be at least one possible number of the corrupted robot.
