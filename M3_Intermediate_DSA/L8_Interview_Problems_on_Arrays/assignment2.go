package main

func SolveA2(A []int, B [][]int) []int {
	N := len(A)
	M := len(B)

	ans := make([]int, M)
	preOdd := make([]int, N)

	for i := 1; i < N; i++ {
		if (i & 1) != 0 {
			preOdd[i] = preOdd[i-1] + A[i]
		} else {
			preOdd[i] = preOdd[i-1]
		}
	}

	for i := range B {
		leftIndex := B[i][0]
		rightIndex := B[i][1]
		sum := preOdd[rightIndex]

		if leftIndex > 0 {
			sum -= preOdd[leftIndex-1]
		}

		ans[i] = sum
	}

	return ans
}
