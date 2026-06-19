package main

func SolveA7(A *[][]int) {
	N := len(*A)

	for i := 0; i < N-1; i++ {
		for j := i + 1; j < N; j++ {
			(*A)[i][j], (*A)[j][i] = (*A)[j][i], (*A)[i][j]
		}
	}

	for i := range *A {
		s := 0
		e := N - 1

		for s < e {
			(*A)[i][s], (*A)[i][e] = (*A)[i][e], (*A)[i][s]
			s++
			e--
		}
	}
}
