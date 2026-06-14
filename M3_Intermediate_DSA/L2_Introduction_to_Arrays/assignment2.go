package main

func Solve2(A []int, B int) int {
	N := len(A)

	for index := 0; index < N-1; index++ {
		for jIndex := index + 1; jIndex < N; jIndex++ {
			if A[index]+A[jIndex] == B {
				return 1
			}
		}
	}

	return 0
}
