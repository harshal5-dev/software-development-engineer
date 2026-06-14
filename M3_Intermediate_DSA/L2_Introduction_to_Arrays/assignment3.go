package main

func SolveA3(A []int, B int, C int) []int {
	index := B
	jIndex := C

	for index < jIndex {
		A[index], A[jIndex] = A[jIndex], A[index]
		index++
		jIndex--
	}

	return A
}
