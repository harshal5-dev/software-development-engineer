package main

func printClockwise(A *[][]int, i, j, N, val int) int {

	if N == 1 {
		(*A)[i][j] = val
		return val
	}

	for k := 1; k < N; k++ {
		(*A)[i][j] = val
		j++
		val++
	}

	for k := 1; k < N; k++ {
		(*A)[i][j] = val
		i++
		val++
	}

	for k := 1; k < N; k++ {
		(*A)[i][j] = val
		j--
		val++
	}

	for k := 1; k < N; k++ {
		(*A)[i][j] = val
		i--
		val++
	}

	return val
}

func GenerateMatrix(A int) [][]int {
	ans := make([][]int, A)

	for i := range ans {
		ans[i] = make([]int, A)
	}

	i := 0
	j := 0
	val := 1

	for A > 0 {
		val = printClockwise(&ans, i, j, A, val)
		i++
		j++
		A -= 2
	}

	return ans
}
