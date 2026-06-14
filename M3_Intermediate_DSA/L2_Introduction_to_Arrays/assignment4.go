package main

func SolveA4(A []int) []int {
	N := len(A)
	ans := make([]int, N)

	for index := range A {
		ans[index] = A[N-1-index]
	}

	return ans
}
