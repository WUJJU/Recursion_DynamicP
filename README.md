# Recursion_DynamicP
Recursion from top-bottom may have advantage, so think it comparing bottom-up strategy.

Dynamic programming, initial size +1

#double dimension array

int [] [] array={{1,0},{0,1}}; every {} is a row

for(int row: array) can iterat the double dimension array

#greedy alogrithmn VS dynamic programming

1 both require Optimal Substructure: means global optimal solution contains Optimal subproblem

2 greedy need greedy choice: local greedy optimal choice can lead to global optimal
but optimal substructure may need compare with or without items, it's not greedy optimal. Without comparision, some Optimal substurcutre can't be found like 0-1 bag problem 

3. dynamic programming is thinking from top-to-bottom, then build from bottom to top.
there are overlaping subproblem.

# recursion 

all if condition should use return, then it will return back.

# Hanoi Problem

Use Base and Build Approach, use one of three stack as buffer. 

Think reversely, the last item put on destination. The left (N-1) is another N, Recursively do it. 



