package main

func SolveA3(A []int, B [][]int) []int {
	N := len(A)
	M := len(B)

	preCount := make([]int, N)
	ans := make([]int, M)

	if A[0]%5 == 0 {
		preCount[0] = 1
	}
	for i := 1; i < N; i++ {
		if A[i]%5 == 0 {
			preCount[i] = preCount[i-1] + 1
		} else {
			preCount[i] = preCount[i-1]
		}
	}

	for i := range B {
		leftIndex := B[i][0]
		rightIndex := B[i][1]
		count := preCount[rightIndex]

		if leftIndex > 0 {
			count -= preCount[leftIndex-1]
		}

		ans[i] = count
	}

	return ans
}
