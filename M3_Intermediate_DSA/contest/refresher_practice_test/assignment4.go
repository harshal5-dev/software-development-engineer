package main

func SolveA4(A []int) int {
	N := len(A)
	ans := 0

	for index := 1; index < N; index += 2 {
		ans += A[index]
	}

	return ans
}
