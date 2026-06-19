package main

func SolveA6(A [][]int) [][]int {
	N := len(A)
	M := len(A[0])

	ans := make([][]int, M)
	for i := 0; i < M; i++ {
		ans[i] = make([]int, N)
	}

	for j := 0; j < M; j++ {
		for i := 0; i < N; i++ {
			ans[j][i] = A[i][j]
		}
	}
	return ans
}
