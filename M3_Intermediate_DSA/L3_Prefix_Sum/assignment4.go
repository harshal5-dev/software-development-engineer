package main

func SolveA4(A []int) []int {
	for index := 1; index < len(A); index++ {
		A[index] = A[index-1] + A[index]
	}

	return A
}
