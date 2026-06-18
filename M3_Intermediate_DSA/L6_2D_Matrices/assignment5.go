package main

func Diagonal(A [][]int) [][]int {
	N := len(A)
	M := len(A[0])
	ans := make([][]int, 2*N-1)
	ansIndex := 0

	for j := 0; j < M; j++ {
		x := 0
		y := j

		arr := make([]int, N)
		arrIndex := 0
		for x < N && y >= 0 {
			arr[arrIndex] = A[x][y]
			x++
			y--
			arrIndex++
		}

		ans[ansIndex] = arr
		ansIndex++
	}

	for i := 1; i < N; i++ {
		x := i
		y := M - 1

		arr := make([]int, N)
		arrIndex := 0
		for x < N && y >= 0 {
			arr[arrIndex] = A[x][y]
			x++
			y--
			arrIndex++
		}

		ans[ansIndex] = arr
		ansIndex++
	}

	return ans
}
