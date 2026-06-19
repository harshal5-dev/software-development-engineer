package main

func SolveA5(A []int) int {
	N := len(A)

	for index := 1; index < N; index++ {
		if A[index-1] > A[index] {
			return 0
		}
	}

	return 1
}
