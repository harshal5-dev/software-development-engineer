package main

func SolveA1(A [][]int) []int {
	N := len(A)
	M := len(A[0])
	ans := make([]int, M)

	for col := 0; col < M; col++ {
		var sum int
		for row := 0; row < N; row++ {
			sum += A[row][col]
		}
		ans[col] = sum
	}

	return ans
}
